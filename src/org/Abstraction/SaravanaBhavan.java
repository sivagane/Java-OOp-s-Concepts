package org.Abstraction;

public class SaravanaBhavan extends Hotels {
    //If a class extends a abstract class, then that class should implement-
	//all the abstract methods present in the abstract class
	@Override
	public void lunch() {
		System.out.println("Saravana Bhavan--lunch");
			}
	public void Tea() {
		System.out.println("Saravana Bhavan--tea");
	}
	public void Snacks() {
		System.out.println("Saravana Bhavan--snacks");
	}

}
