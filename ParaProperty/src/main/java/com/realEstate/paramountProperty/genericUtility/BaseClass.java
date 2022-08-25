package com.realEstate.paramountProperty.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.RealEstate_ParaMountProperty_POMRepositoryLib.AdminDashBoard;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	public static WebDriver sDriver;
	
	public WebDriver driver;
	public WebDriverUtility wLib= new WebDriverUtility ();
	public FileUtility  fLib= new FileUtility ();
	public JavaUtility  jLib= new JavaUtility ();
	public ExcelUtility xLib= new ExcelUtility();
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("*****DataBase Connected***********");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void configBC() throws Throwable
	{
		 FileUtility propertyFile= new FileUtility();
		 String Browser = propertyFile.getPropertyKeyValue("browser");
		
	      //String Browser = browser;
		 if(Browser.equalsIgnoreCase("firefox"))
  		{
  			WebDriverManager.firefoxdriver().setup();
  			driver= new FirefoxDriver();	
  		}
  		else if(Browser.equalsIgnoreCase("chrome"))
  		{
  			WebDriverManager.chromedriver().setup();
  			driver= new ChromeDriver();
  		}
  		else
  		{
  			System.out.println("incorrect Browser");
  		}
		
		 sDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void configBM() throws Throwable
	{
		
		String URL = fLib.getPropertyKeyValue("url");
		
		//Navigate to App
		
		driver.get(URL);
		
		/*Step 1: Navigate to login
		 Home hm= new  Home (driver);
		 hm.getNavigetToLogin();
		
		LoginPage log= new LoginPage(driver);
		log.getUserName().sendKeys(null);*/		
	}
	
	@AfterMethod
	public void configAM()
	{
		AdminDashBoard admin= new AdminDashBoard(driver);
		admin.getLogout();
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("******Close the browser****");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("***Close the Database****");
	}
	
	
	
	
}
