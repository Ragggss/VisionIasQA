package org.pageclasspackage;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// This class consist of WebElements of Toppers Answer Copy Page

public class ToppersAnswerCopyPage extends VisionBaseClass {

	public ToppersAnswerCopyPage() {
		PageFactory.initElements(driver, this);

	}

	// TAC --> Toppers Answer Copy

	// Back button To CurrentAffairs Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement BackButton;

	// Filter button in TAC Page

	@FindBy(xpath = "//*[@class='sm:hidden flex ']")
	private WebElement filter;

	// Select Year dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectYear;

	// Select medium dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[2]")
	private WebElement chooseMedium;

	// select Subject dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[3]")
	private WebElement selectSubject;

	// click somewhere in the page to close the dropdown

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement clickSomewhere;

	// Apply button in filter pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[3]/button")
	private WebElement filterApply;

	// Clear Filter in TAC page (This is visible only when filter is applied)

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement TACClearFilter;

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
	private WebElement y2021;

	@FindBy(xpath = "//*[@id='default-1']")
	private WebElement y2020;

	@FindBy(xpath = "//*[@id='default-2']")
	private WebElement y2019;

	@FindBy(xpath = "//*[@id='default-3']")
	private WebElement y2018;

	@FindBy(xpath = "//*[@id='default-4']")
	private WebElement y2017;

	@FindBy(xpath = "//*[@id='default-5']")
	private WebElement y2016;

	@FindBy(xpath = "//*[@id='default-6']")
	private WebElement y2015;

	@FindBy(xpath = "//*[@id='default-7']")
	private WebElement y2014;

	@FindBy(xpath = "//*[@id='default-8']")
	private WebElement y2013;

	// Following webelemnets are medium

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement english;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement hindi;

	// Following are webelements for select subjects

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[3]")
	private WebElement essay;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[4]")
	private WebElement ethics;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[5]")
	private WebElement generalStudies;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[6]")
	private WebElement geography;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[7]")
	private WebElement philosophy;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[8]")
	private WebElement psychology;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[9]")
	private WebElement publicAdministration;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[10]")
	private WebElement sociology;

	// click back button in TAC

	public void clickTACBackButton() {
		BackButton.click();
	}

	// clicking the filter in TAC page
	public void clickTACFilter() {
		filter.click();

	}

	// click the select year in filter pop-up

	public void clickTACSelectYear() {
		selectYear.click();
	}

	// click somewhere

	public void clickTAVSomewhere() {
		clickSomewhere.click();
	}

	// clicking the 2013 year in the filter

	public void clickTAC2013() {
		y2013.click();

	}

	// clicking the 2014 year in the filter

	public void clickTAC2014() {
		y2014.click();

	}

	// clicking the 2015 year in the filter

	public void clickTAC2015() {
		y2015.click();

	}

	// clicking the 2016 year in the filter

	public void clickTAC2016() {
		y2016.click();

	}

	// clicking the 2017 year in the filter

	public void clickTAC2017() {
		y2017.click();

	}

	// clicking the 2018 year in the filter

	public void clickTAC2018() {
		y2018.click();

	}

	// clicking the 2019 year in the filter

	public void clickTAC2019() {
		y2019.click();

	}

	// clicking the 2020 year in the filter

	public void clickTAC2020() {
		y2020.click();

	}

	// clicking the 2021 year in the filter

	public void clickTAC2021() {
		y2021.click();

	}

	// clicking the select medium filter

	public void clickTACMedium() {

		chooseMedium.click();

	}

	// Click English choice in Select medium

	public void clickTACEnglishMedium() {

		english.click();

	}

	// Click Hindi choice in Select medium

	public void clickTACHindiMedium() {

		hindi.click();

	}

	// click Select Subject

	public void clickTACSelectSubject() {
		selectSubject.click();
	}

	// click various subjects

	public void clickTACEssay() {
		essay.click();
	}

	public void clickTACGeneralStudies() {
		generalStudies.click();
	}

	public void clickTACGeography() {
		geography.click();
	}

	public void clickTACPhilosophy() {
		philosophy.click();
	}

	public void clickTACPsychology() {
		psychology.click();
	}

	public void clickTACPublicAdministration() {
		publicAdministration.click();
	}

	public void clickTACSociology() {
		sociology.click();
	}

	// clcik APPLY in filter pop-up

	public void clickTACFilterApply() {
		filterApply.click();
	}

	// click clear filter after applying the filter

	public void clickTACCloseFilter() {
		TACClearFilter.click();
	}

	// scroll down

	public void tacScrollDown() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,500)");

	}

	// Click like
	public void clickTACLike() {
		like.click();

		extentTest.info("Like button of Toppers Answer Copy document is clicked & Verified");

	}

	// click download
	public void clickTACDownload() {
		download.click();

		extentTest.info("Download button of Toppers Answer Copy document is clicked & verified");

	}

	// click share
	public void clickTACShare() {
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

		extentTest.info("Page Link of Toppers Answers Copy Page : " + link);

		// clicking to close the Share With pop-up

		shareWithClose.click();

		extentTest.info("Download button of Toppers Answers Copy document is clicked & verified");

	}

	// verify Pagination functionality

	public void ToppersAnswersCopyPagination() {

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

		extentTest.info("Pagination functionality of Toppers Answers Copy Page is verified");

	}

	// random click for select year dropdown

	public void randomTACSelectYear() {

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

	public void randomTACSlectMedium() {

		// Webelements to get all the options in the select medium dropdown

		List<WebElement> e = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[2]/button/div/p"));

		// getting number of dropdowns in "int size"

		int size = e.size();

		// Using Random class in the java for random selection in the dropdown

		int randomindex = new Random().nextInt(e.size());

		// clicking an random option

		e.get(randomindex).click();

		extentTest.info("Select Medium dropdown is verified");

	}

	// Random selection for select subjects

	public void randomTACSlectSubjects() {

		// Webelements to get all the options in the select medium dropdown

		List<WebElement> e = driver.findElements(By.xpath("(//*[@x-placement='bottom-start'])[3]/button/div/p"));

		// getting number of dropdowns in "int size"

		int size = e.size();

		// Using Random class in the java for random selection in the dropdown

		int randomindex = new Random().nextInt(e.size());

		// clicking an random option

		e.get(randomindex).click();

		extentTest.info("Select Subject dropdown is verified");

	}

	// random selection for pagination

	public void randomTACSlectPagination() {

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

		int randomindex = new Random().nextInt(size);

		p.get(randomindex).click();

		jk.executeScript("window.scroll(0,-1000)");

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		extentTest.info("Pagination functionality is verified in Toppers Answer Copy");

	}
	
	//verify filter application
	
	public void verifyTACFilterFunctionality() {
		
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
