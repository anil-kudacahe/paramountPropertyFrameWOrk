package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentSMS 
{

    public void selectCatgory(String fullName)
    {
    	driver.findElement(By.xpath("//tr/child::td[.='"+fullName+"']/preceding-sibling::th/child::input[@type='checkbox']")).click();
    }
	
	
	@FindBy (xpath="//input[@class='form-control']")
    private WebElement messageTextField;
	
	@FindBy (xpath="//button[.='Send SMS']")
    private WebElement sendSMSButton;
	
	@FindBy (xpath="//input[@id='selectAll']")
    private WebElement selectAll;
	
	WebDriver driver;
	public SentSMS(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getMessageTextField()
	{
		return messageTextField;
	}
	
	public void getSendSMSButton()
	{
		sendSMSButton.click();;
	}
	
	public void getSelectAll()
	{
		selectAll.click();;
	}
}
