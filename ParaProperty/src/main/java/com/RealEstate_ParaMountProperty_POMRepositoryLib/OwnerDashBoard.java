package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnerDashBoard 
{
	@FindBy(xpath="//a[.='Home']")
    private WebElement homeButton;
	
	@FindBy(xpath="//a[.='Register'and @class='nav-link']")
    private WebElement register;
	
	@FindBy(xpath="//a[.='Details/Update']")
	private WebElement detailsAndUpdate;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement registereRoom;
	
	
	WebDriver driver;
	 
	public OwnerDashBoard(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getHome()
	{
		homeButton.click();
	}
	
	public void getRegister()
	{
		register.click();
	}
	
	public void getDetailsAndUpdate()
	{
		detailsAndUpdate.click();
	}
	
	public void getRegistereRoom()
	{
		registereRoom.click();
	}
	
	public void getLogout()
	{
		logout.click();
	}
	
	

}
