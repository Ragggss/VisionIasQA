package org.pageclasspackage;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class MonthlyCurrentAffairsPage extends VisionBaseClass {

	public MonthlyCurrentAffairsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[4]")
	private WebElement monthlyCurrentAffairs;

	@FindBy(xpath = "//*[@class='sm:hidden flex ']")
	private WebElement filter;

	@FindBy(xpath = "//*[@class='dropdown']")
	private WebElement dropdown;

	@FindBy(xpath = "//*[@id='default-0']")
	private WebElement y2023;

	@FindBy(xpath = "//*[@id='default-1']")
	private WebElement y2022;

	@FindBy(xpath = "//*[@id='default-2']")
	private WebElement y2021;

	@FindBy(xpath = "//*[@id='default-3']")
	private WebElement y2020;

	@FindBy(xpath = "//*[@id='default-4']")
	private WebElement y2019;

	@FindBy(xpath = "//*[@id='default-5']")
	private WebElement y2018;

	@FindBy(xpath = "//*[@id='default-6']")
	private WebElement y2017;

	@FindBy(xpath = "//*[@id='default-7']")
	private WebElement y2016;

	@FindBy(xpath = "//*[@id='default-8']")
	private WebElement y2015;

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement clickSomewhere;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement filterApply;

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement monthlyClearFilter;

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[1]")
	private WebElement like;

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[2]")
	private WebElement download;

	@FindBy(xpath = "(//*[@class='w-full']/div[2]/div/div[3])[2]")
	private WebElement share;

	@FindBy(xpath = "//*[@src='/icons/copy.svg']")
	private WebElement shareLinkCopy;

	@FindBy(xpath = "(//*[@stroke='currentColor'])[9]")
	private WebElement shareWithClose;

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/span")
	private WebElement pagelink;

	// (//*[@class='w-[10px] h-[10px] mt-[3px] ml-[16px] cursor-pointer icon-close
	// ResourcesLayout_close_icon__dQHrE'])[]

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span[2]/i")
	private WebElement monthlyClose2023;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span[1]/i")
	private WebElement monthlyClose2022;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span[2]/i")
	private WebElement monthlyClose2021;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span[3]/i")
	private WebElement monthlyClose2020;

	@FindBy(xpath = "(//*[@class='w-[10px] h-[10px] mt-[3px] ml-[16px] cursor-pointer icon-close ResourcesLayout_close_icon__dQHrE'])[5]")
	private WebElement monthlyClose2019;

	@FindBy(xpath = "(//*[@class='w-[10px] h-[10px] mt-[3px] ml-[16px] cursor-pointer icon-close ResourcesLayout_close_icon__dQHrE'])[6]")
	private WebElement monthlyClose2018;

	@FindBy(xpath = "(//*[@class='w-[10px] h-[10px] mt-[3px] ml-[16px] cursor-pointer icon-close ResourcesLayout_close_icon__dQHrE'])[7]")
	private WebElement monthlyClose2017;

	@FindBy(xpath = "(//*[@class='w-[10px] h-[10px] mt-[3px] ml-[16px] cursor-pointer icon-close ResourcesLayout_close_icon__dQHrE'])[8]")
	private WebElement monthlyClose2016;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span/i")
	private WebElement monthlyClose2015;

	public void getMonthlyCurretAffairs() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		monthlyCurrentAffairs.click();
	}

	public void clickMonthlyFilter() {
		filter.click();
	}

	public void clickMonthlySelectYearDropdown() {
		dropdown.click();
	}

	public void clickMonthlyYear2023() {
		y2023.click();

	}

	public void clickMonthlyYear2022() {
		y2022.click();

	}

	public void clickMonthlyYear2021() {
		y2021.click();

	}

	public void clickMonthlyYear2020() {
		y2020.click();

	}

	public void clickMonthlyYear2019() {
		y2019.click();

	}

	public void clickMonthlyYear2018() {
		y2018.click();

	}

	public void clickMonthlyYear2017() {
		y2017.click();

	}

	public void clickMonthlyYear2016() {
		y2016.click();

	}

	public void clickMonthlyYear2015() {
		y2015.click();

	}

	public void clickSomewhere() {
		clickSomewhere.click();
	}

	public void clickFilterApply() {
		filterApply.click();
	}

	public void clickMonthlyClearFilter() {
		monthlyClearFilter.click();
	}

	public void monthlyClose2023() {
		monthlyClose2023.click();

	}

	public void monthlyClose2022() {
		monthlyClose2022.click();

	}

	public void monthlyClose2021() {
		monthlyClose2021.click();

	}

	public void monthlyClose2020() {
		monthlyClose2020.click();

	}

	public void monthlyClose2019() {
		monthlyClose2019.click();

	}

	public void monthlyClose2018() {
		monthlyClose2018.click();

	}

	public void monthlyClose2017() {
		monthlyClose2017.click();

	}

	public void monthlyClose2016() {
		monthlyClose2016.click();

	}

	public void monthlyClose2015() {
		monthlyClose2015.click();

	}

	// This method is to like the document

	public void clickMonthlyLike() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		like.click();
	}

	// this method is to download the document
	public void clickMonthlyDownload() {
		download.click();
	}

	// this method is to share the page link

	public void clickMonthlyShare() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,400)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		share.click();
	}

	public void clickMonthlyShareLink() {
		shareLinkCopy.click();

		String x = pagelink.getText();

		extentTest.info(x);

		shareWithClose.click();
	}

	// MCA --> Monthly Current Affairs
	// Pagination functionality
	public void MCAPagination() {

		// To scroll down to get the text of last page

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

		// "size" is webelement of last page in pagination & siz

		WebElement size = driver.findElement(By.xpath("(//*[@class='page-link'])[8]"));

		// nuber is string variable of text present in last page number

		String number = size.getText();

		// Displaying in the report : No of pages
		extentTest.info("Page number" + number);

		System.out.println(number);

		// type casting from string to integer to perform for loop

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

		extentTest.info("Pagination functionality of Monthly Current Affairs Page is verified");

	}

	// random click for select year dropdown

	public void randomMCASelectYear() {

		// webelements of select year dropdown
		List<WebElement> s = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[1]/div/div/label"));

		// getting size of the select year dropdown

		int size = s.size();

		System.out.println(size);

		for (WebElement ss : s) {
			extentTest.info("Section dropdown : " + ss.getText());
		}

		// Random class in java for random selection

		Random random = new Random();

		// int randomIndex = random.nextInt(size);

		for (int i = 0; i < 3; i++) {

			int randomIndex = random.nextInt(size);

			s.get(randomIndex).click();

		}

		extentTest.info("Select Year dropdown is verified");

	}

	// random selection for pagination

	public void randomMCASlectPagination() {

		// Scroll down

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,1000)");

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Webelements of pagination functionality

		List<WebElement> p = driver
				.findElements(By.xpath("//*[@class='pagination_pagination__2FDlE sm:!m-0  pagination']/li"));

		// getting the size of the pagination functionality

		int size = p.size();
		extentTest.info("No of pagination : " + size);

		// Using Random class in java for clicking the pagination functionality

		Random random = new Random();

		int randomIndex = random.nextInt(size);

		p.get(randomIndex).click();

		jk.executeScript("window.scroll(0,-1000)");

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Pagination functionality is verified in Research and Analysis");

	}

}
