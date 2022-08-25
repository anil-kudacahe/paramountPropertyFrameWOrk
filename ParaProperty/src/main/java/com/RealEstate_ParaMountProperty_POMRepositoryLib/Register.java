package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register
{
	@FindBy(id="fullname")
	private WebElement fullName;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="mobile")
	private WebElement mobileNum;
	
	@FindBy (id="email")
	private WebElement emailId;
	
	@FindBy (id="password")
	private WebElement passWord;
	
	@FindBy (id="c_password")
	private WebElement confirmPassWord;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	
	WebDriver driver;
	
	public Register(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFullName()
	{
		return fullName;
	}
	
	public WebElement getUserName()
	{
		return userName;
	}
	
	public WebElement getMoblie()
	{
		return mobileNum;
		
	}
	
	public WebElement getEmail()
	{
		return emailId;
	}
	
	public WebElement getPassWord()
	{
		return passWord;
		
	}
	
	public WebElement getConfirmPassword()
	{
		return confirmPassWord;
	}
	
	public void getSubmitButton()
	{
		submitButton.click();
		
	}
	
	

}
