package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class ValueAddedMaterialTest extends VisionBaseClass {

	// Static Test script for filters

	@Test(enabled = false)
	public void testVAD() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(5000);
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

		// clicking Value Added Material module in the current affairs page

		pom.getvalueAddedMaterialPage().clickValueAddedMaterial();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click the section filter

		pom.getvalueAddedMaterialPage().clickVADSectionFilter();

		// clicking various sections in the dropdown

		pom.getvalueAddedMaterialPage().clickVADEcologyEnvironment();

		// pom.getvalueAddedMaterialPage().clickVADEconomics();

		// pom.getvalueAddedMaterialPage().clickVADEthics();

		// pom.getvalueAddedMaterialPage().clickVADInternationalAffairsAndInstitutions();

		// pom.getvalueAddedMaterialPage().clickVADInternationalRelations();

		// pom.getvalueAddedMaterialPage().clickVADPolityGovernance();

		// pom.getvalueAddedMaterialPage().clickVADScienceAndTechnology();

		// pom.getvalueAddedMaterialPage().clickVADESecurity();

		// pom.getvalueAddedMaterialPage().clickVADSocialChangeInModernSoceity();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// to scroll down to like , download, share button
		pom.getvalueAddedMaterialPage().vadScrollDown();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Like button
		pom.getvalueAddedMaterialPage().clickVADLikeButton();

		// download button
		pom.getvalueAddedMaterialPage().clickVADDownloadButton();

		// share link

		pom.getvalueAddedMaterialPage().clickVADShareButton();

	}

	// Value Added material Pagination (Static test script)

	@Test(enabled = false)
	public void testVADPagination() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(5000);
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

		// clicking Value Added Material module in the current affairs page

		pom.getvalueAddedMaterialPage().clickValueAddedMaterial();
		;

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// pagination functionality

		pom.getvalueAddedMaterialPage().ValueAddedMaterialPagination();

	}

	// Random click test script for filter
	@Test

	public void testRandomDropdown() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(5000);
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

		// clicking Value Added Material module in the current affairs page

		pom.getvalueAddedMaterialPage().clickValueAddedMaterial();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// random pagination functionality

		pom.getvalueAddedMaterialPage().randomVADSelectPagination();
		
		// for loop to execute the filter methods in loop
		
		for(int i =0; i<3; i++) {

		// click the section filter

		pom.getvalueAddedMaterialPage().clickVADSectionFilter();

		// Random click in section dropdown filter

		pom.getvalueAddedMaterialPage().clickRandomVADSectionDropdown();
		
		// following wait is for the page to load respective selected filter option datas 
		
		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		// verify Filter functionality

		pom.getvalueAddedMaterialPage().verifyVADFilterFunctionality();
		
		}

	}

}
