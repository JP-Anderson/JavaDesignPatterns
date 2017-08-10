package com.jp.javapatterns.behavioural.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 10/08/2017.
 */
class RecruitTest {

	@Test
	void observerChangesLocationOnUpdate() {
		GridPoint officersLocation = new GridPoint(10,12);
		Officer officer = new Officer(officersLocation);

		Recruit recruit1 = new Recruit(new GridPoint(10,11));
		Recruit recruit2 = new Recruit(new GridPoint(2,21));

		officer.register(recruit1);
		officer.register(recruit2);

		officer.notifyObservers();

		assertEquals(officersLocation, recruit1.getGridPoint());
		assertEquals(officersLocation, recruit2.getGridPoint());
	}

	@Test
	void unregisteredObserverGetsNoUpdate() {
		GridPoint officersLocation = new GridPoint(5,5);
		Officer officer = new Officer(officersLocation);

		Recruit recruit1 = new Recruit(new GridPoint(1,2));
		Recruit recruit2 = new Recruit(new GridPoint(1,2));

		officer.register(recruit1);
		officer.register(recruit2);
		officer.notifyObservers();

		GridPoint secondLocation = new GridPoint(7,10);
		officer.setGridPoint(secondLocation);
		officer.unregister(recruit2);
		officer.notifyObservers();

		assertEquals(secondLocation, recruit1.getGridPoint());
		assertEquals(officersLocation, recruit2.getGridPoint());
	}

}