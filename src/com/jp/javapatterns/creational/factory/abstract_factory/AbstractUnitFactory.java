package com.jp.javapatterns.creational.factory.abstract_factory;

/**
 * This is the Abstract Factory interface. It contains the methods for
 * producing objects. However a Factory class extending this is
 * needed to actually produce the objects. This means that different
 * implementations of this class can produce different objects, so the
 * client can change the behaviour of the program based on the selected
 * concrete factory.
 */
public interface AbstractUnitFactory {

	Unit createInfantryUnit();

	Unit createCavalryUnit();

}
