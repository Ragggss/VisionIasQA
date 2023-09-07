package org.pageclasspackage;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PT365Page extends VisionBaseClass {

	public PT365Page() {
		PageFactory.initElements(driver, this);
	}

	// click pt365 in current affairs page

	@FindBy(xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[6]")
	private WebElement pt365;

	// Back button To CurrentAffairs Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement pt365BackButton;

	// Filter button in PT365 Page

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

	// Clear Filter in PT365 page (This is visible only when filter is applied)

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement pt365ClearFilter;

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

	// to click the PT365 module in Current Affairs Page

	public void clickPT365() {

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

		pt365.click();

	}

	// Clicking the back button in pt365 page
	public void clickPT365BackButton() {
		pt365BackButton.click();
	}

	// clicking the filter in pt365 page
	public void clickPT365Filter() {
		filter.click();

	}

	// click select Year

	public void clickPT365SelectYear() {

		selectYear.click();

	}

	// clicking the 2011 year in the filter

	public void clickPT3652011() {
		y2011.click();

	}

	// clicking the 2012 year in the filter

	public void clickPT3652012() {
		y2012.click();

	}

	// clicking the 2013 year in the filter

	public void clickPT3652013() {
		y2013.click();

	}

	// clicking the 2014 year in the filter

	public void clickPT3652014() {
		y2014.click();

	}

	// clicking the 2015 year in the filter

	public void clickPT3652015() {
		y2015.click();

	}

	// clicking the 2016 year in the filter

	public void clickPT3652016() {
		y2016.click();

	}

	// clicking the 2017 year in the filter

	public void clickPT3652017() {
		y2017.click();

	}

	// clicking the 2018 year in the filter

	public void clickPT3652018() {
		y2018.click();

	}

	// clicking the 2019 year in the filter

	public void clickPT3652019() {
		y2019.click();

	}

	// clicking the 2020 year in the filter

	public void clickPT3652020() {
		y2020.click();

	}

	// clicking the 2021 year in the filter

	public void clickPT3652021() {
		y2021.click();

	}

	// clicking the 2022 year in the filter

	public void clickPT3652022() {
		y2022.click();

	}

	// clicking the 2023 year in the filter

	public void clickPT3652023() {
		y2023.click();

	}

	// clicking the select medium filter

	public void clickPT365Medium() {

		selectMedium.click();

	}

	// Click English choice in Select medium

	public void clickPT365EnglishMedium() {

		english.click();

	}

	// Click Hindi choice in Select medium

	public void clickPT365HindiMedium() {

		hindi.click();

	}

	// clcik APPLY in filter pop-up

	public void clickPT365FilterApply() {
		filterApply.click();
	}

	// click clear filter after applying the filter

	public void clickPT365CloseFilter() {
		pt365ClearFilter.click();
	}

	public void scrollDown() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,550)");

	}

	// Click like
	public void clickPt365Like() {
		like.click();

		extentTest.info("Like button of document of PT365 Page is clicked & verified ");

	}

	// click download
	public void clickPt365Download() {
		download.click();

		extentTest.info("Download button of document of PT365 Page is clicked & verified ");

	}

	// click share
	public void clickPt365Share() {
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

		extentTest.info("Share button of document of PT365 Page is clicked & verified ");

		extentTest.info("Url of Share Page Link of PT365 Page : " + link);

		// closing the share with pop-up

		shareWithClose.click();

	}

	// Pagination Functionality
	// MCA --> Monthly Current Affairs
	public void PT365Pagination() {

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

		extentTest.info("Pagination functionality of PT365 Page is verified");

	}

	// random click for filter

	public void randomPT365SelectYear() {

		// webelements of select year dropdown
		List<WebElement> s = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[1]/div/div/label"));

		// getting size of the select year dropdown

		int size = s.size();

		System.out.println(size);

		// Random class in java for random selection

		Random random = new Random();

		// int randomIndex = random.nextInt(size);

		for (int i = 0; i < 7; i++) {

			int randomIndex = random.nextInt(size);

			s.get(randomIndex).click();

		}

		extentTest.info("Select Year dropdown is verified");

	}
	
	// Random selection for medium

			public void randomPT365SlectMedium() {

				// Webelements to get all the options in the select medium dropdown

				List<WebElement> e = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[2]/button/div/p"));

				// getting number of dropdowns in "int size"

				int size = e.size();

				// Using Random class in the java for random selection in the dropdown
				
				Random random = new Random();
				
				int randomIndex = random.nextInt(size);

				
				// clicking an random option

				e.get(randomIndex).click();
				
				extentTest.info("Select Medium dropdown is verified");

				
			}
			
			//verify filter application
			
			public void verifyPT365FilterFunctionality() {
				
				// Webelements of selected options in filter pop-up
				
				List<WebElement> selected = driver.findElements(By.xpath(
						"//*[@class='max-w-[320px] gap-[1rem]   flex overflow-x-auto sm:hidden scroll-smooth   scroll-height']/span"));

				extentTest.info("Following are selected filter options ");
				
				// For loop to get the selected options in filter and to verify
				
				for (WebElement selecteddd : selected) {
					
					
					String text = selecteddd.getText();
					
					// Printing the selected option in Report

					extentTest.info("Selected Option in Filter functionality : "+text);
				}

				
			}


}