package com.RealEstate_ParaMountProperty_POMRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
     @FindBy (id="exampleInputEmail1")
     private WebElement userName;
     
     @FindBy (id="exampleInputPassword1")
     private WebElement passWord;
     
     @FindBy (xpath="//button[.='Submit']")
     private WebElement submitButton;
     
     WebDriver driver;
      public LoginPage(WebDriver driver)
      {
    	  this.driver =driver;
    	  PageFactory.initElements(driver,this);
      }
      
      public WebElement getUserName()
      {
    	  return userName;
      }
      
      public WebElement getPassWord()
      {
    	  return passWord;
      }
      
      public void getSubmitButton()
      {
    	  submitButton.click();
      }
	
	
}
