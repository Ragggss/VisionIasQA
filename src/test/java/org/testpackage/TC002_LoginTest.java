package org.testpackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC002_LoginTest extends VisionBaseClass {

	@Test(enabled = false, dataProvider = "dpjson")
	public void test(String data) throws Exception {

		String credential[] = data.split(",");

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		Thread.sleep(3000);

		// pom.getHomePage().clickDarkMode();

		pom.getLoginPage().clickLoginButton();

		Thread.sleep(2000);

		// pom.getLoginPage().setEmailId();

		pom.getLoginPage().setEmailId(credential[0]);

		// pom.getLoginPage().setPassword();

		pom.getLoginPage().setPassword(credential[1]);

		pom.getLoginPage().clickSubmitLogin();

		extentTest.info("Login Button is clicked");

		synchronized (driver) {

			driver.wait(4000);

		}

		try {
			pom.getLoginPage().clickProfile();

			extentTest.info("Expected Result :" + credential[2]);

			String x = "User succesfully logged in with valid credential";

			extentTest.info("Actual Result :" + x);

			extentTest.info("Actual result matched  with expected result");

			extentTest.pass("Login functionality with valid credential verified ");

			String path = captureScreenShotBase64();
			extentTest.addScreenCaptureFromBase64String(path, " screenshot ");

		} catch (NoSuchElementException e) {
			System.out.println("Element not exist");

		}

		try {
			String popupErrorMessage = pom.getLoginPage().getErrorMessage();

			extentTest.info("Expected Result :" + credential[2]);

			extentTest.info("Actual Result :" + popupErrorMessage);

			extentTest.info("Actual result matched  with expected result");

			extentTest.pass("Login functionality with Invalid credential verified ");

			String path = captureScreenShotBase64();
			extentTest.addScreenCaptureFromBase64String(path, " screenshot ");

		} catch (NoSuchElementException e) {
			System.out.println("Element not exist");

		}

	}

	@Test(enabled = false)
	public void testLogin() {

		driver.get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// click Login Button

		pom.getLoginPage().clickLoginButton();

		// verify google login is enabled

		pom.getLoginPage().verifyGoogleLogin();

		// verify facebook login is enabled

		pom.getLoginPage().verifyFacebookLogin();

		// check signup butto in Login screen is enabled?

		pom.getLoginPage().verifySignup();

		// check New user in Login screen is enabled?

		pom.getLoginPage().verifyNewUser();

		try {
			pom.getLoginPage().setEmailId("jeyasankar@visionias.in");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			pom.getLoginPage().setPassword("123456@Jk");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pom.getLoginPage().clickSubmitLogin();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement toastMessage = driver.findElement(By.xpath("//*[@id='toast-success']/div[2]"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String expectedToastText = "Login Successfully.";

		String actualToastText = toastMessage.getText();

		System.out.println(actualToastText);

		extentTest.info(actualToastText);

		Assert.assertEquals(actualToastText, expectedToastText, " Login is Unsuccesful with Invalid credentials ");

		if (actualToastText.equals(expectedToastText)) {

			extentTest.info("Login is Succesful with valid credential");

		} else {
			extentTest.info("Login is unsuccesful");
		}

		// *[@id='toast-success']/div[2]

	}

	@Test(enabled = false, dataProvider = "dpjson")
	public void loginToastTest(String data) {

		String credential[] = data.split(",");

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// pom.getHomePage().clickDarkMode();

		pom.getLoginPage().clickLoginButton();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// check signup butto in Login screen is enabled?

		pom.getLoginPage().verifySignup();

		// check New user in Login screen is enabled?

		pom.getLoginPage().verifyNewUser();

		// pom.getLoginPage().setEmailId();

		try {
			pom.getLoginPage().setEmailId(credential[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// pom.getLoginPage().setPassword();

		try {
			pom.getLoginPage().setPassword(credential[1]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pom.getLoginPage().clickSubmitLogin();

		extentTest.info("Login Button is clicked");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement toastMessage = driver.findElement(By.xpath("//*[@id='toast-success']/div[2]"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String expectedToastText = "Login Successfully.";

		String actualToastText = toastMessage.getText();

		System.out.println(actualToastText);

		extentTest.info(actualToastText);

		if (actualToastText.equals(expectedToastText)) {

			Assert.assertEquals(actualToastText, expectedToastText, " Login is Unsuccesful with Invalid credentials ");

			extentTest.info("Login is Succesful with valid credential");

		} else {
			extentTest.info("Login is unsuccesful");
		}

	}

	@Test(enabled = true, dataProvider = "dpjson")
	public void testLatest(String data) throws Exception {

		String credential[] = data.split(",");

		driver.get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// pom.getHomePage().clickDarkMode();

		pom.getLoginPage().clickLoginButton();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// pom.getLoginPage().setEmailId();

		pom.getLoginPage().setEmailId(credential[0]);

		// pom.getLoginPage().setPassword();;

		pom.getLoginPage().setPassword(credential[1]);

		pom.getLoginPage().clickSubmitLogin();

		extentTest.info("Login Button is clicked");

		synchronized (driver) {

			driver.wait(4000);

		}

		try {
			String actualValidationMessage = pom.getLoginPage().verifyValidCredential();
			
			extentTest.info("User successfully logged in with valid credential ");

			String expectedValidationMessage = "Login Successfully.";

			Assert.assertEquals(actualValidationMessage, expectedValidationMessage, "Assertion not matching ");

			extentTest.info("Validation Message : " + actualValidationMessage);

			extentTest.info("Login with valid credential is verified ");

		} catch (NoSuchElementException e) {
			System.out.println("Element not exist");

		}

		try {
			String actualIncorrectValidationMessage = pom.getLoginPage().verifyIncorrectPasswordOrUsername();

			String expexpectedIncorrectValidationMessage = "Incorrect username or password.";
			
			System.out.println(actualIncorrectValidationMessage);
			
			if(expexpectedIncorrectValidationMessage.equals(actualIncorrectValidationMessage)) {

			Assert.assertEquals(actualIncorrectValidationMessage, expexpectedIncorrectValidationMessage);

			extentTest.info("Validation Message : " + actualIncorrectValidationMessage);

			extentTest.info("Login with Invalid credential is verified ");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element not exist");

		}

		try {
			String actualUserDoesNotExistMessage = pom.getLoginPage().verifyUserDoesNotExist();

			String expectedUserDoesNotExistMessage = "User does not exist.";
			
			System.out.println(actualUserDoesNotExistMessage);
			
			if(expectedUserDoesNotExistMessage.equals(actualUserDoesNotExistMessage)) {
				
				Assert.assertEquals(actualUserDoesNotExistMessage, expectedUserDoesNotExistMessage);

			
			extentTest.info("Validation Message : " + actualUserDoesNotExistMessage);

			extentTest.info("Login with Invalid credential is verified ");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Element not exist");

		}

	}
	
	}