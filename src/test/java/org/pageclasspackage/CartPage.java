package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends VisionBaseClass {

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	// login button in home page

	@FindBy(xpath = "(//*[@class='flex items-center lg:flex-row-reverse lg:grow']/div/div[2])[2]")
	private WebElement loginButtonInHomePage;

	// emailId in login

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailIdPersonality;

	// password in login field

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement passwordPersonality;

	// submit login

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginSubmit;

	public void enterCredentials() {
		
		// click the login button in home page
		
		loginButtonInHomePage.click();

		// enter email id
		emailIdPersonality.sendKeys(email);

		// enter password
		passwordPersonality.sendKeys(password);

		// click submit login button
		loginSubmit.click();

	}

}
