package com.sampleproject;

public class Product {
	static  int productid=100;
	String product_name;
	int product_price;
	int quantity;
	String Companyname;
static void details() {
	Product p1 = new Product();
	p1.product_name="laptop";
	p1.product_price=80000;
	p1.quantity=2;
	p1.Companyname="dell";
	p1.printing();
	Product p2 = new Product();
	productid=productid+1;
	p2.product_name="mobile";
	p2.product_price=15000;
	p2.quantity=2;
			p2.Companyname="realme";
			p2.printing();
}
 void printing () {
	 System.out.println(productid);
	 System.out.println(product_name);
	 System.out.println(product_price);
	 System.out.println(quantity);
	 System.out.println(Companyname);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
details();
	}

}
