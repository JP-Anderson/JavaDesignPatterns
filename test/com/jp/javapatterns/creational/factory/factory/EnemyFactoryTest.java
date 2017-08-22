package com.jp.javapatterns.creational.factory.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 22/08/2017.
 */
class EnemyFactoryTest {

	@Test
	void getEnemyReturnsGoblinForGoblin() {
		assertTrue(EnemyFactory.getEnemy("GOBLIN") instanceof Goblin);
	}

	@Test
	void getEnemyReturnsTrollForTroll() {
		assertTrue(EnemyFactory.getEnemy("TROLL") instanceof Troll);
	}

	@Test
	void getEnemyReturnsWitchForWitch() {
		assertTrue(EnemyFactory.getEnemy("WITCH") instanceof Witch);
	}

	@Test
	void getEnemyReturnsNullForUnrecognisedEnemy() {
		assertNull(EnemyFactory.getEnemy("GRUE"));
	}

}