package org.Polymorphism;

public class MethodOverridingTest extends MethodOveriding {

	public void ICICI() {
		System.out.println("BankTest--ICICI");
	}

	public void Axis() {
		System.out.println("BankTest-- Axis");
	}

	public static void main(String[] args) {
		// Here with the object of MethodOveriding we can access only the methods-
		// present in the MethodOveriding Class
		MethodOveriding m = new MethodOveriding();
		m.ICICI(Loan);
		m.Axis(AxisBankId);

		// Since MethodOverridingTest Class extends the MethodOveriding Class, with the-
		// object of MethodOverridingTest Class we can access the methods present in-
		// both the Class
		MethodOverridingTest mtc = new MethodOverridingTest();
		mtc.ICICI();
		mtc.ICICI(Loan);
		mtc.Axis();
		mtc.Axis(AxisBankId);

		// Dynamic Method Dispatch: With the object of ChildClass and by the Object-
		// reference of Parent class we can access only the methods present in the Parent-
		// class
		MethodOveriding mt = new MethodOverridingTest();//MethodOverriding/RuntimePolymorphism
		mt.ICICI(Loan);
		mt.ICICI(Loan);
	}
}
