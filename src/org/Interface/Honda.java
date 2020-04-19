package org.Interface;

public class Honda implements Bike {
//If a Class implements a Interface, that particular class should-
	//implement all the methods present in the Interface
	@Override
	public void engine() {
		System.out.println("Honda-- engine");
	}

	@Override
	public void gear() {
		System.out.println("Honda-- gear");
	}

	@Override
	public void brake() {
		System.out.println("Honda-- brake");
	}

	@Override
	public void light() {
		System.out.println("Honda-- light");
	}
	public void discBrake() {
		System.out.println("Honda-- discBrake");
	}
	public void Indicator() {
		System.out.println("Honda-- Indicator");
	}

}
