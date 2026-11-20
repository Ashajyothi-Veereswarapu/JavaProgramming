package com.sampleproject;

public class Cricketer {
	// Static Variables(common data)
	static int country_id;
	static String country_name;
	//Instance Variables (Individual Data)
	int jersey_number;
	String cricketer_name;
	public static void main(String[] args) {
		System.out.println("welcome to indian cricket team");
		country_id=91;
		country_name="india";
		System.out.println("country id:"+country_id);
		System.out.println("country name:"+country_name);
		System.out.println("countryid:"+Cricketer.country_id);
		//Object Creation
	   Cricketer msd=new Cricketer();
	   //Instance Variable Initialization
	   msd.jersey_number=7;
	   msd.cricketer_name="mahendra singh dhoni";
	   System.out.println("jersey Number:"+msd.jersey_number);
	   System.out.println("Cricketer Name:"+ msd.cricketer_name);
	   Cricketer vk=new Cricketer();
	   vk.jersey_number=18;
	   vk.cricketer_name="Virat Kohli";
	   System.out.println("jersey number:"+vk.jersey_number);
	   System.out.println("cricketer Name:"+vk.cricketer_name);
	   int a=10;
	   System.out.println("print"+a);
	    int country_id=19;
	    String country_name= "Bharath";
	   System.out.println(country_id);
	   System.out.println(country_name);
		System.out.println("country id:"+Cricketer.country_id);
		System.out.println("country name:"+Cricketer.country_name);
		
	   
	   
	 
	   
	   

	

	}

}
