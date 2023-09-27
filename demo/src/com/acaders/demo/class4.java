package com.acaders.demo;
class Ad
{
	int a;
	int b;
	int disp(int m,int n)
	{
		int x=m;
		int y=n;
		a=x;
		b=y;
		int c=a+b;
		return c;
		
	}
}

public class class4 {

	public static void main(String[] args) {
		Ad c=new Ad();
		System.out.println(c.disp(10,20));
		

	}

}
