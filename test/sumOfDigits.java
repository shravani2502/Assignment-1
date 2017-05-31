package com.test;
import java.util.Scanner;


public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Enter A NUMBER");  
		int num=sc.nextInt();
		int rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("Sum of Digits is:" + sum);
			
		sc.close();
		
	}

}
