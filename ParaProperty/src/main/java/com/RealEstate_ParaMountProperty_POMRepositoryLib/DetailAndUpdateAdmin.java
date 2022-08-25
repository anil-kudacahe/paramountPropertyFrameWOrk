package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DetailAndUpdateAdmin 
{
	
    public void selectCatgory(String fullName)
    {
    	
		driver.findElement(By.xpath("//p[contains(.,'"+fullName+"')]/ancestor::div[@class='card-block']/child::a[.='Edit']")).click();
    }
	
	public void updateRoom(String fullName, String updateAvailableRoom)
	{
		 driver.findElement(By.xpath("//p[contains(.,'"+fullName+"')]/ancestor::div[@class='card-block']/descendant::p[contains(.,'"+updateAvailableRoom+"')]"));
	}
	
	public void verifyEmail(String email)
	{
		 driver.findElement(By.xpath("//p[contains(.,'"+email+"@gmail.com" +"')]"));
	}
	

    
	@FindBy (xpath="(//a[text()='Complaint'])[1]")
    private WebElement complaint;
	

	
	WebDriver driver;
	public DetailAndUpdateAdmin(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void getComplaint()
	{
		 complaint.click();
	}
	
	
}
