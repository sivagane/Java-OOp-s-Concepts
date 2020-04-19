package org.Interface;

public class BikeTest extends Honda {

	public static void main(String[] args) {

		Bike b = new Honda();
		b.brake();
		b.engine();
		b.gear();
		b.light();
		//Through Dynamic Polymorphism Bike object can only-
		//access methods which are present in the Interface class
		Honda h = new Honda();
		h.brake();
		h.engine();
		h.gear();
		h.light();
		h.discBrake();
		h.Indicator();
		//Through the object of Honda Class we can access the methods of both-
		//Bike Interface and Honda Class.
	}
}
