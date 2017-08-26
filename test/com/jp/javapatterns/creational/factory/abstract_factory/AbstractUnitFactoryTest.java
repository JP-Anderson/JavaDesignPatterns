package com.jp.javapatterns.creational.factory.abstract_factory;

import com.jp.javapatterns.creational.factory.abstract_factory.forest.ForestUnitFactory;
import com.jp.javapatterns.creational.factory.abstract_factory.undead.UndeadUnitFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 26/08/2017.
 */
class AbstractUnitFactoryTest {

	@Test
	public void forestFactoryCreatesForestInfantryUnit() {
		AbstractUnitFactory forestUnitFactory = new ForestUnitFactory();
		ArmyBuilder armyBuilder = new ArmyBuilder(forestUnitFactory);
		Unit forestInfantry = armyBuilder.buildInfantryUnit();
		assertEquals(forestInfantry.factionName, "Forest");
		assertEquals(forestInfantry.unitName, "Elf Warrior");
	}

	@Test
	public void undeadFactoryCreatesUndeadInfantryUnit() {
		AbstractUnitFactory undeadUnitFactory = new UndeadUnitFactory();
		ArmyBuilder armyBuilder = new ArmyBuilder(undeadUnitFactory);
		Unit undeadInfantry = armyBuilder.buildInfantryUnit();
		assertEquals(undeadInfantry.factionName, "Undead");
		assertEquals(undeadInfantry.unitName, "Skeleton Warrior");
	}

}