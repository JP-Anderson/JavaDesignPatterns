package com.jp.javapatterns.structural.decorator;

/**
 * The core class, i.e. the class being decorated. Extends the same interface as the
 * decoration classes.
 */
public class CoreWeapon implements WeaponInterface {

	// These values wouldn't be hardcoded, but keeping it simple for Decorator example
	public final int baseHeavyDamage = 100;
	public final int baseLightDamage = 50;
	public final int baseAccuracy = 100;

	@Override
	public Attack attack(Attack attack) {
		Attack newAttack =
				new Attack(
						attack.heavyDamage + baseHeavyDamage,
						attack.lightDamage + baseLightDamage,
						attack.accuracy + baseAccuracy
				);
		return newAttack;
	}

}
