package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Base;

public class PojoPaymentPage extends Base{
	public PojoPaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement billingAddress;
	@FindBy(id="cc_num")
	private WebElement creditCardNumber;
	@FindBy(id="cc_type")
	private WebElement creditCardTyper;
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvr;
	@FindBy(id="book_now")
	private WebElement bookNowButton;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getCreditCardTyper() {
		return creditCardTyper;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvr() {
		return cvvr;
	}
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	
	
	
	

}
