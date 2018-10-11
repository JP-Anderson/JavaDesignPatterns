package com.jp.javapatterns.structural.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 11/10/2018.
 */
public class DecoratorTests {

	@Test
	public void CanApplySingleDecorator() {
		WeaponInterface undecoratedWeapon = new CoreWeapon();
		WeaponInterface decoratedWeapon = new FullMetalJacketWeaponDecorator(new CoreWeapon());

		Attack baseAttack = new Attack(50, 50, 50);
		Attack normalAttack = undecoratedWeapon.attack(baseAttack);
		Attack decoratedAttack = decoratedWeapon.attack(baseAttack);

		assertTrue(decoratedAttack.heavyDamage > normalAttack.heavyDamage);
		assertEquals(decoratedAttack.accuracy, normalAttack.accuracy);
	}

	@Test
	public void CanApplyNestedDecorators() {
		WeaponInterface undecoratedWeapon = new CoreWeapon();
		WeaponInterface decoratedWeapon =
				new ScopeWeaponDecorator(
					new FullMetalJacketWeaponDecorator(
							new CoreWeapon()
					)
				);

		Attack baseAttack = new Attack(50, 50, 50);
		Attack normalAttack = undecoratedWeapon.attack(baseAttack);
		Attack decoratedAttack = decoratedWeapon.attack(baseAttack);

		assertTrue(decoratedAttack.heavyDamage > normalAttack.heavyDamage);
		assertTrue(decoratedAttack.accuracy > normalAttack.accuracy);
	}
}
