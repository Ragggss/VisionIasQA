package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC009_Resources extends VisionBaseClass {

	@Test(enabled = false)
	public void testResourcesPage() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePage().clickResources();

		synchronized (driver) {
			driver.wait(3000);

		}

		String actualResourcesText = pom.getHomePage().getResourcesText();

		assertEquals(actualResourcesText, expectedResourcesText);

		String path = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(path, "Screenshot of Resources");

		extentTest.info("Resources is verified");

	}

	@Test(enabled = true)
	public void test() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getResourcesPage().ClickResources();

		synchronized (driver) {
			driver.wait(2000);

		}

		pom.getResourcesPage().clickCurrentAffairs();
		pom.getResourcesPage().clickSmartQuiz();
		pom.getResourcesPage().quickRevisionMaterial();
		pom.getResourcesPage().clickInfographics();
		pom.getResourcesPage().airNewAnalysis();
		pom.getResourcesPage().upscPaperSolution();
		pom.getResourcesPage().talksAndInterviews();
		pom.getResourcesPage().clickToppersAnswerCopy();
		pom.getResourcesPage().clickResearchAndAnalysis();

	}

}
