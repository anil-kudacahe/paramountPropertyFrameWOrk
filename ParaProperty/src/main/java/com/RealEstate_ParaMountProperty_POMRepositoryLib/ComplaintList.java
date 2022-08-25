package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComplaintList
{

	WebDriver driver= null;
	
    public void allComplaints(String fullName1)
    {
    	driver.findElement(By.xpath("//td[.='"+fullName1+"']"));
    }
}
