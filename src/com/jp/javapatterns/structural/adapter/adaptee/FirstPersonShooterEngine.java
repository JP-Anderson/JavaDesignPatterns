package com.jp.javapatterns.structural.adapter.adaptee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jp on 25/08/2017.
 */
public class FirstPersonShooterEngine implements FirstPersonShooterInput {

	/* Public list of string for capturing actions for testing purposes
	 * wouldn't be public in production code! */
	public List<String> actions = new ArrayList<>();

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
}
