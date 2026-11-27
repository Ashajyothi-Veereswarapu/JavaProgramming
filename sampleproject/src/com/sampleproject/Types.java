package com.sampleproject;

public class Types {
	// these are examples of widening, nothing but implicit.converting small can store in big
	byte a= 20;
	short b=a;
	int c=b;
	long d= c;
	float f=d;
	double e= f;
	float g= 558f;
	double h= g;
	long i= 348788L;
   int j= (int)i;
   int k= 128;
   byte l =(byte) k;
   long m = 5809097876l;
   int n= (int)m;
   double o= 100.25;
   int p = (int) (o);
   char q= 'm';
   int r =q;
   float s= 2345675686876.035252462464f;
   int t = ( int) (s);
   int u = 256;
   byte v = (byte)(u);
   
   
	public static void main(String[] args) {
		Types a1= new Types();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
		System.out.println(a1.f);
		System.out.println(a1.e);
		System.out.println(a1.f);
		System.out.println(a1.h);
		System.out.println(a1.j);
		System.out.println(a1.l);
		System.out.println(a1.n);
		System.out.println(a1.p);
		System.out.println(a1.t);
		System.out.println(a1.v);
		
		
		
		
		






	}

}
