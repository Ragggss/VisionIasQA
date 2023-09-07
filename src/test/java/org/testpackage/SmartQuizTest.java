package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class SmartQuizTest extends VisionBaseClass {

	@Test(enabled = true)
	public void testSmart() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		// clicking resources module
		pom.getHomePage().clickResources();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking Smart Quiz module
		pom.getResourcesPage().clickSmartQuiz();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the filter button
		pom.getSmartQuizPage().clickSQFilter();

		// clicking Monthly Current Affairs choice in filter dropdown

		pom.getSmartQuizPage().clickSQMCA();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the filter button again to display the filter dropdown
		pom.getSmartQuizPage().clickSQFilter();

		// clicking PT365 choice in filter dropdown

		pom.getSmartQuizPage().clickSQPT365();

		extentTest.info("Filter option of Smart Quiz page is Verified ");

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// scroll down to click Reading material & start quiz
		pom.getSmartQuizPage().scrollDownSQ();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click Reading material
		pom.getSmartQuizPage().clickSQReadingMaterial();

		// click Start Quiz
		pom.getSmartQuizPage().clickSQStartQuiz();

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// pom.getLoginPage().setEmailId();

		try {
			pom.getLoginPage().setEmailId(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// pom.getLoginPage().setPassword();

		try {
			pom.getLoginPage().setPassword(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pom.getLoginPage().clickSubmitLogin();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// again scroll down to click start quiz
		pom.getSmartQuizPage().scrollDownSQ();

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click Start Quiz Again to navigate to respective page post login
		pom.getSmartQuizPage().clickSQStartQuiz();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Instruction Page Functionality verification

		pom.getSmartQuizPage().firstQuizInstruction();

	}

	@Test(enabled = false)

	public void testing() {

		driver.get(baseURL);

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		pom.getLoginPage().clickLoginButton();

		WebElement email1 = driver.findElement(By.xpath("//*[@id='formGridEmail']"));

		// email.click();

		// a.moveToElement(email).sendKeys("TestingPurposeCopyPaste");

		email1.sendKeys("jkjbbj");
		
		Actions a = new Actions(driver);
		
		a.keyDown(email1, Keys.CONTROL).sendKeys("ac").keyUp(Keys.CONTROL).perform();
		
		
		
		a.click(email1).perform();
		
		a.keyDown(email1, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		String s =email1.getAttribute("value");
		
		extentTest.info(s);
		


		//email1.sendKeys(Keys.chord(Keys.CONTROL, "a","c")).

		//email1.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		
		

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// email1.sendKeys(Keys.chord(Keys.CONTROL,"a","c"));
		email1.clear();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		//a.moveToElement(email1).click().sendKeys(Keys.chord(Keys.CONTROL, "v")).build().perform();
		
		a.click(email1).perform();
		
		a.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();

	}

}
