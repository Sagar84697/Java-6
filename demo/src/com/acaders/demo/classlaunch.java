package com.acaders.demo;
class Demo
{
	int a;
	int b;
	void disp()
	{
		int x=10;
		int y=20;
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class classlaunch {

	public static void main(String[] args) {
		Demo c=new Demo();
		c.disp();
	}

}
