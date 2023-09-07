package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC010_ClassroomDemo extends VisionBaseClass {

	@Test
	public void test() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePage().clickClassroomDemo();

		synchronized (driver) {
			driver.wait(3000);

		}

		String actualClassroomDemoText = pom.getHomePage().getClassroomDemoText();

		assertEquals(actualClassroomDemoText, expectedClassroomDemoText);
		
		String path = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(path, "Screenshot of ClassroomDemo");
		

	}

}
