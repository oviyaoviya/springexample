package com.mbf.utils;

public class SumAvereageProgram {
	public static void main(String[] args) {

		int sum = 0;
		int number;
		float avg = 0;
		int startingNumber = 1;
		int endNumber = 15;
		int count = 0;
		int evenCount = 0;
		int oddCount = 0;

		for (number = startingNumber; number <= endNumber; number++) {
			/* sum = sum + number; */
			if (number % 2 == 0) {
				System.out.println("The given number " + number + " is Even ");
				evenCount++;
			} else {
				System.out.println("The given number " + number + " is odd ");
				oddCount++;
			}
			sum += number;
			count++;
		}
		System.out.println("sum is : " + sum);
		avg = (float) ((sum * 1.0) / count);
		System.out.println("count is :" + count);
		System.out.println("Average is :" + avg);
		System.out.println("total number of Even numbers :" + evenCount);
		System.out.println("total number of odd numbers :" + oddCount);
	}
}

/*
 * System.out.print("Enter first number : "); startingNumber = buf.nextInt();
 * 
 * System.out.print("Enter second number : "); endNumber = buf.nextInt();
 * 
 * sum = startingNumber + endNumber; avg=startingNumber+startingNumber/2;
 * 
 * System.out.print("Sum : " + sum + "\nAverage : " + avg);
 */

