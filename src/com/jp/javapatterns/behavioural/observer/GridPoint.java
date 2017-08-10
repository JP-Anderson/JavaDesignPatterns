package com.jp.javapatterns.behavioural.observer;

/**
 * GridPoint represents a location which will be sent to observers
 */
public class GridPoint {

	public final int x;
	public final int y;

	public GridPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
