package com.tka.shop;

public class AllProducts 
{

//  global
	public static final int prod1_cost=1000;
	public static final int prod2_cost=3000;
	public static final int prod3_cost=50000;
	public static final String prod1="Book";
	public static final String prod2="Keyboard";
	public static final String prod3="Mobile";
	
//when we declare a method as static so we can call it with the class name
		
	public static void getProducts_cost()
	{
//Declared the prod1...prod3 as constants
		
//final int prod1_cost=1000;
		
		System.out.println(prod1+" "+"Cost->"+prod1_cost);
		System.out.println(prod2+" "+"Cost->"+prod2_cost);
		System.out.println(prod3+" "+"Cost->"+prod3_cost);
		
		
	}
}
