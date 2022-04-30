package org.suit;

import java.awt.AWTException;

import org.test.base.Base;
import org.test.pom.PojoHotelFinalSelection;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FinalSelectionPage extends Base {
	static PojoHotelFinalSelection finalHotelSelection;
	@BeforeTest
	private void sample3() {
		System.out.println("BeforeTest");

	}
	@AfterTest
	private void sample4() {
		System.out.println("After Test");

	}

	@BeforeClass
	private void sample() {
		System.out.println("IN - FinalSelectionPage");

	}
	@AfterClass
	private void sample1() {
		System.out.println("Out - FinalSelectionPage");

	}

	@Test()
	public static void pojoHotelFinalSelectionPage() throws AWTException, InterruptedException {
		finalHotelSelection = new PojoHotelFinalSelection();
		System.out.println("Test3");
		clickElement(finalHotelSelection.getSelectRadio());
		clickElement(finalHotelSelection.getContinueButton());
	}

}
