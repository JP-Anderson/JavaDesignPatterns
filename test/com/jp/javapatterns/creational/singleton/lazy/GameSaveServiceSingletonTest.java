package com.jp.javapatterns.creational.singleton.lazy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 10/08/2017.
 */
class GameSaveServiceSingletonTest {

	@Test
	void getInstanceReturnsSingleInstance() {
		GameSaveService service1 = GameSaveService.getInstance();
		GameSaveService service2 = GameSaveService.getInstance();
		assertEquals(service1, service2);
	}

	@Test
	void instancesReturnSameSaves() {
		GameSaveService service1 = GameSaveService.getInstance();
		GameSaveService service2 = GameSaveService.getInstance();
		ArrayList<GameSaveService.CharacterSave> saves1 = service1.getSaves();
		ArrayList<GameSaveService.CharacterSave> saves2 = service2.getSaves();
		saves1.remove(1);
		assertEquals(saves1.size(), saves2.size());
	}

}