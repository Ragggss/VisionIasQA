package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

/*
 *  This class is Test Class of Infographics Page 
 *  The Each method name  of this class  represents the particular test to be carried out in Infographics Page
 */
public class InfographicsTest extends VisionBaseClass {

	// This method tests the filter functionality of the infographics page

	@Test(enabled = false)
	public void testInfoFilter() {

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

		// Click Infographics module in Resources Page
		pom.getResourcesPage().clickInfographics();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click Infographics Filter

		pom.getInfographicsPage().clickInfoFilter();

		// click select Year

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		pom.getInfographicsPage().clickInfoSelectYear();

		// click Years in select year

		pom.getInfographicsPage().clickInfo2020();

		pom.getInfographicsPage().clickInfo2019();

		pom.getInfographicsPage().clickInfo2018();

		pom.getInfographicsPage().clickInfo2017();

		// click somewhere

		pom.getInfographicsPage().clickInfoSomewhere();

		// click choose mededium

		pom.getInfographicsPage().clickInfoMedium();

		// click English

		pom.getInfographicsPage().clickInfoEnglishMedium();

		// click Hindi

		// pom.getInfographicsPage().clickInfoHindiMedium();

		// click Select section

		pom.getInfographicsPage().clickInfoSelectSection();

		// click various sections

		// pom.getInfographicsPage().clickInfoAncientAndMedievalHistory();

		// pom.getInfographicsPage().clickInfoCurrentAffairs();

		// pom.getInfographicsPage().clickInfoEcologyAndEnvironment();

		// pom.getInfographicsPage().clickInfoEconomics();

		// pom.getInfographicsPage().clickInfoEconomyExternalSector();

		// pom.getInfographicsPage().clickInfoHistoryOfModernIndia();

		// pom.getInfographicsPage().clickInfoIndianArtAndCulture();

		// pom.getInfographicsPage().clickInfoInternationalAffairsAndInstituions();

		// pom.getInfographicsPage().clickInfoInternationalRelation();

		// pom.getInfographicsPage().clickInfoPersonality();

		// pom.getInfographicsPage().clickInfoPolityAndGovernance();

		// pom.getInfographicsPage().clickInforScienceAndTechonology();

		// pom.getInfographicsPage().clickInfoSecuirty();

		pom.getInfographicsPage().clickInfoSocialIssues();

		// click Apply

		pom.getInfographicsPage().clickInfoFilterApply();

		// click clear filter

		// pom.getInfographicsPage().clickInfoCloseFilter();

		extentTest.info("Filter Functionality of Infographis Page is verified");

		// scroll down --> this is to scroll down to carry out like, download & share
		// functionlaity

		pom.getInfographicsPage().infoScrollDown();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blockF
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getInfographicsPage().clickInfoLike();

		// download button
		pom.getInfographicsPage().clickInfoDownload();

		// share link

		pom.getInfographicsPage().clickInfoShare();

	}
	
	//Verify Pagination functionality of 
	
	@Test(enabled = true)
	public void testInfoPagination() {
		
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

		// Click Infographics module in Resources Page
		pom.getResourcesPage().clickInfographics();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		// pagination functionality of infographics page
		
		pom.getInfographicsPage().InfographicsPagination();

		
	}

}
