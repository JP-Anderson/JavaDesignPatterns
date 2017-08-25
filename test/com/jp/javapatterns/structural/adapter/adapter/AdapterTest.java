package com.jp.javapatterns.structural.adapter.adapter;

import com.jp.javapatterns.structural.adapter.adaptee.ConcreteKeyboardAndMouse;
import com.jp.javapatterns.structural.adapter.adaptee.FirstPersonShooterEngine;
import com.jp.javapatterns.structural.adapter.adaptee.FirstPersonShooterInput;
import com.jp.javapatterns.structural.adapter.adaptee.KeyboardAndMouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 25/08/2017.
 */
class AdapterTest {

	@Test
	public void CanExecuteComputerGameCommandsWithAdaptedConsoleGamePad() {
		/* Set up our simple First Person Shooter 'engine' */
		FirstPersonShooterEngine engine = new FirstPersonShooterEngine();
		/* Pass in the engine into our keyboard and mouse class */
		KeyboardAndMouse keyboardAndMouse = new ConcreteKeyboardAndMouse(engine);
		/* Pass in the keyboard and mouse controls to be adapted to our gamepad */
		GamePad gamePadAdaptor = new ConcreteGamePad(keyboardAndMouse);

		/* Now we can use the respective buttons on the keyboard/mouse and gamepad to carry
		*  out the same actions in the game engine. */
		keyboardAndMouse.clickRightMouseButton();
		assertEquals(engine.actions.get(0), new String("SHOOT"));

		gamePadAdaptor.pullRightTrigger();
		assertEquals(engine.actions.get(1), new String("SHOOT"));

		keyboardAndMouse.pressRKey();
		assertEquals(engine.actions.get(2), new String("RELOAD"));

		gamePadAdaptor.pressX();
		assertEquals(engine.actions.get(3), new String("RELOAD"));

		keyboardAndMouse.pressSpaceBar();
		assertEquals(engine.actions.get(4), new String("JUMP"));

		gamePadAdaptor.pressA();
		assertEquals(engine.actions.get(5), new String("JUMP"));

	}

}