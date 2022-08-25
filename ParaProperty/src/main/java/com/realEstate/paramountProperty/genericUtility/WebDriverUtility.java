package com.realEstate.paramountProperty.genericUtility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	/**
	 *its an implicitly wait always wait for element inDOM document and  release the control if element available
	 * @param driver
	 */
	
	
	public void waitForElementInDOM(WebDriver driver)
	{
		int IConstants_implicitly_TINEOUT=20;
		driver.manage().timeouts().implicitlyWait(IConstants_implicitly_TINEOUT,TimeUnit.SECONDS);
		
	}
	
	/**
	 * it is 
	 * @param driver
	 * @param partailPageURL
	 */
	
	public void waitForPageLoad(WebDriver driver, String partailPageURL)
	{
		//int IConstants_Explicitly_TINEOUT = 20;
		WebDriverWait wait = new WebDriverWait(driver,IConstants.Explicitly_TINEOUT);
		wait.until(ExpectedConditions.urlContains(partailPageURL));
	}
	
	/**
	 * its an explicitly wait always wait for page to be loaded and available in GUI
	 * @param driver
	 * @param element
	 */
	public void wiatForElement(WebDriver driver, WebElement element)
	{
		//int IConstants_Explicitly_TINEOUT = 20;
		WebDriverWait wait= new WebDriverWait(driver,IConstants.Explicitly_TINEOUT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * used to Switch to Any window based on Window Title 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle)
	{
		Set<String> set = driver.getWindowHandles();
		java.util.Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
		  String WID=it.next();
		  driver.switchTo().window(WID);
		  String currentWindowTitle= driver.getTitle();
		  if(currentWindowTitle.contains(partialWindowTitle))
		    {
			       break;
			  
		    }
		}
		
		
	}
	
	/**
	 * Used to switch to alert Window & click on ok button
	 * @param driver
	 * @param expectedMsg
	 */
	
	public void switchToAlertAndAccept(WebDriver driver, String expectedMsg)
	{
		Alert alt= driver.switchTo().alert();
		if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim()))
		{
			System.out.println("Aleret sms is varified");
		}
		else
		{
			System.out.println("Alert sms is not verified");
		}
		alt.accept();
	}
	
	
	/**
	 * used switch to Alert Window and click on Cancel button
	 * @param driver
	 * @param expectedMsg
	 */
	public void switchToAlertWindowAndCancel(WebDriver driver, String expectedMsg)
	{
		Alert alt= driver.switchTo().alert();
		if(alt.getText().equals(expectedMsg))
		{
			System.out.println("Alert sms is verified");
		}
		else
		{
			System.out.println("Alert sms is not verified");
		}
		alt.dismiss();
	}

	/**
	 * used switch to Frame Window based on id or name attribute
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}

	/**
	 * used to switch to frame window based on id or name attribute
	 * @param driver
	 * @param id_name_attribute
	 */
	public void switchToFrame(WebDriver driver, String id_name_attribute)
	{
		driver.switchTo().frame(id_name_attribute);
	}

	/**
	 * used to select the value from the dropDown based on index
	 * @param driver
	 * @param index
	 */
	public void select(WebElement element ,int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);	
	}

	/**
	 * used to select the value from the dropDown based on value
	 * @param element
	 * @param text
	 */
	public void select(WebElement element, String text)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
		
		
	}

	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * used to right click on specified element
	 * @param driver
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * 
	 * @param driver
	 * @param javaScript
	 */
	public void executeJavaScript(WebDriver driver, String javaScript)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeAsyncScript(javaScript, null);
	}
	/**
	 * executeJavaScriptBorder
	 * @param driver
	 * @param javaScript
	 * @param elea
	 */
	public void executeJavaScriptBorder(WebDriver driver, String javaScript, WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeAsyncScript(javaScript,element);
	}

	/**
	 * 
	 * @param element
	 * @throws InterruptedException
	 */
	
   public void waitAndClick(WebElement element)throws InterruptedException
   {
	   int count=0;
	   while(count<20)
	   {
		   try
		   {
			   element.click();
			   break;
		   }
		   catch(Throwable e)
		   {
			   Thread.sleep(1000);
			   count++;
		   }
	   }
	   
   }
   
   /**
    * pass enter key appertain in to Browser
    * @param driver
    */
   
   public void passEnterKey(WebDriver driver)
   {
	   Actions act= new Actions(driver);
	   act.sendKeys(Keys.ENTER).perform();
   }


	
}


