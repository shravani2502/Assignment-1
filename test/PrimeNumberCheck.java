package com.test;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Enter A NUMBER");  
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
				count=count+1;
			
		}
		if(count==1)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not a Prime");
		
		sc.close();
	}

}
