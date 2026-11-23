package com.sampleproject;

public class BankAccount {
	static int account_number;
	String holder_name;
	long mobilenumber;
	String IFSC_Code;
	float Balance;
	static void details( ) {
		account_number=12345;
		BankAccount t= new BankAccount();
	t.holder_name="asha";
		t.mobilenumber=9912069184L;
		t.IFSC_Code="abc12345";
		t.Balance=30000.0F;
		t.printing();
		BankAccount t1= new BankAccount();
	account_number=account_number+1;
	t1.holder_name="siri";
	t1.mobilenumber=2345678901L;
	t1.IFSC_Code="abc3645364";
	t1.Balance=400.00F;
	t1.printing();

	}
	void printing() {
		System.out.println(account_number);
		System.out.println(holder_name);
		System.out.println(mobilenumber);
	}
	
	
	
	


	public static void main(String[] args) {
		 details();

	}

}
