package com.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	     
		System.out.println("Enter A NUMBER");  
		   int num=sc.nextInt();
		   int rem,rev=0;
		   while(num>0)
		   {
			   rem=num%10;
			   num=num/10;
			   rev=rev*10+rem;
			   
		   }
		   
		   System.out.println("Reverse of a number is:" + rev);

	}

}
