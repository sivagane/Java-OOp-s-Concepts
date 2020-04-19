package org.Polymorphism;

public class MethodOverloading {
	// Method Overloading/CompileTimePloymorphism:Two methods with same name, with different arguments and-
	// datatypes can be accessed within the same class.
	static int Bankid = 101;
	static String BankName = "ICICI";

	public static void Bank() {
		System.out.println("Bank with No Parameter");
	}

	public static void Bank(int Bankid) {

		System.out.println("Bank Method with one parameter Bank Id " + Bankid);
	}

	public static void Bank(int Bankid, String BankName) {

		System.out.println("Bank Method with two parameter BankId and BankName is " + Bankid + " " + BankName);
	}

	public static void main(String[] args) {
		Bank(Bankid);
		Bank(Bankid, BankName);
	}
}
