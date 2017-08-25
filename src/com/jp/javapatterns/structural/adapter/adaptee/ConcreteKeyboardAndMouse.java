package com.jp.javapatterns.structural.adapter.adaptee;

/**
 * Created by Jp on 25/08/2017.
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
