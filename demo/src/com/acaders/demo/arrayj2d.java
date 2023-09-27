package com.acaders.demo;
import java.util.Scanner;

public class arrayj2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[6];
		a[2]=new int[5];
		System.out.println("enter array numbers");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered array numbers");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		}

}
