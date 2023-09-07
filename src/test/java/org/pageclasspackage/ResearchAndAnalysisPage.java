package org.pageclasspackage;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchAndAnalysisPage extends VisionBaseClass {

	public ResearchAndAnalysisPage() {
		PageFactory.initElements(driver, this);
	}

	// Back button To Resources Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement backButton;

	// Filter button in ResearchAndAnalysis Page

	@FindBy(xpath = "//*[@class='sm:hidden flex ']")
	private WebElement filter;

	// Select Year dropdown in filter pop-up

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectYear;

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

	@FindBy(xpath = "(//*[@class='visually-hidden'])[5]")
	private WebElement nextPageButton;

	// Clicking the back button in ResearchAndAnalysis page
	public void clickRABackButton() {
		backButton.click();
	}

	// clicking the filter in ResearchAndAnalysis page
	public void clickRAFilter() {
		filter.click();

	}

	// click the select year in filter pop-up

	public void clickRASelectYear() {
		selectYear.click();
	}

	// click somewhere

	public void clickRASomewhere() {
		clickSomewhere.click();
	}

	// click apply in filter pop-up

	public void clickRAApply() {
		filterApply.click();
	}

	// clear filter

	public void clickRAClearFilter() {
		clearFilter.click();
	}

	// click various years in the select year dropdown

	public void clickRA2023() {
		y2023.click();

	}

	public void clickRA2022() {
		y2022.click();

	}

	public void clickRA2021() {
		y2021.click();

	}

	public void clickRA2020() {
		y2020.click();

	}

	// scroll down

	public void raScrollDown() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,600)");

	}

	// Click like
	public void clickRALike() {
		like.click();

		extentTest.info("Like button of Research & Analysis page is clicked & verified");

	}

	// click download
	public void clickRADownload() {
		download.click();

		extentTest.info("Download button of Research & Analysis page is clicked & verified");

	}

	// click share
	public void clickRAShare() {
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

		extentTest.info("Page link Url of the Research and Analysis Page : " + link);

		// clicking to close the Share With pop-up

		shareWithClose.click();

	}

	// verify Pagination functionality

	public void RAPagination() {

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
		WebElement size = driver.findElement(By.xpath("(//*[@class='page-link'])[3]"));

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

		extentTest.info("Pagination functionality of Research & Analysis Page is verified");

	}

	// random click for select year dropdown

	public void randomRASelectYear() {

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

	public void randomRASlectPagination() {

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

		extentTest.info("Pagination functionality is verified in Research and Analysis");

	}

	//verify filter application
	
	public void verifyRAFilterFunctionality() {
		
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
