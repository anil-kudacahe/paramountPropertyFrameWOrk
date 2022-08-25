package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComplaintsAdmin 
{

	@FindBy (id="name")
    private WebElement apartmantName;
	
	@FindBy (id="cmp")
    private WebElement complaintTextField;
	
	@FindBy (xpath="//button[.='Submit']")
    private WebElement submitButton;
	
	
	WebDriver driver;
	public ComplaintsAdmin(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getComplaintTextField()
	{
		
		return complaintTextField;
	}
	
	public WebElement getApartmantName()
	{
		
		return apartmantName;
	}
	
	public void getSubmitButton()
	{
		submitButton.click();
	}
	
}
