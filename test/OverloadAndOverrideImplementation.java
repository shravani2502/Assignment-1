package com.test;

public class OverloadAndOverrideImplementation {
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.calc(13, 10);
		p.calc(4, 6, 9);
		Inheritance i=new Inheritance();
		i.calc(10, 20);
		i.calc(5, 6, 8);
	}

}
class Polymorphism
{
	void calc(int a,int b)
	{
		System.out.println("sum is :"+(a+b));
	}
	void calc(int a,int b,int c)
	{
		System.out.println("sum is :"+(a+b+c));
	} 
	
}
class Inheritance extends Polymorphism
{
	void calc(int a,int b)
	{
		System.out.println("Product is:"+ a*b);
	}
  }

