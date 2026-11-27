package com.sampleproject;

public class BillingSystem {
	byte itemcount = 90;
	double itemprice= 500;
	int discount = 20;
	char grade ='a';
	double exactdiscount= discount;
	double subtotal= (itemcount*itemprice)/100;
	double finalbill= subtotal-(subtotal*exactdiscount/100);
	int roundedbill= (int)finalbill;
	int gradecode=grade;

	public static void main(String[] args) {
	BillingSystem t= new BillingSystem();
	System.out.println(t.finalbill);
	System.out.println(t.roundedbill);
System.out.println(t.gradecode);

	}

}
