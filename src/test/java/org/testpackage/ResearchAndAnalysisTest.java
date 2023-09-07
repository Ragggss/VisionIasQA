package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class ResearchAndAnalysisTest extends VisionBaseClass {

	// ResearchAndAnalysis --> RA

	// Static script for filter

	@Test(enabled = false)
	public void testRA() {

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

		// Click Research And Analysis module in Resources Page
		pom.getResourcesPage().clickResearchAndAnalysis();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click Research And Analysis Filter

		pom.getResearchAndAnalysisPage().clickRAFilter();

		// click select Year

		pom.getResearchAndAnalysisPage().clickRASelectYear();

		// click Years in select year

		pom.getResearchAndAnalysisPage().clickRA2023();

		pom.getResearchAndAnalysisPage().clickRA2022();

		pom.getResearchAndAnalysisPage().clickRA2021();

		pom.getResearchAndAnalysisPage().clickRA2020();

		// click somewhere

		pom.getResearchAndAnalysisPage().clickRASomewhere();

		// click apply in filter pop-up

		pom.getResearchAndAnalysisPage().clickRAApply();

		// clear filter

		// pom.getResearchAndAnalysisPage().clickRAClearFilter();

		extentTest.info("Filter Functionality of Research and analysis is verified");

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
		pom.getResearchAndAnalysisPage().clickRALike();

		// download button
		pom.getResearchAndAnalysisPage().clickRADownload();

		// share link

		pom.getResearchAndAnalysisPage().clickRAShare();

	}

	// static script for pagination

	@Test(enabled = false)
	public void testRAPagination() {

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

		// Click Research And Analysis module in Resources Page
		pom.getResourcesPage().clickResearchAndAnalysis();

		synchronized (driver) {
			try {
				driver.wait(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			pom.getResearchAndAnalysisPage().RAPagination();

		}
	}

	// Random test script
	@Test
	public void randomRATest() {

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

		// Click Research And Analysis module in Resources Page
		pom.getResourcesPage().clickResearchAndAnalysis();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// random selection of pagination

		pom.getResearchAndAnalysisPage().randomRASlectPagination();

		// click filter
		pom.getResearchAndAnalysisPage().clickRAFilter();

		// Click Select Year Dropdown
		pom.getResearchAndAnalysisPage().clickRASelectYear();

		// random selection in select year dropdown

		pom.getResearchAndAnalysisPage().randomRASelectYear();

		// click somewhere

		pom.getResearchAndAnalysisPage().clickRASomewhere();

		// click apply filter

		pom.getResearchAndAnalysisPage().clickRAApply();
		
		// verify filter functionality
		
		pom.getResearchAndAnalysisPage().verifyRAFilterFunctionality();

	}

}
