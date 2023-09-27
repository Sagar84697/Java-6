package com.acaders.demo;
class Vid
{
	int a;
	int b;
	void disp(int m, int n)
	{
	int x=m;
    int y=n;
    a=x;
    b=y;
    System.out.println(m);
    System.out.println(n);
    System.out.println(x);
    System.out.println(y);
    System.out.println(a);
    System.out.println(b);
    
	}
}

public class class2 {

	public static void main(String[] args) {
		Vid d=new Vid();
		d.disp(10,20);

	}

}
