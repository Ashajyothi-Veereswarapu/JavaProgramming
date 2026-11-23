package com.sampleproject;

public class BankAccount2 {
	static int account_number= 12345;
	String name;
	long mobilenumber;
	float balance;
    void details(String m,long n,float o) {
    	account_number=account_number+1;
    	name=m;
    	mobilenumber=n;
    	balance=o;
    	printing();
    }
    void printing() {
    	System.out.println(account_number);
    	System.out.println(name);
    	System.out.println(mobilenumber);
    	System.out.println(balance);
    }


	public static void main(String[] args){
		BankAccount2 t= new BankAccount2();
		BankAccount2 t1= new BankAccount2();
		BankAccount2 t3= new BankAccount2();
t.details ("asha",9912069184L,800.00f);
t1.details("percy",7659969184L,900.00f);
t3.details("siri",9849761050L,700.00F);


	}

}
