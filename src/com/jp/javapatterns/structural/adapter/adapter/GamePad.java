package com.jp.javapatterns.structural.adapter.adapter;

/**
 * This is a simplified interface for a console gamepad controller.
 * Obviously this is a toy example, so only three input examples are given.
 * The essence of the adapter pattern could apply to an interface with a single method.
 * The main adapter class resides in ConcreteGamePad.java, an implementation of this interface.
 */
public interface GamePad {

	void pullRightTrigger();

	void pressX();

	void pressA();

}
