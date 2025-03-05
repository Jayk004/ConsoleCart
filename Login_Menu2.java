package com.tka.shop;

import java.util.Scanner;

public class Login_Menu2 {
	
	static String unm,password;
	
	public static void check()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username and password!!");
		System.out.println("Enter unm");
		unm=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		
		try
		{
		if(unm.equals("a") && password.equals("123"))
		 {
			
			System.out.println("You are a valid user!! Proceed for purchase");
			Purchase.purchase_product();
			
		 }
		else
		{
//			throws an user-defined Exception InValidUnm_Password
			throw new InvalidUnmException("usnm ad password not matching !!");
			//check();
		}
		}
		catch(InvalidUnmException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

	
	