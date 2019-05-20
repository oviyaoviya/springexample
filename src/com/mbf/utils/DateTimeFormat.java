package com.mbf.utils;

import java.text.SimpleDateFormat;


public class DateTimeFormat {

	public static void main(String[] args) {
	
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Date is"+date);
		

	}

}
