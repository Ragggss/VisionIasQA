package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.support.PageFactory;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class MonthlyCurrentAffairsTest extends VisionBaseClass {

    // Static script for filter selection

	@Test(enabled = false)
	public void monthlyFilter() {

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

		// Clicking monthly current affairs module in Current affairs Page
		pom.getMonthlyCurrentAffairsPage().getMonthlyCurretAffairs();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// like the first document of the page

		pom.getMonthlyCurrentAffairsPage().clickMonthlyLike();

		// download the first document of the page

		pom.getMonthlyCurrentAffairsPage().clickMonthlyDownload();

		// to select filter in Monthly current affairs page

		pom.getMonthlyCurrentAffairsPage().clickMonthlyFilter();
		;

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the dropdown

		pom.getMonthlyCurrentAffairsPage().clickMonthlySelectYearDropdown();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2015();

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2016();

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2023();

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2022();

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2021();

		pom.getMonthlyCurrentAffairsPage().clickMonthlyYear2020();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		pom.getMonthlyCurrentAffairsPage().clickSomewhere();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		pom.getMonthlyCurrentAffairsPage().clickFilterApply();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		/*
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2015();
		 * 
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2016();
		 * 
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2023();
		 * 
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2022();
		 * 
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2021();
		 * 
		 * pom.getMonthlyCurrentAffairsPage().monthlyClose2020();
		 */

		// closing the applied filter by clicking "clear filter"

		// pom.getMonthlyCurrentAffairsPage().clickMonthlyClearFilter();

	}

	// static seledction for pagination 
	
	@Test(enabled = false)
	public void mcaPagination() {

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

		// Clicking monthly current affairs module in Current affairs Page
		pom.getMonthlyCurrentAffairsPage().getMonthlyCurretAffairs();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// pagination

			pom.getMonthlyCurrentAffairsPage().MCAPagination();

		}

	}
	
	//Random selection 
	
	@Test
	public void randomMCATest() {
		
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
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

		// Clicking monthly current affairs module in Current affairs Page
		pom.getMonthlyCurrentAffairsPage().getMonthlyCurretAffairs();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		//random pagination selection
		
		pom.getMonthlyCurrentAffairsPage().randomMCASlectPagination();
		
		//click filter button
		
		pom.getMonthlyCurrentAffairsPage().clickMonthlyFilter();
		
		// click select year dropdown
		
		pom.getMonthlyCurrentAffairsPage().clickMonthlySelectYearDropdown();
		
		//click random year in select year dropdown
		
		pom.getMonthlyCurrentAffairsPage().randomMCASelectYear();
		
		//click somewhere
		
		pom.getMonthlyCurrentAffairsPage().clickSomewhere();
		
		// click Apply filter 
		
		pom.getMonthlyCurrentAffairsPage().clickFilterApply();
		
		

		
	}

}
