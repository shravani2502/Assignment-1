package com.test;

import java.util.Scanner;

public class MyFibonocciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Enter A NUMBER");  
		int num=sc.nextInt();
		int[] feb = new int[num];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < num; i++)
        {
       	 feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< num; i++)
        {
                System.out.print(feb[i] + " ");
        }
        sc.close();
        
	}

}
