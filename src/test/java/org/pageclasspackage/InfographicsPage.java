package org.pageclasspackage;

import java.util.List;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// This Class consist of  Webelements present in Infographics Page

public class InfographicsPage extends VisionBaseClass {

	public InfographicsPage() {
		PageFactory.initElements(driver, this);
	}

	// Back button To Resources Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement BackButton;

	// Filter button in Infographics Page

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
	private WebElement selectSection;

	// click somewhere in the page to close the dropdown

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement clickSomewhere;

	// Apply button in filter pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[3]/button")
	private WebElement filterApply;

	// Clear Filter in TAC page (This is visible only when filter is applied)

	@FindBy(xpath = "//*[@class='flex items-center justify-center gap-[1rem] false']/span")
	private WebElement clearFilter;

	// Following webelements are various years in the select year dropdown

	@FindBy(xpath = "//*[@id='default-0']")
	private WebElement y2020;

	@FindBy(xpath = "//*[@id='default-1']")
	private WebElement y2019;

	@FindBy(xpath = "//*[@id='default-2']")
	private WebElement y2018;

	@FindBy(xpath = "//*[@id='default-3']")
	private WebElement y2017;

	// Following webelemnets are medium

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement english;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement hindi;

	// Following are webelements for select sections

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[3]")
	private WebElement ancientAndMedievelHistory;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[4]")
	private WebElement currentAffairs;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[5]")
	private WebElement ecologyAndEnvironment;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[6]")
	private WebElement economics;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[7]")
	private WebElement economyExternalSector;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[8]")
	private WebElement historyOfModernIndia;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[9]")
	private WebElement indianArtCulture;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[10]")
	private WebElement internationalAfairsAndInstitutions;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[11]")
	private WebElement internationalRelations;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[12]")
	private WebElement personality;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[13]")
	private WebElement polityAndGovernance;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[14]")
	private WebElement scienceAndTechonology;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[15]")
	private WebElement security;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[16]")
	private WebElement socialIssues;

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

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement shareWithClose;

	// page link of share with pop-up

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/span")
	private WebElement pagelink;

	// clicking the filter in TAC page
	public void clickInfoFilter() {
		filter.click();

	}

	// click somewhere

	public void clickInfoSomewhere() {
		clickSomewhere.click();
	}

	// clcik APPLY in filter pop-up

	public void clickInfoFilterApply() {
		filterApply.click();
	}

	// click clear filter after applying the filter

	public void clickInfoCloseFilter() {
		clearFilter.click();
	}

	// click the select year in filter pop-up

	public void clickInfoSelectYear() {
		selectYear.click();
	}

	// clicking the 2017 year in the filter

	public void clickInfo2017() {
		y2017.click();

	}

	// clicking the 2018 year in the filter

	public void clickInfo2018() {
		y2018.click();

	}

	// clicking the 2019 year in the filter

	public void clickInfo2019() {
		y2019.click();

	}

	// clicking the 2020 year in the filter

	public void clickInfo2020() {
		y2020.click();

	}

	// clicking the select medium filter

	public void clickInfoMedium() {

		chooseMedium.click();

	}

	// Click English choice in Select medium

	public void clickInfoEnglishMedium() {

		english.click();

	}

	// Click Hindi choice in Select medium

	public void clickInfoHindiMedium() {

		hindi.click();

	}

	// click Select Subject

	public void clickInfoSelectSection() {
		selectSection.click();
	}

	// click various subjects

	public void clickInfoAncientAndMedievalHistory() {
		ancientAndMedievelHistory.click();
	}

	public void clickInfoCurrentAffairs() {
		currentAffairs.click();
	}

	public void clickInfoEcologyAndEnvironment() {
		ecologyAndEnvironment.click();
	}

	public void clickInfoEconomics() {
		economics.click();
	}

	public void clickInfoEconomyExternalSector() {
		economyExternalSector.click();
	}

	public void clickInfoHistoryOfModernIndia() {
		historyOfModernIndia.click();
	}

	public void clickInfoIndianArtAndCulture() {
		indianArtCulture.click();
	}

	public void clickInfoInternationalAffairsAndInstituions() {
		internationalAfairsAndInstitutions.click();
	}

	public void clickInfoInternationalRelation() {
		internationalRelations.click();
	}

	public void clickInfoPersonality() {
		personality.click();
	}

	public void clickInfoPolityAndGovernance() {
		polityAndGovernance.click();
	}

	public void clickInforScienceAndTechonology() {
		scienceAndTechonology.click();
	}

	public void clickInfoSecuirty() {
		security.click();
	}

	public void clickInfoSocialIssues() {
		socialIssues.click();
	}

	// scroll down

	public void infoScrollDown() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,500)");

	}

	// Click like
	public void clickInfoLike() {
		like.click();

		extentTest.info("Like button of Infographics document is clicked & Verified");

	}

	// click download
	public void clickInfoDownload() {
		download.click();

		extentTest.info("Download button of Infographics document is clicked & verified");

	}

	// click share
	public void clickInfoShare() {
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

		extentTest.info("Page Link of Infographics Page : " + link);

		// clicking to close the Share With pop-up

		shareWithClose.click();

		extentTest.info("Download button of Infographics document is clicked & verified");

	}

	// verify infographics pagination

	public void InfographicsPagination() {

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

		extentTest.info("Pagination functionality of Infographics Page is verified");

	}

}
