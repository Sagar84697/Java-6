package com.acaders.demo;
class Charger
{
	String brand;
	int voltage;
	Charger(String brand,int volatge)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
}
class Os
{
	String version;
	int size;
	Os(String version,int size)
	{
		this.version=version;
		this.size=size;
	}
}
class Mobile
{
	Charger c;
	Os s;
	Mobile(Charger c)
	{
		s=new Os("android 13",900);
		this.c=c;
	}
}

public class MobileExp {

	public static void main(String[] args) {
		Charger c=new Charger("samsung",420);
		
		Mobile m=new Mobile(c);
		System.out.println(m.c.brand);
		System.out.println(m.c.voltage);
		System.out.println(m.s.version);
		System.out.println(m.s.size);

	}

}
