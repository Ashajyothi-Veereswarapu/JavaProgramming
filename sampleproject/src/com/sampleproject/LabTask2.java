package com.sampleproject;

public class LabTask2 { 
	protected void finalize()throws Throwable {
		System.out.println("finalized method called");
	}
	static void hello() {
		LabTask2 k = new LabTask2();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		LabTask2 L1= new LabTask2();
		LabTask2 L2 = new LabTask2();
		LabTask2 L3= new LabTask2();
		System.out.println(L1);
		System.out.println(L2);
		System.out.println(L3);
		// nullyfying the object 
		L1=null;
		// reassigning of object
		L3=L2;
		L2=null;
		//  Anonymous object
		new LabTask2();
		L2.hello();
		System.out.println(L2);
		System.out.println(L3);
		System.gc();
		
 
	}

}
