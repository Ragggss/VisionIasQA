package org.testpackage;

import java.time.Duration;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class ToppersAnswerCopyTest extends VisionBaseClass {

	// TAC --> Toppers Answer Copy

	// this method test Filter, like, download, share

	@Test(enabled = false)
	public void testFilter() {

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

		// click Toppers Answer Copy module in Resources Page

		pom.getResourcesPage().clickToppersAnswerCopy();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click filter

		pom.getToppersAnswerCopyPage().clickTACFilter();

		// click select year

		pom.getToppersAnswerCopyPage().clickTACSelectYear();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking various years

		pom.getToppersAnswerCopyPage().clickTAC2013();

		pom.getToppersAnswerCopyPage().clickTAC2014();

		pom.getToppersAnswerCopyPage().clickTAC2015();

		pom.getToppersAnswerCopyPage().clickTAC2016();

		pom.getToppersAnswerCopyPage().clickTAC2017();

		pom.getToppersAnswerCopyPage().clickTAC2018();

		pom.getToppersAnswerCopyPage().clickTAC2019();

		pom.getToppersAnswerCopyPage().clickTAC2020();

		pom.getToppersAnswerCopyPage().clickTAC2021();

		// click some where in TAC

		pom.getToppersAnswerCopyPage().clickTAVSomewhere();

		// click choose medium

		pom.getToppersAnswerCopyPage().clickTACMedium();

		// click English Medium

		pom.getToppersAnswerCopyPage().clickTACEnglishMedium();

		// click Hindi Medium

		// pom.getToppersAnswerCopyPage().clickTACHindiMedium();

		// click Select Subject

		pom.getToppersAnswerCopyPage().clickTACSelectSubject();

		// click Various Subjects

		// pom.getToppersAnswerCopyPage().clickTACEssay();

		// pom.getToppersAnswerCopyPage().clickTACGeneralStudies();

		// pom.getToppersAnswerCopyPage().clickTACGeography();

		// pom.getToppersAnswerCopyPage().clickTACPhilosophy();

		// pom.getToppersAnswerCopyPage().clickTACPsychology();

		// pom.getToppersAnswerCopyPage().clickTACPublicAdministration();

		pom.getToppersAnswerCopyPage().clickTACSociology();

		// click apply

		pom.getToppersAnswerCopyPage().clickTACFilterApply();

		// click Clear Filter

		// pom.getToppersAnswerCopyPage().clickTACCloseFilter();

		extentTest.info("Filter Functionality of Toppers Answer Copy verified");

		// scroll down

		pom.getInfographicsPage().infoScrollDown();

		synchronized (driver) {
			try {
				driver.wait(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blockF
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getToppersAnswerCopyPage().clickTACLike();

		// download button
		pom.getToppersAnswerCopyPage().clickTACDownload();

		// share link

		pom.getToppersAnswerCopyPage().clickTACShare();

	}

	// Verify pagination functionality

	@Test(enabled = false)
	public void testTCAPaginaton() {

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

		// click Toppers Answer Copy module in Resources Page

		pom.getResourcesPage().clickToppersAnswerCopy();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify pagination

		pom.getToppersAnswerCopyPage().ToppersAnswersCopyPagination();

	}

	@Test
	public void randomTACTest() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(10000);
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

		// click Toppers Answer Copy module in Resources Page

		pom.getResourcesPage().clickToppersAnswerCopy();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// random selection in pagination

		pom.getToppersAnswerCopyPage().randomTACSlectPagination();

		// click filter

		pom.getToppersAnswerCopyPage().clickTACFilter();

		// click select year

		pom.getToppersAnswerCopyPage().clickTACSelectYear();

		// random click in select year dropdown

		pom.getToppersAnswerCopyPage().randomTACSelectYear();

		// clcik somewhere

		pom.getToppersAnswerCopyPage().clickTAVSomewhere();

		// clicking select medium dropdown

		pom.getToppersAnswerCopyPage().clickTACMedium();

		// random click in select medium dropdown

		pom.getToppersAnswerCopyPage().randomTACSlectMedium();

		// click select Subject dropdown

		pom.getToppersAnswerCopyPage().clickTACSelectSubject();

		// random click in select subject dropdown

		pom.getToppersAnswerCopyPage().randomTACSlectSubjects();

		// click Apply filter

		pom.getToppersAnswerCopyPage().clickTACFilterApply();

		extentTest.info("Filter functionlaity is verified");
		
		// verifying the selected filter option 
		
		pom.getToppersAnswerCopyPage().verifyTACFilterFunctionality();

		
	

	}

}
