package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC008_PersonalityInterviewPage extends VisionBaseClass {

	@Test(enabled = false)
	public void testFunctionalityOfInterviewPage() throws Exception {

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

		// clicking the Interview Module in header of home page

		pom.getInterviewPage().clickInterviewHeader();

		// clicking the Vision Student interview deatils page

		// pom.getInterviewPage().clickVisionStudent();

		// clicking the New Student interview deatils page

		pom.getInterviewPage().clickNewStudent();

	}

	@Test(enabled = false)
	public void testCartPageOfInterviewPageForNewStudent() {

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

		// clicking the Interview Module in header of home page

		pom.getInterviewPage().clickInterviewHeader();

		// verify new student

		pom.getInterviewPage().verifyNewStudent();

	}
	
	@Test
	public void testCartPageOfInterviewPageForVisionIasStudent() {
		
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

		// clicking the Interview Module in header of home page

		pom.getInterviewPage().clickInterviewHeader();

		// verify new student

		pom.getInterviewPage().verifyVisionIasStudent();


		
	}

}
