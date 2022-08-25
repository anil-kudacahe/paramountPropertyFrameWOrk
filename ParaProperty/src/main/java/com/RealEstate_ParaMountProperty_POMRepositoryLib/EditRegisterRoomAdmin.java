package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditRegisterRoomAdmin 
{

	@FindBy (id="fullname")
    private WebElement fullname;

	@FindBy (id="mobile")
    private WebElement moblieNum;
	
	@FindBy (id="alternat_mobile")
    private WebElement alternatMobileNum;
	
	@FindBy (id="email")
    private WebElement email;
	
	@FindBy (id="plot_number")
    private WebElement plotnumber;
	
	@FindBy (id="rooms")
    private WebElement availableRooms;
	
	@FindBy (id="country")
    private WebElement country;
	
	@FindBy (id="state")
    private WebElement state;
	
	@FindBy (id="city")
    private WebElement city;
	
	@FindBy (id="rent")
    private WebElement rent;
	
	@FindBy (id="sale")
    private WebElement sale;
	

	@FindBy (id="deposit")
    private WebElement deposit;
	
	@FindBy (id="accommodation")
    private WebElement accommodation;
	
	@FindBy (id="description")
    private WebElement description;
	
	@FindBy (id="landmark")
    private WebElement landmark;
	
	@FindBy (id="address")
    private WebElement address;
	
	@FindBy (id="vacant")
    private WebElement vacantOccupied;
	
	@FindBy (id="other")
    private WebElement other;
	
	@FindBy (xpath="//button[.='Submit']")
    private WebElement submitButton;
	
	
	WebDriver driver;
	public EditRegisterRoomAdmin (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getFullname()
	{
		fullname.clear();
		return fullname;
	}
	
	public WebElement getMoblieNum()
	{
		moblieNum.clear();
		return moblieNum;
	}
	
	public WebElement getAlternatMobileNum()
	{    
		alternatMobileNum.clear();
		return alternatMobileNum;
	}
	
	public WebElement getEmailId()
	{
		email.clear();
		return email;
	}
	
	public WebElement getPlotNumber()
	{
		plotnumber.clear();
		return plotnumber;
	}
	
	public WebElement getAvailableRooms()
	{
		availableRooms.clear();
		return availableRooms;
	}
	
	public WebElement getCountryName()
	{
		country.clear();
		return country;
	}
	
	public WebElement getStateName()
	{
		state.clear();
		return state;
	}
	
	public WebElement getCityName()
	{
		city.clear();
		return city;
	}
	
	public WebElement getRent()
	{
		rent.clear();
		return rent;
	}
	
	public WebElement getSale()
	{
		sale.clear();
		return sale;
	}
	
	public WebElement getDeposit()
	{
		deposit.clear();
		return deposit;
	}
	
	public WebElement getAccommodation()
	{
		accommodation.clear();
		return accommodation;
	}
	

	public WebElement getDescription()
	{
		description.clear();
		return description;
	}
	
	
	public WebElement getLandmark()
	{
		landmark.clear();
		return landmark;
	}
	
	public WebElement getAddress()
	{
		address.clear();
		return address;
	}
	
	public WebElement getOther()
	{
		return other;
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
