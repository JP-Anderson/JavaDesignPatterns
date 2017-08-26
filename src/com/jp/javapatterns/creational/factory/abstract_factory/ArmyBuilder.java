package com.jp.javapatterns.creational.factory.abstract_factory;

/**
 * Created by Jp on 26/08/2017.
 */
public class ArmyBuilder {

	private AbstractUnitFactory unitFactory;

	public ArmyBuilder(AbstractUnitFactory concreteUnitFactory) {
		unitFactory = concreteUnitFactory;
	}

	public Unit buildInfantryUnit() {
		return unitFactory.createInfantryUnit();
	}

	public Unit buildCavalryUnit() {
		return unitFactory.createCavalryUnit();
	}

}
