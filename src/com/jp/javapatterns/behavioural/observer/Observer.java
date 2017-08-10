package com.jp.javapatterns.behavioural.observer;

/**
 * The Observer interface will be implemented by objects that observe a Subject.
 */
public interface Observer {

	/* This function will be called on each Observer by the Subject */
	void update(GridPoint location);

}
