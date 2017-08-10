package com.jp.javapatterns.creational.singleton.lazy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *  The GameSaveService class is used to manage loading and saving
 *  of game state files.
 *
 *  It uses lazy instantiation, to avoid preparing the class for loading/saving
 *  a game until necessary.
 *
 *  The Singleton is also thread-safe, meaning multiple concurrent thread accesses
 *  will never construct more than one Singleton class.
 */
public class GameSaveService {

	/* The ONLY instance of GameSaveService! */
	private static GameSaveService instance;

	/* Private constructor to prevent construction from other classes. */
	private GameSaveService() {
		SaveLoader.loadSaves();
	};

	/* This function is used to create/retrieve an instance from outside the class.
	*  Only one thread can run within the synchronized block and create an instance.
	*  Two if statements are used to avoid a performance hit of synchronization
	*  when entering the function if the Singleton has already been constructed.
	* */
	public static GameSaveService getInstance() {
		if (instance == null) {
			synchronized (GameSaveService.class) {
				if (instance == null) instance = new GameSaveService();
			}
		}
		return instance;
	}

	public ArrayList<CharacterSave> getSaves() {
		return SaveLoader.getSaves();
	}


	/* Very simple class to represent character data to be saved. */
	public static class CharacterSave {

		private final String name;
		private final int attack;
		private final int defense;
		private final String currentLocation;
		private final int currentGold;

		private CharacterSave(String name, int attack, int defense, String currentLocation, int currentGold) {
			this.name = name;
			this.attack = attack;
			this.defense = defense;
			this.currentLocation = currentLocation;
			this.currentGold = currentGold;
		}

	}

	/* Simple class to represent loading class data */
	private static class SaveLoader {

		public static ArrayList<CharacterSave> saves = null;

		public static ArrayList<CharacterSave> getSaves() {
			if (saves == null) loadSaves();
			return saves;
		}

		private static void loadSaves() {
			saves = new ArrayList<>();
			String csvFile = "./data/singleton/saves.csv";
			BufferedReader br = null;
			String line;

			try {

				br = new BufferedReader(new FileReader(csvFile));
				while ((line = br.readLine()) != null) {
					String[] values = line.split(",");
					CharacterSave save = new CharacterSave(
							values[0],
							Integer.parseInt(values[1]),
							Integer.parseInt(values[2]),
							values[3],
							Integer.parseInt(values[4]));
					saves.add(save);

				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
