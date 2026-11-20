package com.sampleproject;

public class SampleTask {
	{
		System.out.println("instance block executed");
	}

  void main(String[] args) {
		
  System.out.println("main method printed");
  SampleTask k= new SampleTask();
  }
  {
	  System.out.println("instance block 2 is executed");
  }
  {
	  System.out.println("instance block 3 is executed");
  }
  {
	  System.out.println("instance block 4 is executed");
  }

}
