package org.testpackage;

import java.util.List;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class PT365Test extends VisionBaseClass {

//Static selection for filters
	@Test(enabled = false)
	public void ptTest() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(3000);
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

		// clicking pt365 module in current affairs page
		pom.getCurrentAffairsPage().clickCAPt365();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click filter button

		// clicking filter button in PT365 Page module

		pom.getpt365().clickPT365Filter();

		// click select Year filter

		pom.getpt365().clickPT365SelectYear();

		// click various year

		pom.getpt365().clickPT3652023();

		pom.getpt365().clickPT3652022();

		pom.getpt365().clickPT3652021();

		pom.getpt365().clickPT3652020();

		pom.getpt365().clickPT3652019();

		pom.getpt365().clickPT3652018();

		pom.getpt365().clickPT3652017();

		pom.getpt365().clickPT3652016();

		pom.getpt365().clickPT3652015();

		pom.getpt365().clickPT3652014();

		pom.getpt365().clickPT3652013();

		pom.getpt365().clickPT3652012();

		pom.getpt365().clickPT3652011();

		// click medium dropdown in PT365 Page module

		pom.getpt365().clickPT365Medium();

		// click english medium in medium dropdown

		pom.getpt365().clickPT365EnglishMedium();

		// click hindi medium in medium dropdown

		// pom.getpt365().clickPTHindiMedium();

		// Click Apply in filter pop-up

		pom.getpt365().clickPT365FilterApply();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click close filter in PT365 Page

		// pom.getpt365().clickPT365CloseFilter();

		extentTest.info(" Filter functionality of PT365 page is verified ");

		// to scroll down to like , download, share button
		pom.getpt365().scrollDown();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getpt365().clickPt365Like();

		// download button
		pom.getpt365().clickPt365Download();

		// share link

		pom.getpt365().clickPt365Share();

	}

	// static selection for pagination

	@Test(enabled = false)
	public void PT365Pagnation() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(3000);
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

		// clicking pt365 module in current affairs page
		pom.getCurrentAffairsPage().clickCAPt365();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Pagination functionality of PT365 Page

		pom.getpt365().PT365Pagination();

	}

	// random selection for PT365

	@Test
	public void testPT365Random() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(3000);
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

		// clicking pt365 module in current affairs page
		pom.getCurrentAffairsPage().clickCAPt365();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click filter

		pom.getpt365().clickPT365Filter();

		// click select year

		pom.getpt365().clickPT365SelectYear();

		// random selection in select year

		pom.getpt365().randomPT365SelectYear();

		// click medium

		pom.getpt365().clickPT365Medium();

		// select random medium

		pom.getpt365().randomPT365SlectMedium();

		// clcik apply in filter

		pom.getpt365().clickPT365FilterApply();

		// Verifying the filter application

		pom.getpt365().verifyPT365FilterFunctionality();
	}
}
