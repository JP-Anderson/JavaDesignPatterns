package com.jp.javapatterns.structural.adapter.adaptee;

/**
 * Simple interface to simulate game input passed in from the
 * adaptee (keyboard/mouse) and adapter (game pad) controllers
 */
public interface FirstPersonShooterInput {

	void shootWeapon();

	void reloadWeapon();

	void jump();

}
