package com.jp.javapatterns.structural.adapter.adaptee;

/**
 * This is our original/legacy interface, the one we will be writing an adaptor for.
 * Obviously this is a toy example, so only three input examples are given.
 * The essence of the adapter pattern could apply to an interface with a single method.
 */
public interface KeyboardAndMouse {

	void clickRightMouseButton();

	void pressRKey();

	void pressSpaceBar();

}
