package com.mbf.utils;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;  
public class DateFormatExamplev2 {

	public static void main(String[] args) throws ParseException {
	     Date currentDate = new Date();  
	       System.out.println("Current Date: "+currentDate);  
	       String datetostring=DateFormat.getInstance().format(currentDate);
	       String datetostr=DateFormat.getDateInstance().format(currentDate);
	       
	       String datetostr1=DateFormat.getDateInstance(DateFormat.LONG).format(currentDate);
	       System.out.println("Current Date: "+datetostring);  
	       System.out.println("Current getinstance Date: "+datetostr); 
	       System.out.println("Current  getinstance Long Date: "+datetostr1); 
	       
	       Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");
	        System.out.println("Date is: "+d);  
	       
	}

}
