package org.suit;

import java.awt.AWTException;

import org.test.base.Base;
import org.test.pom.PojoHotelSelectionPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelSelectionPage extends Base {
	static PojoHotelSelectionPage hotelSelection;
	
	
	@BeforeClass
	private void sample() {
		System.out.println("IN - HotelSelectionPage");

	}
	@AfterClass
	private void sample1() {
		System.out.println("Out - HotelSelectionPage");

	}


	@Test() 
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
	
}
