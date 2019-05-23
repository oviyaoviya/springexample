package com.mbf.utils;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int number;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");

		int num=scan.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			number=num%i;
		   if(number==0)
		   {
			   flag=false;
		      break;
		   }
		}

		if(flag)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	}
}
