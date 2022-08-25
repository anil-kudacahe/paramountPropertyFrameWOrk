package com.ParaProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.RealEstate_ParaMountProperty_POMRepositoryLib.AdminDashBoard;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.ApartmentRegisterOwner;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.ComplaintsAdmin;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.DetailAndUpdateAdmin;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.EditRegisterRoomAdmin;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.Home;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.LoginPage;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.OwnerDashBoard;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.Register;
import com.RealEstate_ParaMountProperty_POMRepositoryLib.RegisterRoomAdmin;
import com.realEstate.paramountProperty.genericUtility.BaseClass;
import com.realEstate.paramountProperty.genericUtility.ExcelUtility;
import com.realEstate.paramountProperty.genericUtility.FileUtility;
import com.realEstate.paramountProperty.genericUtility.JavaUtility;
import com.realEstate.paramountProperty.genericUtility.WebDriverUtility;

@Listeners(com.realEstate.paramountProperty.genericUtility.Listner.class) // take fully Qualified path of Package( where u put Listener class)
public class TestNG_RegisterApartmentAsOccupiedAndVerifyInListOfApartmentDetalisPage_Test extends BaseClass
{

	//@Test(groups="regression")
	public void registerApartmentAsOccupiedAndVerifyInListOfApartmentDetalisPage_Test() throws Throwable
	{
		

		WebDriverUtility web= new WebDriverUtility();


		//create rondom number
		JavaUtility  java= new JavaUtility ();
		int random1 = java.getRandomNumber();

		//Steps:2 Read the test data from Excel sheet
		ExcelUtility excel= new ExcelUtility ();

		String fullName = excel.getExcelData("Sheet1",1,2);
		String userName = excel.getExcelData("Sheet1", 1, 3);
		String mobilNum = excel.getExcelData("Sheet1", 1, 4);
		String email = excel.getExcelData("Sheet1", 1, 5);
		String passWord = excel.getExcelData("Sheet1", 1, 6);
		String confirmPassword = excel.getExcelData("Sheet1", 1, 7);
		String apartmentName = excel.getExcelData("Sheet1", 1, 8);
		String alternateNum = excel.getExcelData("Sheet1", 1, 9);
		String plot = excel.getExcelData("Sheet1", 1,10);
		String countryName = excel.getExcelData("Sheet1", 1, 11);
		String stateName = excel.getExcelData("Sheet1", 1, 12);
		String cityName = excel.getExcelData("Sheet1", 1, 13);
		String landMark = excel.getExcelData("Sheet1", 1, 14);
		String address = excel.getExcelData("Sheet1", 1, 15);
		String flatNum = excel.getExcelData("Sheet1", 1, 16);
		String rooms = excel.getExcelData("Sheet1", 1, 17);
		String area = excel.getExcelData("Sheet1", 1, 18);
		String rent = excel.getExcelData("Sheet1", 1, 19);
		String deposit = excel.getExcelData("Sheet1", 1, 20);
		String facility = excel.getExcelData("Sheet1", 1, 21);
		String description = excel.getExcelData("Sheet1", 1, 22);


		FileUtility propertyFile= new FileUtility();
		String AdminName = propertyFile.getPropertyKeyValue("adminname");
		String AdminPassword = propertyFile.getPropertyKeyValue("adminpassword");

		// steps:3 Navigate to Register 
		Home hm= new Home(driver);
		hm.getNavigateToRegister();

		// steps:3 Enter all valid data into text field in Register Page
		Register reg= new Register(driver);
		reg.getFullName().sendKeys(fullName+random1);
		reg.getUserName().sendKeys(userName+random1);
		reg.getMoblie().sendKeys(mobilNum+random1);
		reg.getEmail().sendKeys(email+"@gmail.com");
		reg.getPassWord().sendKeys(passWord+random1);
		reg.getConfirmPassword().sendKeys(confirmPassword+random1);
		reg.getSubmitButton();

		// steps:4 Navigate to Login button
		hm.getNavigetToLogin();

		// steps:5 Enter userName and password
		LoginPage log= new LoginPage(driver);
		log.getUserName().sendKeys(userName+random1);
		log.getPassWord().sendKeys(passWord+random1);
		log.getSubmitButton();

		// steps:6 Navigate to Register button
		OwnerDashBoard  owner= new OwnerDashBoard (driver);
		owner.getRegister();

		// steps:7 Navigate to Apartment Registration button
		ApartmentRegisterOwner apartment= new ApartmentRegisterOwner(driver);
		apartment.getpArtmentRegisterButton();

		//steps:8 Enter all valid data into text field in Apartment Registration Page
		apartment.getpArtmentNAme().sendKeys(apartmentName);
		
		apartment.getpMoblieNum().sendKeys(mobilNum+random1);
		apartment.getAlternatMobileNum().sendKeys(alternateNum+random1);
		apartment.getemailId().sendKeys(email+"@gmail.com");
		apartment.getplotNumber().sendKeys(plot);
		apartment.getcountryName().sendKeys(countryName);
		apartment.getstateName().sendKeys(stateName);
		apartment.getcityName().sendKeys(cityName);
		apartment.getLandmark().sendKeys(landMark);
		apartment.getAddress().sendKeys(address);
		apartment.getImage().sendKeys("C:\\Users\\DELL\\Desktop\\Photo.png");
		apartment.getAddMoreButton();
		apartment.getFullName().sendKeys(fullName);
		apartment.getpArtmentNAme().sendKeys(flatNum);
		apartment.getRooms().sendKeys(rooms);
		apartment.getArea().sendKeys(area);
		apartment.getPurpose();
		apartment.getFloor();
		apartment.getOwnerAndRented();
		apartment.getRent().sendKeys(rent);
		apartment.getDeposit().sendKeys(deposit);
		apartment.getFacility().sendKeys(facility);
		apartment.getDescription().sendKeys(description);
		apartment.getVacant();
		apartment.getSubmitButton();

		//logout owner
		owner.getLogout();

		// steps:9 Navigate to Login button
		hm.getNavigetToLogin();


		// steps:10 Enter userName and password(login as Admin) 
		log.getUserName().sendKeys(AdminName);
		log.getPassWord().sendKeys(AdminPassword);
		log.getSubmitButton();


		// steps:11 Navigate to Details/Update button
		AdminDashBoard admin= new AdminDashBoard(driver);
		admin.getDetailsAndUpdate();

		//steps:12 verify Register Apartment As Occupied In List Of Apartment Details Page
		DetailAndUpdateAdmin update= new DetailAndUpdateAdmin (driver);
		update.verifyEmail(email);

		WebElement verify = driver.findElement(By.xpath("//p[contains(.,'"+email+"@gmail.com" +"')]"));
		String data = verify.getText();

		//web.executeJavaScriptBorder(driver, "arguments[0].style.border='5px solid red'", verify);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].style.border='5px solid red'",verify);
		Thread.sleep(2000);

		SoftAssert sa= new SoftAssert();
		sa.assertEquals(data,email+"@gmail.com");
		sa.assertAll();

	}

	@Test(groups="smoke")
	public void EditTheOwnerRoomDetailsAndVerifyInDetailsListPage_Test() throws Throwable
	{

		

		WebDriverUtility web= new WebDriverUtility();


		//create rondom number
		JavaUtility  java= new JavaUtility ();
		int random1 = java.getRandomNumber();

		//Steps:2 Read the test data from Excel sheet
		ExcelUtility excel= new ExcelUtility ();

		String fullName1 = excel.getExcelData("Sheet1",7,2);
		String fullName = fullName1+random1;
		String mobileNum = excel.getExcelData("Sheet1", 7, 3);
		String alternateNum = excel.getExcelData("Sheet1", 7, 4);
		String email = excel.getExcelData("Sheet1", 7, 5);
		String plotNum = excel.getExcelData("Sheet1", 7, 6);
		String availbleRoom = excel.getExcelData("Sheet1", 7, 7);
		System.out.println("start"+availbleRoom);
		String countryName = excel.getExcelData("Sheet1", 7, 8);
		String stateName = excel.getExcelData("Sheet1", 7, 9);
		String cityName = excel.getExcelData("Sheet1", 7, 10);
		String rent = excel.getExcelData("Sheet1", 7,11);

		String deposite = excel.getExcelData("Sheet1", 7, 12);
		String facility = excel.getExcelData("Sheet1", 7, 13);
		String discription = excel.getExcelData("Sheet1", 7, 14);

		String landMark = excel.getExcelData("Sheet1", 7, 15);
		String address = excel.getExcelData("Sheet1", 7, 16);

		String updateAvailableRoom = excel.getExcelData("Sheet1", 7, 17);
		String accommodation = excel.getExcelData("Sheet1", 7, 18);
		String discription1 = excel.getExcelData("Sheet1", 7, 19);
		String other = excel.getExcelData("Sheet1", 7, 20);

		//Steps:3 Read the test data from property file
		FileUtility propertyFile= new FileUtility();

		String AdminName = propertyFile.getPropertyKeyValue("adminname");
		String AdminPassword = propertyFile.getPropertyKeyValue("adminpassword");

		// steps:5 Navigate to Login button
		Home hm= new Home(driver);
		hm.getNavigetToLogin();

		// steps:6 Enter userName and password(login as Admin) 
		LoginPage lg= new LoginPage(driver);
		lg.getUserName().sendKeys(AdminName);
		lg.getPassWord().sendKeys(AdminPassword);
		lg.getSubmitButton();

		// steps:7 Navigate to Register 
		AdminDashBoard board= new AdminDashBoard(driver);
		board.getRegister();

		// steps:6 Enter all valid data into text field in Register Page
		RegisterRoomAdmin reg= new RegisterRoomAdmin (driver);
		reg.getpFullname().sendKeys(fullName);
		System.out.println(fullName);
		reg.getpMoblieNum().sendKeys(mobileNum+random1);
		reg.getAlternatMobileNum().sendKeys(alternateNum+random1);
		reg.getemailId().sendKeys(email+random1+"@gmail.com");
		reg.getplotNumber().sendKeys(plotNum);
		reg.getAvailableRooms().sendKeys(availbleRoom);
		reg.getcountryName().sendKeys(countryName);
		reg.getstateName().sendKeys(stateName);
		reg.getcityName().sendKeys(cityName);
		reg.getRent().sendKeys(rent);
		reg.getDeposit().sendKeys(deposite);
		reg.getLandmark().sendKeys(landMark);
		reg.getAddress().sendKeys(address);
		reg.getVacantOccupied();
		reg.getImagePath().sendKeys("C:\\Users\\DELL\\Desktop\\Owner_Details_Modify_Defect.png");
		reg.getSubmitButton();

		//navigate to Details and Update
		board.getDetailsAndUpdate();
		Thread.sleep(2000);
		driver.navigate().refresh();

		DetailAndUpdateAdmin update= new DetailAndUpdateAdmin (driver);
		update.selectCatgory(fullName);

		EditRegisterRoomAdmin edit= new EditRegisterRoomAdmin(driver);
		edit.getAvailableRooms().sendKeys(updateAvailableRoom);
		edit.getAccommodation().sendKeys(accommodation);
		edit.getDescription().sendKeys(discription1);
		edit.getOther().sendKeys(other);
		edit.getSubmitButton();
		
		//navigate to Details and Update
		board.getDetailsAndUpdate();
		Thread.sleep(2000);
		update.updateRoom(fullName,updateAvailableRoom);

		WebElement update1 = driver.findElement(By.xpath("//p[contains(.,'"+fullName+"')]/ancestor::div[@class='card-block']/descendant::p[contains(.,'"+updateAvailableRoom+"')]"));
		String updateAvailableRoom1 = update1.getText();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",update1);
		j.executeScript("arguments[0].style.border='5px solid red'",update1);
		
		System.out.println("actual=  "+updateAvailableRoom1);
		System.out.println("Expected=  "+updateAvailableRoom);
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(updateAvailableRoom1,"Available Rooms: "+updateAvailableRoom);
		sa.assertAll();
		
		
	}

	@Test(groups="smoke")
	public void RegisterTheComplaintonanyUserAndCheckInComplaintListPage_Test() throws Throwable
	{
		

		WebDriverUtility web= new WebDriverUtility();


		//create rondom number
		JavaUtility  java= new JavaUtility ();
		int random1 = java.getRandomNumber();

		//Steps:2 Read the test data from Excel sheet
		ExcelUtility excel= new ExcelUtility ();

		String fullName1 = excel.getExcelData("Sheet1",4,2);
		String fullName = fullName1+random1;
		System.out.println(fullName);

		String mobilNum = excel.getExcelData("Sheet1", 4, 3);
		String alternateNum = excel.getExcelData("Sheet1", 4, 4);
		String email = excel.getExcelData("Sheet1", 4, 5);
		String plot = excel.getExcelData("Sheet1", 4,6);
		String availableRooms = excel.getExcelData("Sheet1", 4, 7);
		String countryName = excel.getExcelData("Sheet1", 4, 8);
		String stateName = excel.getExcelData("Sheet1", 4, 9);
		String cityName = excel.getExcelData("Sheet1", 4, 10);
		String rent = excel.getExcelData("Sheet1", 4, 11);
		String deposit = excel.getExcelData("Sheet1", 4, 12);
		String description = excel.getExcelData("Sheet1", 4, 13);
		String landMark = excel.getExcelData("Sheet1", 4, 14);
		String address = excel.getExcelData("Sheet1", 4, 15);
		String complaint = excel.getExcelData("Sheet1", 4, 16);

		//Steps:3 Read the test data from property file
		FileUtility propertyFile= new FileUtility();

		String AdminName = propertyFile.getPropertyKeyValue("adminname");
		String AdminPassword = propertyFile.getPropertyKeyValue("adminpassword");

		// steps:3 Navigate to Login button
		LoginPage log= new LoginPage(driver);

		Home hm= new Home(driver);
		hm.getNavigetToLogin();
		// steps:4 Enter userName and password(login as Admin) 
		log.getUserName().sendKeys(AdminName);
		log.getPassWord().sendKeys(AdminPassword);
		log.getSubmitButton();


		// steps:5 Navigate to Register 
		AdminDashBoard admin= new AdminDashBoard(driver);
		admin.getRegister();

		// steps:6 Enter all valid data into text field in Register Page
		RegisterRoomAdmin reg= new RegisterRoomAdmin (driver);
		reg.getpFullname().sendKeys(fullName);
		reg.getpMoblieNum().sendKeys(mobilNum+random1);
		reg.getAlternatMobileNum().sendKeys(alternateNum+random1);
		reg.getemailId().sendKeys(email+"@gmail.com");
		reg.getplotNumber().sendKeys(plot);;
		reg.getAvailableRooms().sendKeys(availableRooms);
		reg.getcountryName().sendKeys(countryName);
		reg.getstateName().sendKeys(stateName);
		reg.getcityName().sendKeys(cityName);
		reg.getRent().sendKeys(rent);
		reg.getDeposit().sendKeys(deposit);
		reg.getLandmark().sendKeys(landMark);
		reg.getAddress().sendKeys(address);
		reg.getVacantOccupied();
		reg.getImagePath().sendKeys("C:\\Users\\DELL\\Desktop\\Photo.png");
		reg.getSubmitButton();

		//navigate to Details and Update
		AdminDashBoard board= new AdminDashBoard(driver);
		board.getDetailsAndUpdate();

		DetailAndUpdateAdmin update= new DetailAndUpdateAdmin (driver);
		update.getComplaint();

		//Raise complaint

		ComplaintsAdmin comp= new ComplaintsAdmin (driver);
		comp.getApartmantName().sendKeys(fullName); 
		comp.getComplaintTextField().sendKeys(complaint);
		comp.getSubmitButton();

		//navigate to complaint list page
		board.getComplaintList();  

		WebElement elea = driver.findElement(By.xpath("//td[.='"+fullName+"']"));
		String comp1 = elea.getText();
		System.out.println(comp1);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView();",elea);
		j.executeScript("arguments[0].style.border='5px solid red'", elea);
		
		//web.executeJavaScriptBorder(driver,"arguments[0].style.border='5px solid red'", elea);
		Thread.sleep(2000);
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(comp1,fullName);
		sa.assertAll();

	}


	//@Test(groups="regression",retryAnalyzer=com.realEstate.paramountProperty.genericUtility.ReTryImp.class)
	@Test()
	public void RegisterIndividualRoomWithoutFullName_Test() throws Throwable
	{
	

		WebDriverUtility web= new WebDriverUtility();


		//create rondom number
		JavaUtility  java= new JavaUtility ();
		int random1 = java.getRandomNumber();
		

		//Steps:2 Read the test data from Excel sheet
		ExcelUtility excel= new ExcelUtility ();

		//String fullName = excel.getExcelData("Sheet1", 10, 2);
		String mobilNum = excel.getExcelData("Sheet1", 10, 3);
		String alternateNum = excel.getExcelData("Sheet1", 10, 4);
		String email = excel.getExcelData("Sheet1", 10, 5);
		String plot = excel.getExcelData("Sheet1", 10,6);
		String availableRooms = excel.getExcelData("Sheet1", 10, 7);
		String countryName = excel.getExcelData("Sheet1", 10, 8);
		String stateName = excel.getExcelData("Sheet1", 10, 9);
		String cityName = excel.getExcelData("Sheet1", 10, 10);
		String rent = excel.getExcelData("Sheet1", 10, 11);
		String deposit = excel.getExcelData("Sheet1", 10, 12);
		String facility = excel.getExcelData("Sheet1", 10, 13);
		String description = excel.getExcelData("Sheet1", 10, 14);
		String landMark = excel.getExcelData("Sheet1", 10, 15);
		String address = excel.getExcelData("Sheet1", 10, 16);


		//Steps:3 Read the test data from property file
		FileUtility propertyFile= new FileUtility();


		String AdminName = propertyFile.getPropertyKeyValue("adminname");
		String AdminPassword = propertyFile.getPropertyKeyValue("adminpassword");

		// steps:3 Navigate to Login button
		Home hm= new Home(driver);
		hm.getNavigetToLogin();

		// steps:4 Enter userName and password(login as Admin)
		LoginPage log= new LoginPage(driver);
		log.getUserName().sendKeys(AdminName);
		log.getPassWord().sendKeys(AdminPassword);
		log.getSubmitButton();

		// steps:5 Navigate to Register 
		AdminDashBoard admin= new AdminDashBoard(driver);
		admin.getRegister();

		// steps:3 Enter all valid data into text field in Register Page
		RegisterRoomAdmin reg= new RegisterRoomAdmin(driver);
		reg.getpMoblieNum().sendKeys(mobilNum+random1);
		reg.getAlternatMobileNum().sendKeys(alternateNum+random1);
		reg.getemailId().sendKeys(email+"@gmail.com");
		reg.getplotNumber().sendKeys(plot);
		reg.getAvailableRooms().sendKeys(availableRooms);
		reg.getcountryName().sendKeys(countryName);
		reg.getstateName().sendKeys(stateName);
		reg.getcityName().sendKeys(cityName);
		reg.getRent().sendKeys(rent);
		reg.getDeposit().sendKeys(deposit);
		reg.getFacility().sendKeys(facility);
		reg.getDescription().sendKeys(description);
		reg.getLandmark().sendKeys(landMark);
		reg.getAddress().sendKeys(address);
		reg.getImagePath().sendKeys("C:\\Users\\DELL\\Desktop\\Owner_Details_Modify_Defect.png");
		reg.getVacantOccupied();
		reg.getSubmitButton();
		
		WebElement fullnameText = reg.getpFullname();
		//web.executeJavaScriptBorder(driver,"arguments[0].style.border='5px solid red'", fullnameText);

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].style.border='5px solid red'", fullnameText);
		Thread.sleep(2000);
		
		String datee = java.dateAndTimeFormat();
		System.out.println(datee);
		
		SoftAssert sa= new SoftAssert();
		sa.assertNotNull(fullnameText);
		sa.assertAll();
		

	}

}
