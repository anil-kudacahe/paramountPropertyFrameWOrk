package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashBoard 
{
	@FindBy(xpath="//a[.='Home']")
    private WebElement homeButton;
	
	@FindBy(xpath="//a[.='Register']")
    private WebElement register;
	
	@FindBy(xpath="//a[.='Details/Update']")
	private WebElement detailsAndUpdate;
	
	@FindBy(xpath="//a[.='Send SMS']']")
    private WebElement sendSMS;
	
	@FindBy(xpath="//a[.='Complaint List']")
	private WebElement complaintList;
	
	@FindBy(xpath="//a[@href='../app/list.php']/child::div[@class='alert alert-warning']")
	private WebElement roomForRent;
	
	@FindBy(xpath="//a[@href='../app/users.php']")
	private WebElement registereUser;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	
	
	
	WebDriver driver;
	 
	public AdminDashBoard(WebDriver driver)
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
	
	public void getSendSMS()
	{
		sendSMS.click();
	}
	
	public void getComplaintList()
	{
		complaintList.click();
	}
	
	
	public void getRoomForRent()
	{
		roomForRent.click();
	}
	
	public void getRegistereUser()
	{
		registereUser.click();
	}
	
	
	public void getLogout()
	{
		logout.click();
	}
	

}
