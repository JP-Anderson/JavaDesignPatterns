package com.jp.javapatterns.creational.factory.abstract_factory;

/**
 * Created by Jp on 26/08/2017.
 */
public class Unit {

	public final String unitName;
	public final String factionName;
	public final String unitTypeName;

	protected Unit(String unitName, String factionName, String unitTypeName) {
		this.unitName = unitName;
		this.factionName = factionName;
		this.unitTypeName = unitTypeName;
	}

}
