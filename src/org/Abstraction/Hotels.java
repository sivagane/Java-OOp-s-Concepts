package org.Abstraction;

public abstract class Hotels {
//Hiding the implementation logic is called abstraction
	//Abstract class provide partial abstraction
	//Abstract method has only prototype, no method body
	//Abstraction is faster than interface because of partial abstraction.
	public abstract void lunch();
	
	public void tiffin() {
		System.out.println("Hotels-- tiffen");
	}
	public void dinner() {
		System.out.println("Hotels--dinner");
	}
	
}
