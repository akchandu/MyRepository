package com.study.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEg {

	public static void main(String[] args) throws ParseException  {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		/*String d = date.toString();
		System.out.println(d);*/
		String datee = dateFormat.format(date);
		System.out.println(datee);
		
		System.out.println("using system : ");
		System.out.println(System.currentTimeMillis());
		
		//String str = "Jun 13 2003 23:11:52.454 UTC";
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date1 = df.parse(datee);
	    long epoch = date1.getTime();
	    
	    System.out.println("using epoc");
	    String s = String.valueOf(epoch);
	    System.out.println(s);
		
	}

}
