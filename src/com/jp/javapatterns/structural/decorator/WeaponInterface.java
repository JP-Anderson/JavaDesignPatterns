package com.jp.javapatterns.structural.decorator;

/**
 * This interface provides the signature to be used by both the core
 * object and any decorator objects.
 */
public interface WeaponInterface {

	Attack attack(Attack attack);

}
