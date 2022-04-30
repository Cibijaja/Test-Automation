package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Base;

public class PojoHotelFinalSelection extends Base {

	public PojoHotelFinalSelection() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectRadio;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getSelectRadio() {
		return selectRadio;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
