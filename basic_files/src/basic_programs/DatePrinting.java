package basic_programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DatePrinting {

	public static void main(String[] args) throws ParseException {
//		Date date=java.util.Calendar.getInstance().getTime();
//		System.out.println(date);
//		//LocalDate localDate = LocalDate.now();
//		 // System.out.println(localDate);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		
//		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date date1 = sdf.parse("2022-01-03  5:01:00 PM");
//        date1.getHours();
//        System.out.println(date1);
//       // Date date2 = sdf.parse("2020-10-10 14:20");
//
//        // after() method
//        if(date.after(date1)) {
//            System.out.println(date + " is after " + date1);
//        }
//        
//       /* if(date.equals(date1)) {
//            System.out.println(date1 + " is equal to " + date);
//        }*/
		
		String date = "1/3/2022  5:01:00 PM";
		String[] date1 = date.split(" ");
		date = date1[0];
		String[] date2 = date.split("/");
		date = date2[2]+"-"+date2[0]+"-"+date2[1];
		System.out.println(date);
		
		LocalDate today = LocalDate.now();
		int year1= today.getYear();
		int month1 = today.getMonthValue();
		int day1 = today.getDayOfMonth();
		
		int year2 = Integer.parseInt(date2[2]);
		int month2 = Integer.parseInt(date2[0]);
		int day2 = Integer.parseInt(date2[1]);
		
		if(year1==year2)
		{
			if(month1==month2)
			{
				if(day1==day2)
				{
				
				}
			}
		}
				                                
//		int result = today.compareTo(tomorrow);
//
//		if(result == 0)
//		    System.out.println("Dates are equal");
//		else if (result < 0)
//		    System.out.println(today + " is before " + tomorrow);
//		else
//		    System.out.println(today + " is after " + tomorrow);
//		
//		
	}

}
