package com.study;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class HelloWorld {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.getProperties().list(System.out);
		
		Date dob=null;
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		dob=df.parse( "2014-02-10" );
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTime(dob);
		XMLGregorianCalendar xmlDate2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), dob.getHours(),dob.getMinutes(),dob.getSeconds(),DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG).normalize();
		XMLGregorianCalendar xmlDate3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH),dob.getHours(),dob.getMinutes(),dob.getSeconds(),DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);
		System.out.println(xmlDate2);
		System.out.println(xmlDate3);
		
		int year = 2016;
		int month = 3;
		int dateOfMonth = 24;
		
		GregorianCalendar gcal = new GregorianCalendar(year, month, dateOfMonth);
		XMLGregorianCalendar date = null;
		try{
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		}catch(DatatypeConfigurationException e){
			System.out.println("some error");
		}
		System.out.println("date is : " + date);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLong();
	}

}
