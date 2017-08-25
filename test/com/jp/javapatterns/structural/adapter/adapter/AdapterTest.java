package com.jp.javapatterns.structural.adapter.adapter;

import com.jp.javapatterns.structural.adapter.adaptee.ConcreteKeyboardAndMouse;
import com.jp.javapatterns.structural.adapter.adaptee.FirstPersonShooterEngine;
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

		/* We can use the keyboard and mouse to send actions to the engine*/
		keyboardAndMouse.clickRightMouseButton();
		assertEquals(engine.getAction(0), new String("SHOOT"));

		/* We can also use the slightly different adapter interface implemented
		*  by the gamepad controller to trigger the keyboard/mouse interface methods*/
		gamePadAdaptor.pullRightTrigger();
		assertEquals(engine.getAction(1), new String("SHOOT"));

		keyboardAndMouse.pressRKey();
		assertEquals(engine.getAction(2), new String("RELOAD"));

		gamePadAdaptor.pressX();
		assertEquals(engine.getAction(3), new String("RELOAD"));

		keyboardAndMouse.pressSpaceBar();
		assertEquals(engine.getAction(4), new String("JUMP"));

		gamePadAdaptor.pressA();
		assertEquals(engine.getAction(5), new String("JUMP"));

	}

}