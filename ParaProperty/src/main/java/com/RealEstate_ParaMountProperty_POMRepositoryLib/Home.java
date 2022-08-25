package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	// Declaration all Element
	@FindBy(xpath="//a[.='Login']")
	private WebElement login;
	
	@FindBy (xpath="//a[.='Register']")
    private WebElement register;
	
	@FindBy(xpath="//a[.='Logo/Home']")
	private WebElement logoHomeButton;
	
	@FindBy(xpath="//a[.='Search']")
	private WebElement searchButton;
	
	@FindBy (id="//input[@id='keywords']")
	private WebElement keywordTextField;
	
	@FindBy (id="//input[@id='location']")
	private WebElement locationTextField;
	
	@FindBy (xpath="//button[.='Search']")
	private WebElement searchButtonText;
	

	
	
	WebDriver driver;
	 
	//Initialization all Element
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	public void getNavigetToLogin()
	{
		login.click();
	}
	
	public void getNavigateToRegister()
	{
		 register.click();
	
	}
	public void getNavigateToHomeButton()
	{
		logoHomeButton.click();
	
	}
	
	public void getSearchButton()
	{
		searchButton.click();
	}
	
	public WebElement getKeywordTextField()
	{
		
		return keywordTextField;
	}
	
	public WebElement getLocationTextField()
	{
		
		return locationTextField;
	}
	

	public WebElement getSearchButtonText()
	{
		
		return searchButtonText;
	}
	
	
}

