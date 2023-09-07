package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class HomeTest extends VisionBaseClass {

	// Test method to test various courses under latest courses
	@Test(enabled = false)
	public void test() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

	}

	@Test(enabled = false)
	public void test1() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		driver.findElement(By.xpath("//*[@class='flex items-center lg:flex-row-reverse lg:grow   ']/div/button"))
				.click();

	}

	@Test
	public void testNotices() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		// clicking the Notices in banner and opening the links in New Tabs

		// pom.getHomePage().clickNoticesHome();

		// pom.getHomePage().clickAboutUs();

		// pom.getHomePage().clickTermsOfUse();

		//pom.getHomePage().clickPrivacyPolicy();
		
		pom.getHomePage().clickRefundPolicy();

	}

}
