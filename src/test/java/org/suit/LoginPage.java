package org.suit;

import org.openqa.selenium.WebElement;
import org.test.base.Base;
import org.test.pom.PojoLoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage extends Base{
	static PojoLoginPage login;
	
	
	
	
	
	@BeforeClass
	private void classStared() {
		initializeChrome();
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

	@Test()
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
	
	
}
