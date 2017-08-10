package com.jp.javapatterns.behavioural.observer;

/**
 * The Subject interface is implemented by the object we want to be observed.
 */
public interface Subject {

	/* Register a new Observer to update. */
	void register(Observer observer);
	/* Remove an Observer we no longer want to update. */
	void unregister(Observer observer);
	/* Notify all observers of some state change */
	void notifyObservers();

}
