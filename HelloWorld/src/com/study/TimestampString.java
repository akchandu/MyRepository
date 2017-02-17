package com.study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimestampString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today =  Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		// Print what date is today!
		System.out.println("Report Date: " + reportDate);
		
		String queueName = "TechM-servicedesk";
		if (queueName.endsWith("-escalation")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
