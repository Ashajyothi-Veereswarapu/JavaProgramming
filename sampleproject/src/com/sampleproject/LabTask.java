package com.sampleproject;

public class LabTask {
	static LabTask k= new LabTask();
	static {
		method1();
	}
	static void method1() {
		System.out.println("method1 is executed");
		k.method2();
	}
	void method2() {
		System.out.println("method2 is executed");
		method3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       
	}
	static void method3() {
		System.out.println ("method3 is executed");
		k.method4();
	}
	void method4() {
	   System.out.println("method4 is executed");
	}

}
