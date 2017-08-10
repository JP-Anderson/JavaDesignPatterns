package com.jp.javapatterns.behavioural.observer;

import java.util.ArrayList;

/**
 * The General is the top level military unit, all units must follow the
 * general, but it doesn't follow any other unit, so it implements Subject.
 */
public class General extends MilitaryUnit implements Subject {

	private ArrayList<Observer> observingUnits;

	public General(GridPoint gridPoint) {
		super(gridPoint);
		observingUnits = new ArrayList<>();
	}

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

}
