package com.study;

public class TrimExample {

	public static void main(String[] args) {
		String data = "First Name:Rahul, Last Name:Badwaik, Internet E-mail:rahul.badwaik@ext.religare.in";
		
		String[] dataFields = data.split(",");
		
		for (int i = 0; i < dataFields.length; i++) {
			String[] pair = dataFields[i].split(":");
			String metaName = pair[0].trim();
			String metaValue = pair[1].trim();
			
			if (metaName.equals("Last Name")) {
				System.out.println("Yes last name");
			}
			
			System.out.println("name is : " + metaName + " value is : " + metaValue);
		}

	}

}
