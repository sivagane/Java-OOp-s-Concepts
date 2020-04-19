package org.Abstraction;

public class HotelTest extends SaravanaBhavan{

	public static void main(String[] args) {
	 
		Hotels h= new SaravanaBhavan();
		h.dinner();
		h.tiffin();
		h.lunch();
		//We Cannot access snacks and tea methods from class SaravanaBhavan
			
		SaravanaBhavan sb= new SaravanaBhavan();
		sb.dinner();
		sb.tiffin();
		sb.lunch();
		sb.Snacks();
		sb.Tea();
		
		
		
	
}
}
