package com.jp.javapatterns.behavioural.observer;

/**
 * Recruits are lowest rank military units, they can only follow orders,
 * so they implement the Observer interface.
 */
public class Recruit extends MilitaryUnit implements Observer {

	public Recruit(GridPoint gridPoint) {
		super(gridPoint);
	}

	@Override
	public void update(GridPoint location) {
		setGridPoint(location);
	}

}
