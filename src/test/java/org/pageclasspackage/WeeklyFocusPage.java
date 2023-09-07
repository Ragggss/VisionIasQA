package org.pageclasspackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import javax.xml.xpath.XPath;

import org.basepackage.VisionBaseClass;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WeeklyFocusPage extends VisionBaseClass {

	public WeeklyFocusPage() {
		PageFactory.initElements(driver, this);
	}

		// Back button To Resources Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[5]")
	private WebElement backButton;

	// Filter button in WeeklyFocusPage Page

	@FindBy(xpath = "//*[@class='sm:hidden flex ']")
	private WebElement filter;

	// Select Year dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectYear;

	// select medium dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[2]")
	private WebElement selectMedium;

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement clickSomewhere;

	// Apply button in filter pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[3]/button")
	private WebElement filterApply;

	// Clear Filter in ResearchAndAnalysis page (This is visible only when filter is
	// applied)

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement clearFilter;

	// Like button of first document

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[1]")
	private WebElement like;

	// download button of first document

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[2]")
	private WebElement download;

	// Share button of first document

	@FindBy(xpath = "(//*[@class='w-full']/div[2]/div/div[3])[1]")
	private WebElement share;

	// copy button of Share With pop-up

	@FindBy(xpath = "//*[@src='/icons/copy.svg']")
	private WebElement shareLinkCopy;

	// Share with pop-up close

	@FindBy(xpath = "(//*[@stroke='currentColor'])[8]")
	private WebElement shareWithClose;

	// page link of share with pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/span")
	private WebElement pagelink;

	// Following webelements are various years in the select year dropdown

	@FindBy(xpath = "//*[@id='default-0']")
	private WebElement y2023;

	@FindBy(xpath = "//*[@id='default-1']")
	private WebElement y2022;

	@FindBy(xpath = "//*[@id='default-2']")
	private WebElement y2021;

	@FindBy(xpath = "//*[@id='default-3']")
	private WebElement y2020;

	// Following webelements are medium in the choose medium dropdown

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement english;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement hindi;

	// Clicking the back button in WeeklyFocus page
	public void clickWFBackButton() {
		backButton.click();
	}

	// clicking the filter in WeeklyFocus page
	public void clickWFFilter() {
		filter.click();

	}

	// click the select year in filter pop-up

	public void clickWFSelectYear() {
		selectYear.click();
	}

	// click somewhere

	public void clickWFSomewhere() {
		clickSomewhere.click();
	}

	// click apply in filter pop-up

	public void clickWFApply() {
		filterApply.click();
	}

	// clear filter

	public void clickWFClearFilter() {
		clearFilter.click();
	}

	// click various years in the select year dropdown

	public void clickWF2023() {
		y2023.click();

	}

	public void clickWF2022() {
		y2022.click();

	}

	public void clickWF2021() {
		y2021.click();

	}

	public void clickWF2020() {
		y2020.click();

	}

	// clicking the select medium filter

	public void clickWFMedium() {

		selectMedium.click();

	}

	// Click English choice in Select medium

	public void clickWFEnglishMedium() {

		english.click();

	}

	// Click Hindi choice in Select medium

	public void clickWFHindiMedium() {

		hindi.click();

	}

	// Click like
	public void clickWFLike() {
		like.click();

		extentTest.info("Like button of WeeklyFocus page is clicked & verified");

	}

	// click download
	public void clickWFDownload() {
		download.click();

		extentTest.info("Download button of WeeklyFocus page is clicked & verified");

	}

	// click share
	public void clickWFShare() {
		share.click();

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String link = pagelink.getText();

		extentTest.info("Page link Url of the WeeklyFocus Page : " + link);

		// clicking to close the Share With pop-up

		shareWithClose.click();

	}

	// verify Pagination functionality

	public void WFPagination() {

		// to scroll down to get the text of last page

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,800)");

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// size is webelement of last page number
		WebElement size = driver.findElement(By.xpath("(//*[@class='page-link'])[8]"));

		// Number string variable gets number text in last page

		String number = size.getText();
		extentTest.info("Page number" + number);

		System.out.println(number);

		// type casting from string to integer

		int pageNumber = Integer.parseInt(number);

		// for loop to click the next button in pagination

		for (int i = 1; i < pageNumber; i++) {

			WebElement nextButton = driver.findElement(By.xpath("(//*[@stroke='currentColor'])[7]"));

			jk.executeScript("window.scroll(0,1000)");

			synchronized (driver) {
				try {
					driver.wait(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			nextButton.click();

			synchronized (driver) {
				try {
					driver.wait(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		extentTest.info("Pagination functionality of Weekly Focus Page is verified");

	}

	// Random select for select year dropdown

	public void randomFilterSelect() {

		// Webelement to identify the dropdowns in the
		List<WebElement> s = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[1]/div/div/label"));

		// getting the size of the select year dropdown

		int size = s.size();

		// Random class in java for random selection

		Random random = new Random();

		// using for loop to select multiple times randomly

		for (int i = 0; i < 3; i++) {
			int randomIndiex = random.nextInt(size);

			s.get(randomIndiex).click();

		}

		extentTest.info("Select Year dropdown is verified");

		/*
		 * for( WebElement eachYear : s) {
		 * 
		 * extentTest.info(eachYear.getText()); eachYear.click();
		 * 
		 * }
		 */

		// driver.findElement(By.xpath("(//*[@x-placement='bottom-start'])[1]/div/div/label")).click();

	}

	// Random selection for medium

	public void randomWFSlectMedium() {

		// Webelements to get all the options in the select medium dropdown

		List<WebElement> e = driver.findElements(By.xpath("//*[@x-placement='bottom-start']/button/div/p"));

		// getting number of dropdowns in "int size"

		int size = driver.findElements(By.xpath("//*[@x-placement='bottom-start']/button/div/p")).size();

		// Using Random class in the java for random selection in the dropdown

		int randomindex = new Random().nextInt(e.size());

		// clicking an random option

		e.get(randomindex).click();

		extentTest.info("Select Medium dropdown is verified");

		/*
		 * 
		 * for(WebElement medium :e) {
		 * 
		 * String m = medium.getText(); extentTest.info(m);
		 * 
		 * }
		 */

	}

	// random selection for pagination

	public void randomWFSlectPagination() {

		// Scroll down

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		// to scroll down to pagination
		jk.executeScript("window.scroll(0,1000)");

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Webelements of pagination functionality

		List<WebElement> p = driver
				.findElements(By.xpath("//*[@class='pagination_pagination__2FDlE sm:!m-0  pagination']/li"));

		// getting the size of the pagination functionality

		int size = p.size();
		extentTest.info("No of pagination : " + size);

		// Using Random class in java for clicking the pagination functionality

		int randomindex = new Random().nextInt(size);

		p.get(randomindex).click();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Pagination functionality is verified");

		// to scroll up to perform filter functions

		jk.executeScript("window.scroll(0,-1000)");

		synchronized (driver) {
			try {
				driver.wait(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// verify filter application

	public void verifyWFFilterFunctionality() {

		// Webelements of selected options in filter pop-up

		List<WebElement> selected = driver.findElements(By.xpath(
				"//*[@class='max-w-[320px] gap-[1rem]   flex overflow-x-auto sm:hidden scroll-smooth   scroll-height']/span"));

		extentTest.info("Following are selected filter options ");

		// For loop to get the selected options in filter and to verify

		for (WebElement selecteddd : selected) {

			String text = selecteddd.getText();

			// Printing the selected option in Report

			extentTest.info("Selected Option in Filter functionality : " + text);
		}

	}

	// verify Data displayed according to

	// Verify No Data when filter is applied

	public void verifyNoData() {

		// try catch because there is no webelement

		try {

			// webelement of No Data Found image

			WebElement imageNoDataFound = driver.findElement(By.xpath("//*[@alt='No Result Found']"));

			// verify image is displayed

			boolean imageDisplayed = imageNoDataFound.isDisplayed();

			extentTest.info("There is No Data found for above applied data ");
		} catch (NoSuchElementException e) {
			System.out.println("Data are  available");

		}
		/*
		 * if (imageDisplayed) {
		 * extentTest.info("There is No Data found for filter application "); }
		 */

	}

	// Verify Data available

	public void verifyData() {
		
	// t-> topic	
		
	List<WebElement> t =	driver.findElements(By.xpath(""));
	
	// m -> medium
		
	List<WebElement> m =	driver.findElements(By.xpath(""));
	
	// pagination 

	}
}