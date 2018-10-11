package com.jp.javapatterns.structural.decorator;

/**
 * Simple class to represent an attack that has been made.
 */
public class Attack {

	public final int heavyDamage;
	public final int lightDamage;
	public final int accuracy;

	public Attack(int heavyDamage, int lightDamage, int accuracy) {
		this.heavyDamage = heavyDamage;
		this.lightDamage = lightDamage;
		this.accuracy = accuracy;
	}

}
