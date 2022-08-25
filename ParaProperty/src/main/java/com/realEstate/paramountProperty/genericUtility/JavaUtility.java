package com.realEstate.paramountProperty.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class JavaUtility 
{
	/** 
	 * it is used to generate the random number with in the range of 1000
	 * @return
	 */
	public static int getRandomNumber()
	{
		Random random= new Random();
		int randomNum= random.nextInt(89)+10;
		//int randomNum= random.nextInt(9);
		return randomNum;
	}
	
	/**
	 * it is used to get the current system date based on DD-MM-YYYY format
	 * @return
	 */
	
	public String getSystemDate()
	{
		Date date= new Date();
		String currentDate= date.toString();
		System.out.println(currentDate);
		String[] arr= currentDate.split("");
		 String yyyy= arr[5];
		 String dd= arr[2];
		 int mm= date.getMonth()+1;
		 String format=yyyy+"-"+mm+"-"+dd;
		 return format;
		
	}
	
	/**
	 * Return date and time 
	 * @return
	 */
	public String dateAndTimeFormat()
	{
		
		Date nm= new Date();
		String date = new SimpleDateFormat("d-MMM-yyyy HH:mm:ss", Locale.ENGLISH).format(nm);
		return date;
	    
	
	}

}
