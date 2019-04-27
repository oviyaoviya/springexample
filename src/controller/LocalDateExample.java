package controller;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		 LocalDate date = LocalDate.now();  
		 LocalDate yesterday=date.minusDays(5);
		 LocalDate tomarrow=date.plusDays(2);
		 LocalDate month=date.plusMonths(2);
		 System.out.println(month.isLeapYear());
		 LocalDate year=LocalDate.of(2000, 05, 20);
		 System.out.println("LocalDate is :"+date);
		 System.out.println("yesterday date is :"+yesterday);
		 System.out.println("tomarrow date is :"+tomarrow);
		 System.out.println("month  is :"+month);
		 
		/*Local Time */
		 LocalTime time=LocalTime.now();
		 LocalTime today=time.minusHours(2);
		 LocalTime tmrw=time.plusHours(02);
		 System.out.println("result of minusHours "+today);
		 System.out.println("result of plusHours "+tmrw);
		 
		 
			/*Local DateTime */
		 LocalDateTime now = LocalDateTime.now();  
		 DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 String formatDateTime=now.format(format);
		 System.out.println("result of date and time formatter :"+formatDateTime);
		 System.out.println("result of datetime is :"+now);
		 
		/* monthday*/
		 
		 MonthDay result = MonthDay.now();  
		 LocalDate dateyear=result.atYear(2016);
		 boolean b=result.isValidYear(2016);
		
		    System.out.println("result of month :"+dateyear);
		    System.out.println("result of month :"+b);
		    
		    OffsetDateTime offsetDT = OffsetDateTime.now();  
	        System.out.println(offsetDT.getDayOfYear());
	        
	        Clock c = Clock.systemDefaultZone();      
	        System.out.println(c.getZone());  
	        
	        Clock d = Clock.systemUTC();  
	        System.out.println(d.instant());  
		 
	}

}
