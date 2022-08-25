package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterRoomAdmin 
{

	@FindBy(xpath="//div[@id='home']/descendant::input[@id='fullname']")
	private WebElement fullName;
	
	@FindBy(xpath="//div[@id='home']/descendant::input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='alternat_mobile']")
    private WebElement alternatMobileNum;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='email']")
    private WebElement email;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='plot_number']")
    private WebElement plotnumber;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='rooms']")
    private WebElement rooms;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='country']")
    private WebElement country;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='state']")
    private WebElement state;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='city']")
    private WebElement city;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='rent']")
    private WebElement rent;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='sale']")
    private WebElement sale;
	

	@FindBy (xpath="//div[@id='home']/descendant::input[@id='deposit']")
    private WebElement deposit;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='accommodation']")
    private WebElement facility;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='description']")
    private WebElement description;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='landmark']")
    private WebElement landmark;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='address']")
    private WebElement address;
	
	@FindBy (xpath="//div[@id='home']/descendant::select[@id='vacant']")
    private WebElement vacantOccupied;
	
	@FindBy (xpath="//div[@id='home']/descendant::input[@id='image']")
    private WebElement imagePath;
	
	@FindBy (xpath="//div[@id='home']/descendant::button[.='Submit']")
    private WebElement submitButton;
	
	
	WebDriver driver;
	public RegisterRoomAdmin (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getpFullname()
	{
		return  fullName;
	}
	
	public WebElement getpMoblieNum()
	{
		return mobile;
	}
	
	public WebElement getAlternatMobileNum()
	{
		return alternatMobileNum;
	}
	
	public WebElement getemailId()
	{
		return email;
	}
	
	public WebElement getplotNumber()
	{
		return plotnumber;
	}
	
	public WebElement getAvailableRooms()
	{
		return rooms;
	}
	
	public WebElement getcountryName()
	{
		return country;
	}
	
	public WebElement getstateName()
	{
		return state;
	}
	
	public WebElement getcityName()
	{
		return city;
	}
	
	public WebElement getRent()
	{
		return rent;
	}
	
	public WebElement getSale()
	{
		return sale;
	}
	
	public WebElement getDeposit()
	{
		return deposit;
	}
	
	public WebElement getFacility()
	{
		return facility;
	}
	

	public WebElement getDescription()
	{
		return description;
	}
	
	
	public WebElement getLandmark()
	{
		return landmark;
	}
	
	public WebElement getAddress()
	{
		return address;
	}
	
	public WebElement getImagePath()
	{
		return imagePath;
	}
	

	public void getVacantOccupied()
	{
		Select see=new Select(vacantOccupied);
		see.selectByVisibleText("Occupied");
	}
	
	public void getSubmitButton()
	{
		submitButton.click();
	}
}
