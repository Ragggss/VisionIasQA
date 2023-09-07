package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mains365Page extends VisionBaseClass {

	public Mains365Page() {
		PageFactory.initElements(driver, this);
	}

	// click pt365 in current affairs page

	@FindBy(xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[7]")
	private WebElement mains365;

	// Back button To CurrentAffairs Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement pt365BackButton;

	// Filter button in Mains365 Page

	@FindBy(xpath = "//*[@class='sm:hidden flex ']")
	private WebElement filter;

	// Select Year dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectYear;

	// Select medium dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[2]")
	private WebElement chooseMedium;

	// click somewhere in the page to close the dropdown

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement clickSomewhere;

	// Apply button in filter pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[3]/button")
	private WebElement filterApply;

	// Clear Filter in Mains365 page (This is visible only when filter is applied)

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement mains365ClearFilter;

	// Like button of first document

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[1]")
	private WebElement like;

	// download button of first document

	@FindBy(xpath = "(//*[@class='w-full'])[3]/div/div[2]")
	private WebElement download;

	// Share button of first document

	@FindBy(xpath = "(//*[@class='w-full']/div[2]/div/div[3])[2]")
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

	@FindBy(xpath = "//*[@id='default-9']")
	private WebElement y2014;

	@FindBy(xpath = "//*[@id='default-10']")
	private WebElement y2013;

	@FindBy(xpath = "//*[@id='default-11']")
	private WebElement y2012;

	@FindBy(xpath = "//*[@id='default-12']")
	private WebElement y2011;

	// Following Webelements are to select medium in dropdown

	@FindBy(xpath = "(//*[@class='mt-2'])[2]/div/div")
	private WebElement selectMedium;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement english;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement hindi;

	// to click the Mains365 module in Current Affairs Page

	public void clickMains365() {

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

		mains365.click();

	}

	// Clicking the back button in Mians365 page
	public void clickMains365BackButton() {
		pt365BackButton.click();
	}


	// clicking the filter in Mains365 page
	public void clickMains365Filter() {
		filter.click();

	}
	
	// click the select year in filter pop-up
	
		public void clickMains365SelectYear() {
			selectYear.click();
		}


	// clicking the 2011 year in the filter

	public void clickMains3652011() {
		y2011.click();

	}
	
	

	// clicking the 2012 year in the filter

	public void clickMains3652012() {
		y2012.click();

	}

	// clicking the 2013 year in the filter

	public void clickMains3652013() {
		y2013.click();

	}

	// clicking the 2014 year in the filter

	public void clickMains3652014() {
		y2014.click();

	}

	// clicking the 2015 year in the filter

	public void clickMains3652015() {
		y2015.click();

	}

	// clicking the 2016 year in the filter

	public void clickMains3652016() {
		y2016.click();

	}

	// clicking the 2017 year in the filter

	public void clickMains3652017() {
		y2017.click();

	}

	// clicking the 2018 year in the filter

	public void clickMains3652018() {
		y2018.click();

	}

	// clicking the 2019 year in the filter

	public void clickMains3652019() {
		y2019.click();

	}

	// clicking the 2020 year in the filter

	public void clickMains3652020() {
		y2020.click();

	}

	// clicking the 2021 year in the filter

	public void clickMains3652021() {
		y2021.click();

	}

	// clicking the 2022 year in the filter

	public void clickMains3652022() {
		y2022.click();

	}

	// clicking the 2023 year in the filter

	public void clickMains3652023() {
		y2023.click();

	}

	// clicking the select medium filter

	public void clickMains365Medium() {

		selectMedium.click();

	}

	// Click English choice in Select medium

	public void clickMains365EnglishMedium() {

		english.click();

	}

	// Click Hindi choice in Select medium

	public void clickMains365HindiMedium() {

		hindi.click();

	}

	// clcik APPLY in filter pop-up

	public void clickMains365FilterApply() {
		filterApply.click();
	}

	// click clear filter after applying the filter

	public void clickMains365CloseFilter() {
		mains365ClearFilter.click();
	}

	public void scrollDown() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,550)");

	}

	// Click like
	public void clickMains365Like() {
		like.click();
		
		extentTest.info("Like button of douments of Mians365 Page is clicked & verified");

	}

	// click download
	public void clickMains365Download() {
		download.click();
		
		extentTest.info("Download button of douments of Mians365 Page is clicked & verified");


	}

	// click share
	public void clickMains365Share() {
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

		extentTest.info("Page link of Mains365 Page : "+link);
		
		extentTest.info("Share button of douments of Mians365 Page is clicked & verified");

		
		// clicking to close the Share With pop-up
		
		shareWithClose.click();

	}
	
	public void Mains365Pagination() {
		
		//to scroll down to get the text of last page 

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
		
		extentTest.info("Pagination functionality of Mains365 Page is verified");

	}


}
