package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class Mains365Test extends VisionBaseClass {

	@Test(enabled = false)
	public void filterMains365Test() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// clicking the Resources module in homepage
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Clicking current affairs module in Resources Page
		pom.getResourcesPage().clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking Mains365 page in the current affairs page

		pom.getmains365().clickMains365();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the filter in Mains365 module

		pom.getmains365().clickMains365Filter();

		// clicking select year in the filter pop-up

		pom.getmains365().clickMains365SelectYear();

		// clicking various year in the select year drop down

		pom.getmains365().clickMains3652023();

		pom.getmains365().clickMains3652022();

		pom.getmains365().clickMains3652021();

		pom.getmains365().clickMains3652020();

		pom.getmains365().clickMains3652019();

		pom.getmains365().clickMains3652018();

		pom.getmains365().clickMains3652017();

		pom.getmains365().clickMains3652016();

		pom.getmains365().clickMains3652015();

		pom.getmains365().clickMains3652014();

		pom.getmains365().clickMains3652013();

		pom.getmains365().clickMains3652012();

		pom.getmains365().clickMains3652011();

		// clicking select medium in filter pop-up

		pom.getmains365().clickMains365Medium();

		// clicking english medium

		// pom.getmains365().clickMains365EnglishMedium();

		// clicking Hindi medium

		pom.getmains365().clickMains365HindiMedium();

		// clicking the Apply in filter pop-up

		pom.getmains365().clickMains365FilterApply();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Clear Filters

		// pom.getmains365().clickMains365CloseFilter();

		extentTest.info("Filter functionality of Mains365 Page is verfied");

		// to scroll down to like , download, share button
		pom.getmains365().scrollDown();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getmains365().clickMains365Like();

		// download button
		pom.getmains365().clickMains365Download();

		// share link

		pom.getmains365().clickMains365Share();

	}
	
	
	// Pagination funtionality test method
	
	@Test(enabled = true)
	public void testMains365Pagination(){
		
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// clicking the Resources module in homepage
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Clicking current affairs module in Resources Page
		pom.getResourcesPage().clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking Mains365 page in the current affairs page

		pom.getmains365().clickMains365();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Pagination Functionality
		
		pom.getmains365().Mains365Pagination();

		
	}

}
