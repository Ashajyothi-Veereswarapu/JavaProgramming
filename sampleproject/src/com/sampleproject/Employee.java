package com.sampleproject;

public class Employee {
	static int employe_id=0;
	String employe_name;
	long mobilenumber;
	String department_name;
	static float base_salary;
	float total_salary;
	byte age;
	boolean active;
	char gender;
	static float bounus;
	{
		employe_id=employe_id+1;
	}
	static void details() {
		Employee e1= new Employee();
	   e1.employe_name="asha";
	   e1.mobilenumber=9912069184L;
	   e1.department_name="CSE";
	   base_salary=13000.0f;
	   e1.age=22;
	   e1.active=true;
	   e1.gender='f';
	   bounus=5000.0f;
	   e1.total_amount();
	   e1.printing();
	   System.out.println("-------------------------------------------------------------------------");
	   Employee e2= new Employee(); 
	   e2.employe_name="percy";
	   e2.mobilenumber=7659969184L;
	   e2.department_name="CSE";
	   base_salary=14000.0f;
	   e2.age=22;
	   e2.active=true;
	   e2.gender='f';
	   bounus=6000.0f;
	   e2.total_amount();
	   e2.printing();
	   System.out.println("-------------------------------------------------------------------------");
	   Employee e3= new Employee();	
	   e3.employe_name="siri";
	   e3.mobilenumber=9918989899184L;
	   e3.department_name="CSE";
	   base_salary=17000.0f;
	   e3.age=22;
	   e3.active=true;
	   e3.gender='f';
	   bounus=7000.0f;
	   e3.total_amount();
	   e3.printing();
	}
        void printing () {
		System.out.println(employe_id);
		System.out.println(employe_name);
		System.out.println(department_name);
		System.out.println(base_salary);
		System.out.println(total_salary);
		System.out.println(age);
		System.out.println(active);
		System.out.println(gender);
		System.out.println(bounus);
	}
         void  total_amount() {
        total_salary=base_salary+bounus;
        }
	

	public static void main(String[] args) {
	details();
		

	}

}
