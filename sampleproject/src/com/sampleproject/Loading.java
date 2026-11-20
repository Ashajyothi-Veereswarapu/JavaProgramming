package com.sampleproject;

public class Loading {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("welcome to java world");
	 Class.forName("java.lang.String");
	 Class.forName("java.lang.System");
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("welcome");
	}
}