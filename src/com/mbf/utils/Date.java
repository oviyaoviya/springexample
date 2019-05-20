package com.mbf.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Date {
	/*Date today =new Date();
    public void Show(){
    	System.out.println("Date is"+today);
    }
*/
	public static void main(String[] args) {
		/*LocalDate today=LocalDate.now();
		System.out.println("Local Date="+today);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss",Locale.US);
		Date date = new Date();
		System.out.println(dateFormat.format(date));*/
		
		SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy");
        String dateInString = "Fri, June 7 2013";

        try {

            java.util.Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    
	}

}
