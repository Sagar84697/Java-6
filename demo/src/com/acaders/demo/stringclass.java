package com.acaders.demo;
class Vk
{
	int a;
	float b;
	boolean c;
	String d;
	
	void disp()
	{
		int x=20;
		float y=2.1f;
		boolean z=true;
		String v="vid";
		a=x;
		b=y;
		c=z;
		d=v;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class stringclass {

	public static void main(String[] args) {
		Vk c=new Vk();
		c.disp();

	}

}
