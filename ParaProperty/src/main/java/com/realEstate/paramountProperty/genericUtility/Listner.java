package com.realEstate.paramountProperty.genericUtility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener
{
	JavaUtility java= new JavaUtility(); //invoke for date purpose
   
	public void onTestFailure(ITestResult result) 
	{
		String date = java.getSystemDate();
	   // String date1 = java.dateAndTimeFormat();
	   int randomNum = java.getRandomNumber();
		String testName = result.getMethod().getMethodName();
		    String testNameAndDate = testName+date+randomNum;
		
		System.out.println(testName+"*****Executing Listner*****");
		EventFiringWebDriver eveDriver= new EventFiringWebDriver(BaseClass.sDriver);
		File src = eveDriver.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File("./screenShot/"+testNameAndDate+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		
	}
	
		public void onTestSkipped(ITestResult result)
		{
			String date = java.getSystemDate();
			//String date1 = java.dateAndTimeFormat();
			 int randomNum = java.getRandomNumber();
			String testName = result.getMethod().getMethodName();
			    String testNameAndDate = testName+date+randomNum ;
			
			System.out.println(testName+"*****Executing Listner*****");
			EventFiringWebDriver eveDriver= new EventFiringWebDriver(BaseClass.sDriver);
			File src = eveDriver.getScreenshotAs(OutputType.FILE);
			
			try
			{
				FileUtils.copyFile(src, new File("./skipped/"+testNameAndDate+".png"));
			}
			catch(IOException e)
			{
				e.printStackTrace();	
			}
			
		}
		
}
	
	
	

