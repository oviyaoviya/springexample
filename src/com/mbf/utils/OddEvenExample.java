package com.mbf.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEvenExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
		try{
		int n = s.nextInt();
		OddEvenFunction d=new OddEvenFunction();
		int result=d.oddEven(n);
		System.out.println("values is :"+result);
	}catch (InputMismatchException e) {
        System.out.println("You have entered invalid data");
    }
}
}












/*
 * Scanner s = new Scanner(System.in); try {
 * System.out.print("Enter an integer: "); int num = s.nextInt(); if(num % 2 ==
 * 0) { System.out.println("The given number "+num+" is Even "); } else {
 * System.out.println("The given number "+num+" is Odd "); }
 * System.out.println("You entered " + num); } catch (InputMismatchException e)
 * { System.out.println("You have entered invalid data"); }
 */
