package com.jp.javapatterns.creational.factory.abstract_factory.forest;

import com.jp.javapatterns.creational.factory.abstract_factory.AbstractUnitFactory;
import com.jp.javapatterns.creational.factory.abstract_factory.Unit;

/**
 * Created by Jp on 26/08/2017.
 */
public class ForestUnitFactory implements AbstractUnitFactory {

	@Override
	public Unit createInfantryUnit() {
		return new ElfWarrior();
	}

	@Override
	public Unit createCavalryUnit() {
		return new UnicornRider();
	}

}
