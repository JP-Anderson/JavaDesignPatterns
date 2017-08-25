package com.jp.javapatterns.structural.adapter.adapter;

import com.jp.javapatterns.structural.adapter.adaptee.KeyboardAndMouse;

/**
 * This is the key class, the adapter, in the adapter pattern. The main thing
 * to note is that functions on this class are being passed to functions on the
 * old adapted interface (KeyboardAndMouse.java)
 *
 * There are two types of Adapter pattern, Class and Object. Class Adapter involves
 * the adapter class extending an adapted class. Object Adapter gives the
 * adapter class a reference to the adapted interface/class.
 *
 * As Java is single inheritance, Object Adapters are very useful as we can follow
 * the adapter pattern and our class can still extend another class. Also, as
 * we do not need to extend the adapter as with Class Adapters, we can refer to an
 * adapter as a class or interface. So an Object Adapter using an interface allows
 * for much greater flexibility.
 */
public class ConcreteGamePad implements GamePad {

	/* This is the reference to the adapted interface. */
	private KeyboardAndMouse adaptedComputerHardware;

	public ConcreteGamePad(KeyboardAndMouse keyboardAndMouseInterfaceToAdapt) {
		adaptedComputerHardware = keyboardAndMouseInterfaceToAdapt;
	}

	/* In our gamepad methods below, we simply just pass on the call to the relevant
	 * method in our adapted keyboard/mouse controller */

	@Override
	public void pullRightTrigger() {
		if (adaptedComputerHardware != null)
			adaptedComputerHardware.clickRightMouseButton();
	}

	@Override
	public void pressX() {
		if (adaptedComputerHardware != null)
			adaptedComputerHardware.pressRKey();
	}

	@Override
	public void pressA() {
		if (adaptedComputerHardware != null)
			adaptedComputerHardware.pressSpaceBar();
	}

}
