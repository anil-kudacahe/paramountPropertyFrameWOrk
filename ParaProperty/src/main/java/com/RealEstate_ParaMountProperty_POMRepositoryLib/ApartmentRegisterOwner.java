package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApartmentRegisterOwner
{
	@FindBy(xpath="//a[.='Apartment Registration']")
	private WebElement apartmentRegisterButton;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='apartment_name']")
    private WebElement apartmentName;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='mobile']")
    private WebElement moblieNum;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='alternat_mobile']")
    private WebElement alternatMobileNum;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='email']")
    private WebElement email;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='plot_number']")
    private WebElement plotnumber;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='country']")
    private WebElement country;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='state']")
    private WebElement state;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='city']")
    private WebElement city;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='landmark']")
    private WebElement landmark;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='address']")
    private WebElement address;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='image']")
    private WebElement imagePath;
	
	@FindBy (xpath="//a[.='Add More(Plat Number/Description)']")
    private WebElement addMoreButton;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='fullname']")
    private WebElement fullname;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='ap_number_of_plats']")
    private WebElement apartmentNum;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='rooms']")
    private WebElement rooms;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='area']")
    private WebElement area;
	
	@FindBy (id="purpose")
    private WebElement purpose;
	
	@FindBy (id="floor")
    private WebElement floor;
	
	@FindBy (id="ownership")
    private WebElement ownerAndRented;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='rent']")
    private WebElement rent;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='deposit']")
    private WebElement deposit;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='accommodation']")
    private WebElement facility;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::input[@id='description']")
    private WebElement description;
	
	@FindBy (xpath="//div[@id='profile']/descendant::select[@id='vacant']")
    private WebElement vacant;
	
	@FindBy (xpath="//h2[text()='Apartment Room']/parent::div[@class='alert alert-info']/descendant::button[.='Submit']")
    private WebElement submitButton;
	
	WebDriver driver;
	public ApartmentRegisterOwner(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getpArtmentRegisterButton()
	{
		apartmentRegisterButton.click();
	}
	
	public WebElement getpArtmentNAme()
	{
		return apartmentName;
	}
	
	public WebElement getpMoblieNum()
	{
		return moblieNum;
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
	
	public WebElement getLandmark()
	{
		return landmark;
	}
	
	public WebElement getAddress()
	{
		return address;
	}
	
	public WebElement getImage()
	{
		return imagePath;
	}
	
	public void getAddMoreButton()
	{
		 addMoreButton.click();
	}
	
	public WebElement getApartmentNum()
	{
		return apartmentNum;
	}
	
	public WebElement getFullName()
	{
		return fullname;
	}
	
	public WebElement getRooms()
	{
		return rooms;
	}
	
	public WebElement getArea()
	{
		return area;
	}
	
	public void getPurpose()
	{
		Select sel=new Select(purpose);
	    sel.selectByVisibleText("Residential");
		
	}
	
	public void getFloor()
	{
		Select sell=new Select(floor);
		sell.selectByIndex(1);
	}
	
	public void getOwnerAndRented()
	{
		Select sel1=new Select(ownerAndRented);
		sel1.selectByIndex(1);
	}
	
	public WebElement getRent()
	{
		return rent;
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
	
	public void getVacant()
	{
		Select see=new Select(vacant);
		see.selectByVisibleText("Occupied");
	}
	
	public void getSubmitButton()
	{
		submitButton.click();
	}
	
}
