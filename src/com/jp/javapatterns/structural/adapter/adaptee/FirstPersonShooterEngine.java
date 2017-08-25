package com.jp.javapatterns.structural.adapter.adaptee;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of interface to simulate game input and resulting output
 */
public class FirstPersonShooterEngine implements FirstPersonShooterInput {

	/* This list will contain the simulated actions carried out based
	 * on controller input. In this simple example, a string is used
	 * instead of some custom action class.
	 */
	private List<String> actions = new ArrayList<>();

	@Override
	public void shootWeapon() {
		actions.add("SHOOT");
	}

	@Override
	public void reloadWeapon() {
		actions.add("RELOAD");
	}

	@Override
	public void jump() {
		actions.add("JUMP");
	}

	public String getAction(int index) {
		return actions.get(index);
	}
}
