package com.jp.javapatterns.structural.decorator;

/**
 * This is a concrete decorator class which does the actual behaviour 'decoration'.
 * In this case, we add extra accuracy to an attack.
 */
public class ScopeWeaponDecorator extends WeaponDecorator {

	public ScopeWeaponDecorator(WeaponInterface decoratee) {
		super(decoratee);
	}

	@Override
	public Attack attack(Attack attack) {
		// Delegate to base class
		Attack newAttack = super.attack(attack);
		// Add or decorate custom functionality
		return
				new Attack(
						newAttack.heavyDamage,
						newAttack.lightDamage,
						newAttack.accuracy + 500
				);
	}

}
