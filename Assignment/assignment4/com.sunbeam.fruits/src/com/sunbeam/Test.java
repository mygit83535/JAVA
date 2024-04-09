package com.sunbeam;

public class Test {
	
	int num1 = 10; // field initializer
	int num2;
	int num3;
	int num4;

	
	// object initializers
	{
		System.out.println("Object Initializer-1");
		num1 = 100;
		num2 = 20;
	}

	// object initializers
	{
		System.out.println("Object Initializer-2");
		num3 = 30;
		num4 = 40;
	}
	
	Test(){
		System.out.println("Parameterless Constructor");
		num4 = 400;
	}


	public void displayTest() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
	}

	

}
