package org.test.pom;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.test.base.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelBooking extends Base {
	static PojoLoginPage login;
	static PojoHotelSelectionPage hotelSelection;
	static PojoHotelFinalSelection finalHotelSelection;
	static PojoPaymentPage paymentPage;
	static String currentUrl;

	@BeforeSuite
	public static void startUp() {
		initializeChrome();
		System.out.println("Suite opened");
	}

	@BeforeClass
	private void classStared() {
		System.out.println("Class started");
		passURL("http://adactinhotelapp.com/HotelAppBuild2/");

	}

	@AfterClass
	private void classFinished() {
		System.out.println("Class Fininshd");

	}

	@BeforeMethod
	private void beforeLoginPage() {
		System.out.println("Before");

	}

	@Test(priority = 0)
	public static void pojoLoginPage() {
		login = new PojoLoginPage();
		System.out.println("Test1");
		WebElement userBox = login.getName();
		inputText(userBox, "ShiyamSundar008");
		WebElement passBox = login.getPassCode();
		inputText(passBox, "12345678");
		WebElement loginButton = login.getLoginButton();
		clickElement(loginButton);

	}

	@AfterMethod
	private void afterLoginPage() {
		System.out.println("After login page");
	}

	@Test(priority = 1)
	public static void pojoHotelSelectionPage() throws AWTException, InterruptedException {
		hotelSelection = new PojoHotelSelectionPage();
		System.out.println("Test2");
		selectByVisibleText(hotelSelection.getLocation(), "London");
		Thread.sleep(1000);
		selectByVisibleText(hotelSelection.getHotel(), "Hotel Sunshine");
		selectByVisibleText(hotelSelection.getRoomType(), "Deluxe");
		selectByVisibleText(hotelSelection.getNoRooms(), "3 - Three");
		
		inputText(hotelSelection.getCheckOutDates(), "25/03/2022");
		inputText(hotelSelection.getCheckInDates(), "20/03/2022");
		selectByVisibleText(hotelSelection.getAdultsNo(), "2 - Two");
		selectByVisibleText(hotelSelection.getChildrenNo(), "1 - One");
		clickElement(hotelSelection.getSubmitButton());
	}

	@Test(priority = 2, enabled = false)
	public static void pojoHotelFinalSelectionPage() throws AWTException, InterruptedException {
		finalHotelSelection = new PojoHotelFinalSelection();
		System.out.println("Test3");
		clickElement(finalHotelSelection.getSelectRadio());
		clickElement(finalHotelSelection.getContinueButton());
	}

	@Test(priority = 3)
	public static void pojoPaymentPage() throws AWTException, InterruptedException {
		paymentPage = new PojoPaymentPage();
		System.out.println("Test4");
		inputText(paymentPage.getFirstName(), "Shiyam");
		inputText(paymentPage.getLastName(), "Sundar");
		inputText(paymentPage.getBillingAddress(), "Venice street");
		inputText(paymentPage.getCreditCardNumber(), "1234567890123456");
		selectByVisibleText(paymentPage.getCreditCardTyper(), "American Express");
		selectByVisibleText(paymentPage.getExpiryMonth(), "May");
		selectByVisibleText(paymentPage.getExpiryYear(), "2022");
		inputText(paymentPage.getCvvr(), "066");
		clickElement(paymentPage.getBookNowButton());
		Thread.sleep(5000);
		clickElement(hotelSelection.getLogOutButton());
	}

	@AfterSuite
	public static void closure() {
		System.out.println("Suite closed");
		closeWindow();

	}

}
