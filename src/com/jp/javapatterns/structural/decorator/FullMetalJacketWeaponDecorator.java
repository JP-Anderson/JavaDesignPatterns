package com.jp.javapatterns.structural.decorator;

/**
 * This is a concrete decorator class which does the actual behaviour 'decoration'.
 * In this case, we add extra damage to an attack.
 */
public class FullMetalJacketWeaponDecorator extends WeaponDecorator {

	public FullMetalJacketWeaponDecorator(WeaponInterface decoratee) {
		super(decoratee);
	}

	@Override
	public Attack attack(Attack attack) {
		// Delegate to base class
		Attack newAttack = super.attack(attack);
		// Add or decorate custom functionality
		return
				new Attack(
						(int) (newAttack.heavyDamage * 3),
						(int) (newAttack.lightDamage * 1.1),
						newAttack.accuracy
				);
	}

}
