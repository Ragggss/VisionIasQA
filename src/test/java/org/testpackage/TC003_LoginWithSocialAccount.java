package org.testpackage;

import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC003_LoginWithSocialAccount extends VisionBaseClass {

	@Test(enabled = false)
	public void test() throws Exception {

		driver.get(baseURL);

		extentTest.info("Vision Website  launched");

		Thread.sleep(3000);

		PageObjectManager pom = new PageObjectManager();

		pom.getLoginPage().clickLoginButton();

		pom.getLoginPage().clickFacebookLoginButton();

		pom.getLoginPage().setFacebookEmail("Raghava.Gandhi@visionias.in");

		pom.getLoginPage().setFacebookPassword("Automation@123");

		Thread.sleep(2000);

		pom.getLoginPage().clickFbSubmitLoginButton();

		synchronized (driver) {

			driver.wait(3000);

		}

		driver.findElement(By.xpath("//*[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84'][1]"))
				.click();

		extentTest.pass("Logged in with Facebook is successful");

		
		synchronized (driver) {

			driver.wait(3000);

		}

		String base2 = captureScreenShotBase64();

		extentTest.addScreenCaptureFromBase64String(base2, "Screenshot of Facebook Login ");

	}

	@Test(enabled = true)
	public void loginWithGoogle() throws Exception {

		driver.get("https://qa.visionias.in/");
		
		extentTest.info("Vision Website launched");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = ' Google']")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.click();
		email.sendKeys("Raghava.Gandhi@visionias.in");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("Visionias@100895");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		
		
		extentTest.info("Login with google account is successful");
		
		
		synchronized (driver) {

			driver.wait(20000);

		}

		
		
		
		String base1 = captureScreenShotBase64();
		extentTest.addScreenCaptureFromBase64String(base1, "Screenshot of google login");
		
		synchronized (driver) {

			driver.wait(2000);

		}

		
		

	}

}
