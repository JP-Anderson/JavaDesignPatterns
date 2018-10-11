package com.jp.javapatterns.structural.decorator;

/**
 * This is the base decorator class providing the template which all decorators
 * must follow. It contains the composite relationship to the parent following the
 * same interface, which can be either the core class, or another decorator.
 *
 * The attack() method will be called on a decorator which contains a chain of 0
 * or more other decorators, ending in the core class which follows the same
 * decorator interface.
 */
public abstract class WeaponDecorator implements WeaponInterface {

	// Composition relationship to other decorators ("has a")
	private WeaponInterface decoratedWeapon;

	public WeaponDecorator(WeaponInterface decoratee) {
		decoratedWeapon = decoratee;
	}

	@Override
	public Attack attack(Attack attack) {
		return decoratedWeapon.attack(attack);
	}

}
