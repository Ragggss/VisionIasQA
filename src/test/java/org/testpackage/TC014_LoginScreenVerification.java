package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC014_LoginScreenVerification extends VisionBaseClass {
	
	@Test
	public void welcomeBackTextTest() throws Exception {
		
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}
		
		pom.getLoginPage().clickLoginButton();
		
		Thread.sleep(3000);

	WebElement text =	driver.findElement(By.xpath("//*[@class='text-center sm:mt-[1.6003vh] md:mt-[1em]']"));
	String t1 =text.getText();
	extentTest.info(t1);
		
	}

	@Test(enabled = false)
	public void emptyLoginCrendentialTest() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getLoginPage().clickLoginButton();

		synchronized (driver) {
			driver.wait(5000);

		}

		pom.getLoginPage().clickSubmitLogin();

		synchronized (driver) {
			driver.wait(2000);

		}

		pom.getLoginPage().getErrorEmailMessage();

		pom.getLoginPage().getErrorPasswordMessage();

		String base64 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base64);

	}

	@Test(enabled = false)
	public void invalidEmailidTest() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getLoginPage().clickLoginButton();

		pom.getLoginPage().setEmailId(invlaidEmail1);

		pom.getLoginPage().setPassword(invalidPassword);

		pom.getLoginPage().clickSubmitLogin();

		pom.getLoginPage().getErrorEmailMessage();

		pom.getLoginPage().getErrorPasswordMessage();

		String base64 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base64);

	}

	@Test(enabled = false)
	public void invalidEmailidTest2() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getLoginPage().clickLoginButton();

		pom.getLoginPage().setEmailId(invlaidEmail2);

		pom.getLoginPage().setPassword(password);

		pom.getLoginPage().clickSubmitLogin();

		pom.getLoginPage().getErrorEmailMessage();

		String base64 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base64);

	}

	@Test(enabled = false)
	public void invalidPasswordTest() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getLoginPage().clickLoginButton();

		pom.getLoginPage().setEmailId(email);

		pom.getLoginPage().setPassword(invalidPassword);
		
		pom.getLoginPage().clickEyePasswordIcon();

		pom.getLoginPage().clickSubmitLogin();

		//pom.getLoginPage().getErrorPasswordMessage();

		String base64 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base64);

	}

	@Test(enabled = false)
	public void eyePasswordIconTest() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getLoginPage().clickLoginButton();

		pom.getLoginPage().setEmailId(email);

		pom.getLoginPage().setPassword(password);

		pom.getLoginPage().clickEyePasswordIcon();

		synchronized (driver) {
			driver.wait(3000);

		}

		String base64 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base64);

	}
	
	
	
	@Test(enabled = false)
	public void darkTest() throws Exception {
		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePage().clickDarkMode();
	}

}
