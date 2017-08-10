package com.jp.javapatterns.creational.singleton.enumeration;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 10/08/2017.
 */
class ScoreCounterTest {

	@Test
	void scoreCounterCannotBeInitializedThroughReflection() {
		Constructor[] constructors = ScoreCounter.class.getDeclaredConstructors();
		ScoreCounter instance = null;
		Throwable illegalArgumentException = null;
		try {
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				illegalArgumentException = assertThrows(IllegalArgumentException.class, () ->
						constructor.newInstance());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(instance == null);
		assertEquals("Cannot reflectively create enum objects", illegalArgumentException.getMessage());
	}

	@Test
	void scoreCounterCanCountScore() {
		ScoreCounter.addToScore(10);
		assertEquals(ScoreCounter.getScore(), 10);
		ScoreCounter.addToScore(123);
		assertEquals(ScoreCounter.getScore(), 133);
	}

}