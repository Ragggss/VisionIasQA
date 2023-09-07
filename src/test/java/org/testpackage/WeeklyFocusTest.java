package org.testpackage;

import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.NoSuchElementException;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

//this class tests the like , download, share, pagination functionality

public class WeeklyFocusTest extends VisionBaseClass {

	// WF --> Weekly Focus

	@Test(enabled = false)
	public void testWF() {

		driver.get(baseURL);

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
		// click the Resources module in homepage
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click current affairs module
		pom.getResourcesPage().clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click weekly focus page module
		pom.getCurrentAffairsPage().clickCAWeeklyFocus();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click Weekly Focus Filter

		pom.getWeeklyFocusPage().clickWFFilter();

		// click select Year

		pom.getWeeklyFocusPage().clickWFSelectYear();

		// click Years in select year

		pom.getWeeklyFocusPage().clickWF2023();

		pom.getWeeklyFocusPage().clickWF2022();

		pom.getWeeklyFocusPage().clickWF2021();

		pom.getWeeklyFocusPage().clickWF2020();

		// click somewhere

		pom.getWeeklyFocusPage().clickWFSomewhere();

		// click select medium dropdown

		pom.getWeeklyFocusPage().clickWFMedium();

		// click english medium

		pom.getWeeklyFocusPage().clickWFEnglishMedium();

		// click hindi medium

		// pom.getWeeklyFocusPage().clickWFHindiMedium();

		// click apply filter

		pom.getWeeklyFocusPage().clickWFApply();

		// clear filter

		// pom.getWeeklyFocusPage().clickWFClearFilter();

		extentTest.info("Filter Functionality of Weekly Focus is verified");

		// scroll down

		pom.getInfographicsPage().infoScrollDown();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blockF
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getWeeklyFocusPage().clickWFLike();

		// download button
		pom.getWeeklyFocusPage().clickWFDownload();

		// share link

		pom.getWeeklyFocusPage().clickWFShare();

	}

	@Test(enabled = false)
	public void testWFPagination() {

		driver.get(baseURL);

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
		// click the Resources module in homepage
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click current affairs module
		pom.getResourcesPage().clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click weekly focus page module
		pom.getCurrentAffairsPage().clickCAWeeklyFocus();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify pagination

		pom.getWeeklyFocusPage().WFPagination();

	}

	@Test
	public void randomSelectionTest() {

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

		// click the Resources module in homepage
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click current affairs module
		pom.getResourcesPage().clickCurrentAffairs();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click weekly focus page module
		pom.getCurrentAffairsPage().clickCAWeeklyFocus();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// random pagination

		//pom.getWeeklyFocusPage().randomWFSlectPagination();

		// click Weekly Focus Filter

		pom.getWeeklyFocusPage().clickWFFilter();

		// click select Year

		pom.getWeeklyFocusPage().clickWFSelectYear();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// random click of select year

		pom.getWeeklyFocusPage().randomFilterSelect();

		// click somewhere

		pom.getWeeklyFocusPage().clickWFSomewhere();

		// click medium filter

		pom.getWeeklyFocusPage().clickWFMedium();

		// random click on medium

		pom.getWeeklyFocusPage().randomWFSlectMedium();

		// click apply filter

		pom.getWeeklyFocusPage().clickWFApply();

		// verify filter functionality

		pom.getWeeklyFocusPage().verifyWFFilterFunctionality();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		// try catch is used because there is two possibilities either No Data is found
		// or Data is available

		pom.getWeeklyFocusPage().verifyNoData();
		
		pom.getWeeklyFocusPage().verifyData();
	}

}
