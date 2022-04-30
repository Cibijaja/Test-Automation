package org.test.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.URL;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	static Robot chitti = null;
	static Actions act = null;
	static JavascriptExecutor jSE;
	//static Select sel = null;

	public static void initializeChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// Navigation

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void refreshWindow() {
		driver.navigate().refresh();
	}

	public static void moveForward() {
		driver.navigate().forward();
	}

	public static void moveBackward() {
		driver.navigate().back();
	}

	public static void navigateTo(URL url) {
		driver.navigate().to(url);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Browser Command

	public static void closeWindow() {
		driver.close();
	}

	public static void quitWindow() {
		driver.quit();
	}

	// Conditional Command
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	// getComands
	public static void passURL(String uRL) {
		driver.get(uRL);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static WebElement getWebElement(By xpath) {
		return driver.findElement(xpath);
	}

	public static List<WebElement> getWebElements(By xpath) {
		return driver.findElements(xpath);
	}

	// WebElement
	public static String getAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// Action
	public static Actions actonsObject() throws AWTException {
		if (act == null) {
			act = new Actions(driver);
		}
		return act;
	}

	public void mouseHoverAction(WebElement target) throws AWTException {
		actonsObject().moveToElement(target).perform();
	}

	public void mousedragAndDrop(WebElement source, WebElement target) throws AWTException {
		actonsObject().dragAndDrop(source, target).perform();
	}

	public void mouseDoubleClick(WebElement target) throws AWTException {
		actonsObject().doubleClick(target).perform();
	}

	public void mouseDoubleClick() throws AWTException {
		actonsObject().doubleClick().perform();
	}

	public void mouseContextClixk(WebElement target) throws AWTException {
		actonsObject().contextClick(target).perform();
	}

	public void mouseContextClixk() throws AWTException {
		actonsObject().contextClick().perform();
	}

	public void mouseClickAndHold() throws AWTException {
		actonsObject().clickAndHold().perform();
	}

	public void mouseRelease() throws AWTException {
		actonsObject().release();
	}

	public void mouseClickAndHold(WebElement target) throws AWTException {
		actonsObject().clickAndHold(target).perform();
	}

	public void mouseRelease(WebElement target) throws AWTException {
		actonsObject().release(target);
	}

	// Robot
	public static Robot robotObject() throws AWTException {
		if (chitti == null) {
			chitti = new Robot();
		}
		return chitti;
	}

	public static void pressKeyRobot(int keyCode) throws AWTException {
		System.out.println(keyCode);
		robotObject().keyPress(keyCode);
	}

	public static void releaseKeyRobot(int keyCode) throws AWTException {
		robotObject().keyRelease(keyCode);
	}

	/*// JavaScript Executor
	public static JavascriptExecutor javaScriptObject() throws AWTException {
		if (jSE == null) {
			jSE = (JavascriptExecutor) driver;
		}
		return jSE;
	}

	public static void scrollIntoView(WebElement target,boolean condition) {
		jSE.executeScript("arguments[0].scrollIntoView("+condition+")",target);
	}*/
	
	
	//Select

	public static void selectByVisibleText(WebElement dropBox,String visibleText) throws AWTException {
		new Select(dropBox).selectByVisibleText(visibleText);	
	}

	
	
	
	
	
	
	
	
	
	
	


}
