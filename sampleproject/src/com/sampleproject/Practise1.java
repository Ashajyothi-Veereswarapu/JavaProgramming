package com.sampleproject;
// Create a Bank class with the following requirements:

//Declare a static variable bankBalance = 5000.

//Create a deposit() method that adds 1000 to the balance.

//Create a withdraw() method that subtracts 500 from the balance.

//Create a display() method to print the balance.

//In the main() method:

//Create two objects: b1 and b2.

//Call deposit() using b1.

//Call deposit() using b2.

//Call withdraw() using b1.

//Call deposit() using b2.

//Finally, print the bank balance.

public class Practise1 {
	static int bankbalance=5000;
	void deposit(){
		bankbalance=bankbalance+1000;
	}
	void withdraw() {
		bankbalance=bankbalance-500;
	}
	void display() {
	System.out.println("bankbalance is"+ bankbalance);
	}

	public static void main(String[] args) {
Practise1 b1=new Practise1 ();
Practise1 b2= new Practise1 ();
b1.deposit();
b2.deposit();
b1.withdraw();
b2.deposit();
b1.display();



	}

}
