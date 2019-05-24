package com.mbf.utils;

import java.util.Scanner;

public class Sampleprogram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int meter1=42;
		
		System.out.println("enter number :"+meter1);
		System.out.println("enter number :");
		int num=scanner.nextInt();
		int num1=scanner.nextInt();
		int number=meter1+num;
		int number1=number-num1;
		int number2=number1+5;
		System.out.println("the value is :"+number2);
		}
}
