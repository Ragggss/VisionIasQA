package org.testpackage;

import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC005_Footer extends VisionBaseClass {
	
	
	@Test(enabled = false)
	public void testFacebook() throws Exception {
		
		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(10000);

		}
		
		pom.getHomePage().clickFooterFacebookIcon();
		
		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().getFacebookVisionUrl();

		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Facebook Vision Page");

		

		
	}
	
	@Test(enabled = false)
	public void testYoutube() throws Exception {
		
		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().clickFooterYoutubeIcon();
		
		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePage().getYoutubeChannel();

		
		
		
	}

	
	@Test(enabled = false)
	public void testInstagram() throws Exception {
		
		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}
		
		pom.getHomePage().clickFooterInstagramIcon();
		
		pom.getHomePage().switchingToLoginWindow();
		
		synchronized (driver) {

			driver.wait(5000);

		}


		
		pom.getHomePage().getInstagramChannelName();



		
	}

	
	@Test(enabled = true)
	public void testTelegram() throws Exception  {
		
		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}
		
		pom.getHomePage().clickFooterTelegramIcon();
		
		pom.getHomePage().switchingToLoginWindow();

		pom.getHomePage().getTelegramVisionUrl();
		
		String base = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");


		

		
	}

	@Test(enabled = false)
	public void testTwitter() throws Exception {
		
		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}
		
		pom.getHomePage().clickFooterTwitterIcon();
		
		pom.getHomePage().switchingToLoginWindow();

		synchronized (driver) {
			
			driver.wait(5000);
			
		}
		pom.getHomePage().getTwitterChannelName();

		


		
	}


}
