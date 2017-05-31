package com.test;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Enter num1");  
	    int num1=sc.nextInt();
	    System.out.println("Enter num2");
	    int num2=sc.nextInt();
	    System.out.println("Numbers before swapping are:\n num1="+num1+"\n num2="+ num2);
	    
	    num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Numbers after swapping are:\n num1="+num1+"\n num2="+ num2);
		sc.close();
		}

	
}
