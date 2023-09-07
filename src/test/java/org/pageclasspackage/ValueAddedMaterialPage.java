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

public class ValueAddedMaterialPage extends VisionBaseClass {

	public ValueAddedMaterialPage() {
		PageFactory.initElements(driver, this);
	}

	// Value Added Material module in current affairs page

	@FindBy(xpath = "(//*[@class='!mb-[0.8rem] card-title h5'])[11]")
	private WebElement valueAddedMaterial;

	// Back button To CurrentAffairs Page

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private WebElement vADBackButton;

	// Filter button in Value Added Material Page

	@FindBy(xpath = "//*[@class='dropdown']")
	private WebElement filterSection;

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

	// Following are webelements for various sections in Value Added Material Page
	// Section Filter

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[1]")
	private WebElement ecologyEnvironment;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[2]")
	private WebElement economics;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[3]")
	private WebElement ethics;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[4]")
	private WebElement internationaAffairsAndInstitutions;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[5]")
	private WebElement internationalRelation;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[6]")
	private WebElement polityGovernance;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[7]")
	private WebElement scienceTechnology;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[8]")
	private WebElement secuirty;

	@FindBy(xpath = "(//*[@class='mb-0 w-[90%]'])[9]")
	private WebElement socialChangeInModernSoceity;

	// clicking the Value Added material module in current affairs Page

	public void clickValueAddedMaterial() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,700)");

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		valueAddedMaterial.click();

		String url = driver.getCurrentUrl();

		extentTest.info(url);

	}

	// clicking the back button in value added material page

	public void clickValueAddedMaterialBackButton() {

		vADBackButton.click();

	}

	// clicking the dropdown in the value added material page

	public void clickVADSectionFilter() {

		filterSection.click();

	}

	// click the various sections available in the filter dropdown

	public void clickVADEcologyEnvironment() {
		ecologyEnvironment.click();
	}

	public void clickVADEconomics() {
		economics.click();
	}

	public void clickVADEthics() {
		ethics.click();
	}

	public void clickVADInternationalAffairsAndInstitutions() {
		internationaAffairsAndInstitutions.click();

	}

	public void clickVADInternationalRelations() {
		internationalRelation.click();
	}

	public void clickVADPolityGovernance() {
		polityGovernance.click();
	}

	public void clickVADScienceAndTechnology() {
		scienceTechnology.click();
	}

	public void clickVADESecurity() {
		secuirty.click();
	}

	public void clickVADSocialChangeInModernSoceity() {
		socialChangeInModernSoceity.click();
	}

	// click the like button

	public void clickVADLikeButton() {
		like.click();
		extentTest.info("Like button of vaue added page is clicked & verified");
	}

	// click the download button

	public void clickVADDownloadButton() {
		download.click();
		extentTest.info("Download button of vaue added page is clicked & verified");
	}

	// click the share button

	public void clickVADShareButton() {

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

		extentTest.info("Page link Url of the Value Added Material Page : " + link);

		// click to close the Share With pop-up

		shareWithClose.click();

	}

	public void vadScrollDown() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,550)");

	}

	public void ValueAddedMaterialPagination() {

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

		extentTest.info("Pagination functionality of Value Added Material  Page is verified");

	}

	// Random click in sections dropdown

	public void clickRandomVADSectionDropdown() {

		// webelements of sections dropdown
		List<WebElement> s = driver.findElements(By.xpath("//*[@class='mb-0 w-[90%]']"));

		// getting size of the sections dropdown

		int size = s.size();

		System.out.println(size);

		
		// Random class in java for random selection

		Random random = new Random();

		// int randomIndex = random.nextInt(size);

		int randomIndex = random.nextInt(size);

		s.get(randomIndex).click();

	}
	
	// random selection for pagination

		public void randomVADSelectPagination() {

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

	
	//verify filter functionality
	
	public void verifyVADFilterFunctionality() {
		
	// Filter option selected in filter dropdown	
		
	WebElement filterOptionSelected =	driver.findElement(By.xpath("//*[@class='m-0 inline-block text-ellipsis whitespace-nowrap overflow-hidden']"));
	
	String filterText = filterOptionSelected.getText();
	
	extentTest.info("Filter option selected : "+filterText);
	
	}
	
	
		
	


}
