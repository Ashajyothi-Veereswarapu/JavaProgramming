package com.sampleproject;

public class Calculator {
	static void  add(int a, int b) {
		System.out.println(a=b);
	}
	void multiply(int a , int b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
        add(2,3);
       Calculator p = new Calculator();
       p.multiply(5, 8);
	}

}
