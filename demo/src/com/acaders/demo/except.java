package com.acaders.demo;
import java.util.Scanner;

public class except {

	public static void main(String[] args) 
	{
		try
		{
		  int a,b,c;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the value of numerator");
		  a=sc.nextInt();
		  System.out.println("enter the value of dinmenator");
		  b=sc.nextInt();
		  c=a/b;
		  System.out.println("value of c :"+c);
		  System.out.println("enter the size of array");
		  int size =sc.nextInt();
		  int arr[]= new int[size];
		  System.out.println("enter the value to insert into the array");
		  int value=sc.nextInt();
		  System.out.println("enter the position of array");
		  int pos=sc.nextInt();
		  arr[pos]=sc.nextInt();
		  System.out.println("element inserted into the array");
		}
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
		}

	}

