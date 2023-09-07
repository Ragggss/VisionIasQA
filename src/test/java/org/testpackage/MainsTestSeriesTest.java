package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.interactions.Actions;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class MainsTestSeriesTest extends VisionBaseClass {

	@Test(enabled = true)
	public void filterFuntionalityTest() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Test series Module in header of the home page
		pom.getMainsTestSeriesPage().clickTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Mains test series under Test series module in header
		pom.getMainsTestSeriesPage().clickMainsTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click filter button of Mains Test Series Page

		pom.getMainsTestSeriesPage().clickMainsFilter();

		// click select year dropdown

		// pom.getMainsTestSeriesPage().clickMainsSelectYearDropdown();

		// click various years in select year dropdown

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage().clickMiansSomewhere();

		// select tests in test dropdowmn

		pom.getMainsTestSeriesPage().selectTestInkMainsTestDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage().clickMiansSomewhere();

		// select subject in sibject dropdown

		pom.getMainsTestSeriesPage().selectSubjectInkMainsSubjectDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage().clickMiansSomewhere();

		// selectv medium in select medium dropdown

		pom.getMainsTestSeriesPage().selectMediumInMainsTestDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage().clickMiansSomewhere();

		// select year in select year dropdown

		pom.getMainsTestSeriesPage().selectYearInMainsSelectYearDropdown();

		// click somewhere to close the opened dropdown

		pom.getMainsTestSeriesPage().clickMiansSomewhere();
		
		// click apply filter in filter pop-up
		
		pom.getMainsTestSeriesPage().clickApplyFilterPopup();

	}
	
	@Test(enabled = false)
	public void functionaalityTest() {
		
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Test series Module in header of the home page
		pom.getMainsTestSeriesPage().clickTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the Mains test series under Test series module in header
		pom.getMainsTestSeriesPage().clickMainsTestSeriesM();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		// click a card in the page
		
		pom.getMainsTestSeriesPage().clickCard();
		
		

		
	}

}
