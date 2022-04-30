package org.suit;

import java.awt.AWTException;

import org.test.base.Base;
import org.test.pom.PojoHotelSelectionPage;
import org.test.pom.PojoPaymentPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PaymentPage extends Base {
	static PojoPaymentPage paymentPage;
	@BeforeClass
	private void sample() {
		System.out.println("IN - PaymentPage");

	}
	@AfterClass
	private void sample1() {
		System.out.println("Out - PaymentPage");

	}

	@Test()
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
		clickElement(new PojoHotelSelectionPage().getLogOutButton());
	}

}
