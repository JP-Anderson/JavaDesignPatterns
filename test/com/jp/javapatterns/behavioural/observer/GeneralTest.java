package com.jp.javapatterns.behavioural.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jp on 11/08/2017.
 */
class GeneralTest {

	@Test
	void observingOfficerFollowsSubjectGeneral() {
		GridPoint generalsGridPoint = new GridPoint(10,10);
		General general = new General(generalsGridPoint);

		Officer officer1 = new Officer(new GridPoint(1,1));
		Officer officer2 = new Officer(new GridPoint(3,6));

		general.register(officer1);
		general.register(officer2);

		general.notifyObservers();

		assertEquals(generalsGridPoint, officer1.getGridPoint());
		assertEquals(generalsGridPoint, officer2.getGridPoint());
	}

	@Test
	void unregisteredObserverGetsNoUpdate() {
		GridPoint firstLocation = new GridPoint(5,5);
		General general = new General(firstLocation);

		Officer officer1 = new Officer(new GridPoint(1,2));
		Officer officer2 = new Officer(new GridPoint(1,2));

		general.register(officer1);
		general.register(officer2);

		Recruit recruit1 = new Recruit(new GridPoint(10,12));
		Recruit recruit2 = new Recruit(new GridPoint(1,7));

		officer1.register(recruit1);
		officer2.register(recruit2);

		general.notifyObservers();

		GridPoint secondLocation = new GridPoint(7,10);
		general.setGridPoint(secondLocation);
		general.unregister(officer2);
		officer1.unregister(recruit1);
		general.notifyObservers();

		/* Officer1 is still registered and follows Subject to the second location */
		assertEquals(secondLocation, officer1.getGridPoint());
		/* Recruit1 is unregistered from Officer1 so doesn't to second location */
		assertEquals(firstLocation, recruit1.getGridPoint());
		/* Officer2 unregistered from General so is still in first location*/
		assertEquals(firstLocation, officer2.getGridPoint());
		/* Recruit2 is still registered to Officer2, who has not changed location */
		assertEquals(firstLocation, recruit2.getGridPoint());
	}

}