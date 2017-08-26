package com.jp.javapatterns.creational.factory.abstract_factory.undead;

import com.jp.javapatterns.creational.factory.abstract_factory.AbstractUnitFactory;
import com.jp.javapatterns.creational.factory.abstract_factory.Unit;

/**
 * Created by Jp on 26/08/2017.
 */
public class UndeadUnitFactory implements AbstractUnitFactory {

	@Override
	public Unit createInfantryUnit() {
		return new SkeletonWarrior();
	}

	@Override
	public Unit createCavalryUnit() {
		return new WraithRider();
	}

}
