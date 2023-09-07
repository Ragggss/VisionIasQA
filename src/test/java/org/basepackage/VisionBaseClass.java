package org.basepackage;


import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilitypackage.ReadConfig;
import org.json.simple.parser.ParseException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class VisionBaseClass {

	public static WebDriver driver;

	// Creating object for ReadConfig class

	ReadConfig readconfig = new ReadConfig();

	// Calling the method from ReadConfig Class

	public String browser = readconfig.getBrowser();
	public String baseURL = readconfig.getApplicationUrl();
	public String email = readconfig.getEmailId();
	public String password = readconfig.getPassword();
	public String title = readconfig.gettitle();
	public String welcomeText = readconfig.getWelcome();
	public String expectedPrelimsText = readconfig.getPrelimsText();
	public String expectedMainsText = readconfig.getMainsText();
	public String expectedClassroomText = readconfig.getClassroomText();
	public String expectedInterviewText = readconfig.getInterviewText();
	public String expectedResourcesText = readconfig.getResourcesText();
	public String expectedClassroomDemoText = readconfig.getClassromDemoText();
	public String expectedOpenTestText = readconfig.getOpenTestText();
	public String expectedAbhyaasText = readconfig.getAbhyaasText();
	public String invlaidEmail1 = readconfig.getInvalidEmail1Text();
	public String invlaidEmail2 = readconfig.getInvalidEmail2Text();
	public String invalidPassword = readconfig.getInvalidPasswordText();
	
	// Extent Report

	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static String screenshotsSubFolderName;

	// This method is used to initiate Extent Report

	@BeforeSuite
	public void initiateExtentReports() {
		extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("AllTests.html");
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.name"));
	}

	// This method is used to generate the Extent Report

	@AfterSuite
	public void generateExtentReport() {
		extentReports.flush();
		try {
			Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// To attach Screenshot to Extent Report
	@AfterMethod
	public void checkStatus(Method m, ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			// String screenshotPath = null;
			// screenshotPath = captureScreenshot(
			// result.getTestContext().getName() + "_" + result.getMethod().getMethodName()
			// + ".jpg");
			String base64 = captureScreenShotBase64();
			extentTest.addScreenCaptureFromBase64String(base64,
					result.getTestContext().getName() + "_" + result.getMethod().getMethodName());
			extentTest.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " is passed");
		}

		extentTest.assignCategory(m.getAnnotation(Test.class).groups());

		extentTest.assignCategory(m.getAnnotation(Test.class).testName());

	}

	/*
	 * 
	 * @AfterMethod public void checkStatus(Method m, ITestResult result) { if
	 * (result.getStatus() == ITestResult.FAILURE) { String screenshotPath = null;
	 * screenshotPath = captureScreenshot( result.getTestContext().getName() + "_" +
	 * result.getMethod().getMethodName() + ".jpg");
	 * extentTest.addScreenCaptureFromPath(screenshotPath);
	 * extentTest.fail(result.getThrowable()); } else if (result.getStatus() ==
	 * ITestResult.SUCCESS) { extentTest.pass(m.getName() + " is passed"); }
	 * 
	 * extentTest.assignCategory(m.getAnnotation(Test.class).groups());
	 * 
	 * extentTest.assignCategory(m.getAnnotation(Test.class).testName());
	 * 
	 * 
	 * }
	 * 
	 */

	// Launching browser
	@BeforeMethod
	public void launch(ITestContext context) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(opt);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("EdgeDriver")) {
			driver = new EdgeDriver();
		}

		
		driver.manage().window().maximize();

		// getCurrentXmlTest method is used to author name via getParameter method

		extentTest = extentReports.createTest(context.getName());
		String author = context.getCurrentXmlTest().getParameter("author");

		// assignAuthor is used to display author name in Extent Report

		extentTest.assignAuthor(author);

	}

	// to quit the browser
	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

	// to pass dataprovider parameter to test cases
	@DataProvider(name = "LD1")
	public String[][] dataProvider() throws Exception {

		// DataProviders is class where data provider method getLoginCredentials is
		// written and the same got below
		String[][] data = DataProviders.getLoginCredentials();
		return data;
	}

	@DataProvider(name = "dpjson")
	public String[] passingJsonData() throws IOException, ParseException {
		String[] users = JsonDataProvider.readJson();
		return users;
	}

	// to capture the screenshot
	public static String captureScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./reports/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return destinationFile.getAbsolutePath();

	}

	public static String captureScreenShotBase64() {

		TakesScreenshot ts = (TakesScreenshot) driver;
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved successfully using base64");
		return base64;

	}

	public void closeCurrentWindow() {
		driver.close();
	}

	public void elementSendData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void quitBrowser() {
		driver.quit();
	}

	public WebElement elementById(String idAttributeValue) {
		WebElement element = driver.findElement(By.id(idAttributeValue));
		return element;
	}

	public WebElement elementByName(String nameAtrributeValue) {
		WebElement element = driver.findElement(By.name(nameAtrributeValue));
		return element;
	}

	public WebElement elementByClassName(String classNameAtrributeValue) {
		WebElement element = driver.findElement(By.name(classNameAtrributeValue));
		return element;
	}

	public WebElement elementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String elementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void Click(WebElement element) {
		element.click();
	}

	public void elementSendDataJs(String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public void elementSendDataJs(String attributename, String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('" + attributename + "','" + data + "')", element);
	}

	public void elementclickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public Object elementGetDataJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object attributeValue = executor.executeScript("arguments[0].getAttribute('value')", element);
		return attributeValue;
	}

	public String elementGetData(WebElement element) {
		String attributeValue = element.getAttribute("value");
		return attributeValue;
	}

	public String elementGetData(WebElement element, String attritubeName) {
		String attributeValue = element.getAttribute(attritubeName);
		return attributeValue;
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);

		actions.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
	}

	public void contextClickAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void sendDataInCaps(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, data).keyUp(Keys.SHIFT).perform();
	}

	public void elementDoubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}

	public void elementScrollDownJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void elementScrollUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void backward() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void optionSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void optionSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void optionSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public List<WebElement> allOptionINDropDown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> allSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> selectedOption = select.getAllSelectedOptions();
		return selectedOption;
	}

	public boolean dropDownIsMultiple(WebElement element) {
		Select select = new Select(element);
		boolean isMultiple = select.isMultiple();
		return isMultiple;
	}

	public void deSelectdropAndDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectdropAndDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deSelectdropAndDownByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectAllOption(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public WebElement elementByTag(String tagName) {
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;
	}

	public void pressDownKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public void pressEnterKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void clearData(WebElement element) {
		element.clear();
	}

	public void windowhandling() {

		String currentWindow = driver.getWindowHandle();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Iterate through all window handles
		for (String window : allWindows) {
			// Switch to the new window
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

	}

}
