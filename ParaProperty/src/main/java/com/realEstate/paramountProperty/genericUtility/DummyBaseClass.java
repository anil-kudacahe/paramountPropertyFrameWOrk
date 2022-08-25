package com.realEstate.paramountProperty.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.RealEstate_ParaMountProperty_POMRepositoryLib.AdminDashBoard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyBaseClass 
{
	@BeforeSuite
	public void configBS()
	{
		System.out.println("*****DataBase Connected***********");
	}
	
	@BeforeClass
	public void configBC() throws Throwable
	{
		System.out.println("*****Launch browser***********");
	}
	
	@BeforeMethod
	public void configBM() throws Throwable
	{
		System.out.println("*****Enter Url***********");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("*****Logout***********");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("*****close the Browser***********");
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("***Close the Database****");
	}

}
