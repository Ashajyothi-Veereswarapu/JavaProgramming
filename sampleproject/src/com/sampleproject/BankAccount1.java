package com.sampleproject;

public class BankAccount1 {
	static int Account_number=12345;
    String name;
    long mobile;
    float balance;
    {
    	Account_number=Account_number+1;
    	System.out.println(Account_number);
    }
    
     static void details() {
    	 BankAccount1 k= new BankAccount1();
    	k.name="asha";
    	k.mobile=9912069184L;
    	k.balance=100.000f;
    	k.printing();
   	 BankAccount1 m = new BankAccount1();


    	
    	        m.name="siri";
    			m.mobile=7659969184L;
    	      m. balance=800.00f;
    	      m. printing();
    	 	 BankAccount1 n = new BankAccount1();   
    	 	n.name="percy";
			n.mobile=7659229184L;
	      n. balance=9800.00f;
	      n.printing();
    }
    void printing() {
		System.out.println(name);
		System.out.println(mobile);
    }
	public static void main(String[] args) {

details();
	}

}
