package com.jp.javapatterns.structural.adapter.adapter;

import com.jp.javapatterns.structural.adapter.adaptee.KeyboardAndMouse;

/**
 * Created by Jp on 25/08/2017.
 */
public class ConcreteGamePad implements GamePad {

	private KeyboardAndMouse adaptedComputerHardware;

	public ConcreteGamePad(KeyboardAndMouse keyboardAndMouseInterfaceToAdapt) {
		adaptedComputerHardware = keyboardAndMouseInterfaceToAdapt;
	}

	@Override
	public void pullRightTrigger() {
		adaptedComputerHardware.clickRightMouseButton();
	}

	@Override
	public void pressX() {
		adaptedComputerHardware.pressRKey();
	}

	@Override
	public void pressA() {
		adaptedComputerHardware.pressSpaceBar();
	}

}
