package com.jp.javapatterns.creational.factory.factory;

/**
 * This is the Factory class we use to build instances of Enemy.
 *
 * The main advantage of a Factory is the decoupling of client code
 * to the instantiation of our objects. E.g. we can change an Enemy
 * implementation without impacting code using an enemy.
 *
 * Factory also provides extensible code, as the code will work with
 * future objects satisfying the abstract base class.
 */
public class EnemyFactory {

	/* getEnemy takes a String and returns an enemy of any type that matches the String
	 * Note it is a static method, but the class could also be a Singleton. */
	public static Enemy getEnemy(String enemyType) {
		if (enemyType.equalsIgnoreCase("GOBLIN")) {
			return new Goblin();
		} else if (enemyType.equalsIgnoreCase("TROLL")) {
			return new Troll();
		} else if (enemyType.equalsIgnoreCase("WITCH")) {
			return new Witch();
		}
		return null;
	}

}
