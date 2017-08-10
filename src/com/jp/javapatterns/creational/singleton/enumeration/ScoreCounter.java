package com.jp.javapatterns.creational.singleton.enumeration;

/**
 * The ScoreCounter class is used to track a players score.
 *
 * Enum creation is handled by the JVM, therefore this class doesn't
 * allow for lazy initialization. However, this class is lightweight
 * so it isn't really an issue.
 *
 * This Singleton method is also impossible to defeat with reflection
 * due to the way JVM handles enums.
 */
public enum ScoreCounter {

	INSTANCE;

	private static int score = 0;

	public static int getScore() { return score; }

	public static void addToScore(int points) { score += points; }

}
