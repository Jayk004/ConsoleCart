package com.tka.shop;

import java.util.Scanner;

public class Purchase 
{
	public static int bamt;
    public static void purchase_product()
    {
    	int ch=1,gtot=0;
    	
    	do
    	{	
    	AllProducts.getProducts_cost();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter productname");
    	String pnm=sc.next();
    	System.out.println("Enter Quantity");
    	int qty=sc.nextInt();
    	
    	switch(pnm)
    	{
    	case "Book":
    	{
    		bamt=qty*AllProducts.prod1_cost;
    		break;
    	}
    	case "Keyboard":
    	{
    		bamt=qty*AllProducts.prod2_cost;
    		break;
    	}
    	case "Mobile":
    	{
    		bamt=qty*AllProducts.prod3_cost;
    	}
    	}
    	System.out.println("Bill amount=>₹"+bamt);
    	System.out.println("Do you want to continue press 1 else 0 ?");
    	ch=sc.nextInt();
    	gtot=gtot+bamt;
    	}
    	while(ch==1);	
    	System.out.println("Grand total=>₹"+gtot);
    	System.out.println("Thank you for the purchse of ₹"+gtot+"!!");
    }
}
