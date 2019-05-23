package com.mbf.utils;

import java.util.InputMismatchException;

public class OddEvenFunction {
public  int oddEven(int num){
			 
	if (num % 2 == 0) {
		System.out.println("The given number " + num + " is Even ");
	} else {
		System.out.println("The given number " + num + " is Odd ");
	}
	return num;
	}
}
