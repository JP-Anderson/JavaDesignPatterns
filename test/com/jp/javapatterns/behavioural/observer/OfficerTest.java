package com.jp.javapatterns.behavioural.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 11/08/2017.
 */
class OfficerTest {

	@Test
	void officerPropagatesUpdatesToRecruits() {
		GridPoint generalsGridPoint = new GridPoint(10,10);
		General general = new General(generalsGridPoint);

		Officer officer1 = new Officer(new GridPoint(1,1));
		Officer officer2 = new Officer(new GridPoint(3,6));

		general.register(officer1);
		general.register(officer2);

		Recruit recruit1 = new Recruit(new GridPoint(12,15));
		Recruit recruit2 = new Recruit(new GridPoint(4,5));
		Recruit recruit3 = new Recruit(new GridPoint(9,10));

		officer1.register(recruit1);
		officer2.register(recruit2);
		officer2.register(recruit3);

		general.notifyObservers();

		assertTrue(general.getGridPoint() == officer1.getGridPoint());
		assertTrue(general.getGridPoint() == officer2.getGridPoint());
		assertTrue(general.getGridPoint() == recruit1.getGridPoint());
		assertTrue(general.getGridPoint() == recruit2.getGridPoint());
		assertTrue(general.getGridPoint() == recruit3.getGridPoint());
	}

}