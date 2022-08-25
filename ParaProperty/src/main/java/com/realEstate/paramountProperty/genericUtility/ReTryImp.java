package com.realEstate.paramountProperty.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImp implements IRetryAnalyzer
{

	int counter=0;
	int retryimp=3;
	
	public boolean retry(ITestResult result)
	{
		if(counter<retryimp)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
