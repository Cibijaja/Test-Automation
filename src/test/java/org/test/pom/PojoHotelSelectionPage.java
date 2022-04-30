package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Base;

public class PojoHotelSelectionPage extends Base {

	public PojoHotelSelectionPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;	@FindBy(id="hotels")
	private WebElement Hotel;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noRooms;
	@FindBy(id="datepick_in")
	private WebElement checkInDates;
	@FindBy(id="datepick_out")
	private WebElement checkOutDates;
	@FindBy(id="adult_room")
	private WebElement adultsNo;
	@FindBy(id="child_room")
	private WebElement childrenNo;
	@FindBy(id="Submit")
	private WebElement submitButton;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logOutButton;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoRooms() {
		return noRooms;
	}
	public WebElement getCheckInDates() {
		return checkInDates;
	}
	public WebElement getCheckOutDates() {
		return checkOutDates;
	}
	public WebElement getAdultsNo() {
		return adultsNo;
	}
	public WebElement getChildrenNo() {
		return childrenNo;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
}
