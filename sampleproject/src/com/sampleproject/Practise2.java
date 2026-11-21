package com.sampleproject;
//Create a `Student` class with instance variables `name` and `marks`. Implement `setData()`assign values, `addMarks()` (adds 10 marks), 
//and `display()` methods.
//Create three student objects, assign different values, and update the marks of only one student. Display all three students' details.

public class Practise2 {
	String name;
	int marks;
	void setdata(String m, int n) {
		name=m;
		marks=n;	
	}
	void addmarks() {
		marks=marks+10;
	}
	void display() {
		System.out.println(name);
		System.out.println(marks);
	}

	public static void main(String[] args) {
 Practise2 t1= new Practise2();
 Practise2 t2= new Practise2();
 Practise2 t3= new Practise2();
 t1.setdata ("ravi",10);
 t2.setdata ("ramu",20);
 t3.setdata("raji",30);
 t1.addmarks();
 t2.addmarks();
 t3.addmarks();
 t1.display();
 t2.display();
 t3.display();
 
 
 
	}

}
