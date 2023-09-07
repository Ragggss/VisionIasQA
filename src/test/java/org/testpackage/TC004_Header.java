package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC004_Header extends VisionBaseClass {

	@Test(enabled = true)
	public void testFacebook() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickFacebookIcon();

		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().getFacebookVisionUrl();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Facebook Vision Page");

		// driver.findElement(By.xpath("//*[@class='xng8ra x6ikm8r x10wlt62 x1n2onr6
		// xh8yej3 x1ja2u2z x1a2a7pz']/div/div/div")).click();

	}

	@Test(enabled = true)
	public void testYoutube() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickYoutubeIcon();

		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().getYoutubeChannel();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Youtube Vision Channel");

	}

	@Test(enabled = true)
	public void testTwitter() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickTwitterIcon();

		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {
			driver.wait(5000);
		}
		pom.getHomePage().getTwitterChannelName();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Twitter Vision Channel");

	}

	@Test(enabled = true)
	public void testInstagram() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickInstagramIcon();

		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {
			driver.wait(5000);
		}

		pom.getHomePage().getInstagramChannelName();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Instagram Vision Channel");

	}

	@Test(enabled = true)
	public void testTelegram() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickTelegramIcon();

		pom.getHomePage().switchingToLoginWindow();

		pom.getHomePage().getTelegramVisionUrl();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");

	}

	@Test(enabled = false)
	public void testDarkMode() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickDarkMode();

		synchronized (driver) {

			driver.wait(3000);

		}

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");

	}

	@Test(enabled = false)
	public void testHeaderImage() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}
		
		pom.getHomePage().clickPhoneIconButton();
		
		synchronized (driver) {

			driver.wait(3000);

		}
		
		pom.getHomePage().getFirstPhoneNumber();
		
		synchronized (driver) {

			driver.wait(1000);

		}

		
		pom.getHomePage().getSecondPhoneNumber();

		

		pom.getHomePage().verifyVisionHeaderImage();

		synchronized (driver) {

			driver.wait(3000);

		}

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");
		
		

	}

	
}
