package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Base;

public class PojoLoginPage extends Base {

	public PojoLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement name;
	@FindBy(id="password")
	private WebElement passCode;
	@FindBy(id="login")
	private WebElement loginButton;
	
	
	
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	public WebElement getPassCode() {
		return passCode;
	}
	public void setPassCode(WebElement passCode) {
		this.passCode = passCode;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

}
