package com.jp.javapatterns.structural.adapter.adaptee;

/**
 * This is the concrete class implementing the Keyboard/Mouse interface.
 * We will instantiate this class and use it to pass input to the 'engine'.
 * NOTE: the KeyboardAndMouse interface is the existing interface that we need
 * to write the adapter for. The adapter interface is GamePad
 */
public class ConcreteKeyboardAndMouse implements KeyboardAndMouse {

	FirstPersonShooterInput gameInput;

	public ConcreteKeyboardAndMouse(FirstPersonShooterInput input) {
		gameInput = input;
	}

	@Override
	public void clickRightMouseButton() {
		gameInput.shootWeapon();
	}

	@Override
	public void pressRKey() {
		gameInput.reloadWeapon();
	}

	@Override
	public void pressSpaceBar() {
		gameInput.jump();
	}

}
