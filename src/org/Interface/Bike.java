package org.Interface;

public interface Bike {
//Through Interface we can achieve full abstraction
	//Interface is slower than Abstract class because-
	//of more traversing time-- i.e no concrete methods is present in the interface.
	public void engine();
	public void gear();
	public void brake();
	public void light();
}
