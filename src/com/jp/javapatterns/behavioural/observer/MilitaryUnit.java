package com.jp.javapatterns.behavioural.observer;

/**
 * Military Unit is the base class for our classes that will follow the Observer pattern.
 */
public abstract class MilitaryUnit {

	private GridPoint gridPoint;

	public MilitaryUnit(GridPoint gridPoint) {
		this.gridPoint = gridPoint;
	}

	public GridPoint getGridPoint() {
		return gridPoint;
	}

	public void setGridPoint(GridPoint gridPoint) {
		this.gridPoint = gridPoint;
	}

}
