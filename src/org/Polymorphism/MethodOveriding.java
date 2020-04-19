package org.Polymorphism;

public class MethodOveriding {
static String Loan="CarLoan";
static int AxisBankId=101;
	// Method Overriding/RunTimePloymorphism:Two methods with same name, same datatype and same
	// parameter are accessed by the child class which calls the method present in
	// the parentclass
	public void ICICI(String Loan) {
		System.out.println("Bank-- ICICI provides "+Loan);
	}

	public void Axis(int AxisBankId) {
		System.out.println("Bank-- Axis Registration Id is "+AxisBankId);
	}

}
