package com.jp.javapatterns.creational.factory.factory;

/*
 * This class is the product we are building in the Factory, a
 * simple 'Enemy' for an RPG or action style combat game.
 *
 * It is abstract, we will produce subclasses of this class in
 * the factory.
 */
public abstract class Enemy {

	private int healthPoints;
	private int strengthSkill;
	private int magicSkill;
	private int xpRewardOnDeath;

	public Enemy(int healthPoints, int strengthSkill, int magicSkill, int xpRewardOnDeath) {
		this.healthPoints = healthPoints;
		this.strengthSkill = strengthSkill;
		this.magicSkill = magicSkill;
		this.xpRewardOnDeath = xpRewardOnDeath;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getStrengthSkill() {
		return strengthSkill;
	}

	public void setStrengthSkill(int strengthSkill) {
		this.strengthSkill = strengthSkill;
	}

	public int getMagicSkill() {
		return magicSkill;
	}

	public void setMagicSkill(int magicSkill) {
		this.magicSkill = magicSkill;
	}

	public int getXpRewardOnDeath() {
		return xpRewardOnDeath;
	}

	public void setXpRewardOnDeath(int xpRewardOnDeath) {
		this.xpRewardOnDeath = xpRewardOnDeath;
	}
}
