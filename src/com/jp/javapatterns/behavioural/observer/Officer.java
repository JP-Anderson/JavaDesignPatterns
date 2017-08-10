package com.jp.javapatterns.behavioural.observer;

import java.util.ArrayList;

/**
 * Officer represents a military leader unit.
 *
 * Officers can lead other units, so they implement the Subject interface.
 * But Officers can also follow higher ranked officers, so are also Observers.
 *
 */
public class Officer extends MilitaryUnit implements Subject, Observer {

	private ArrayList<Observer> observingUnits;

	public Officer(GridPoint gridPoint) {
		super(gridPoint);
		observingUnits = new ArrayList<>();
	}

	/* Subject methods */

	@Override
	public void register(Observer observer) {
		if (observer == null) throw new IllegalArgumentException("Observer cannot be null!");
		observingUnits.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observingUnits.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer unit : observingUnits) {
			unit.update(getGridPoint());
		}
	}

	/* Observer methods */

	@Override
	public void update(GridPoint location) {
		setGridPoint(location);
		notifyObservers();
	}

}
