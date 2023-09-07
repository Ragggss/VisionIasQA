package org.pageclasspackage;

import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage extends VisionBaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
		

	}

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/nav/div/div/div[1]/div[2]")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailId;

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement pwd;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submitLogin;

	@FindBy(xpath = "(//*[@class='col'])[2]/div/div[1]")
	private WebElement incorrectUsernamrOrPasswordMessage;

	@FindBy(xpath = "(//*[@class='col'])[1]/div[2]")
	private WebElement userDoesNotExistMessage;

	@FindBy(xpath = "//*[@class='sm:hidden']")
	private WebElement profile;

	public void clickProfile() {
		profile.click();
	}

	@FindBy(xpath = "//*[@class='text-[#dc3545] mb-0']")
	private WebElement errorMessage;

	@FindBy(xpath = "//*[@class='flex justify-around items-center gap-[10px] sm:!mt-1 mt-[20px]']/button[2]")
	private WebElement facebookLoginButton;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement facebookEmail;

	@FindBy(xpath = "//*[@id='pass']")
	private WebElement facebookPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement facebookLoginSubmitButton;

	@FindBy(xpath = "//*[@class='flex justify-around items-center gap-[10px] sm:!mt-1 mt-[20px]']/button[1]")
	private WebElement googleLogin;

	@FindBy(xpath = "//*[@id=\'identifierId\']")
	private WebElement googleEmail;

	@FindBy(xpath = "//*[@id='identifierNext']/div/button/span")
	private WebElement googleNextButton;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement googlePassword;

	@FindBy(xpath = "//*[@class='invalid-feedback']")
	private WebElement errorEmailMessage;

	@FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
	private WebElement errorPasswordMessage;

	@FindBy(xpath = "//*[@class='absolute right-[1rem] bottom-[1.25rem]']")
	private WebElement eyePasswordIcon;

	public void setGoogleEmail(String email) {
		googleEmail.sendKeys(email);

	}

	public void setGooglePassword(String password) throws Exception {

		synchronized (driver) {
			driver.wait(2000);

		}
		googleEmail.sendKeys(password);

	}

	public void setGoolgePassword2() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement googlePasswordd = driver.findElement(By.xpath("//*[@type='password']"));
		System.out.println("Element Found");
		jk.executeScript("arguments[0].setAttribute('value', 'Visionias@100895')", googlePasswordd);
		// return errorMessage2 ;
	}

	public void clickGoogleNextButton() {
		googleNextButton.click();
	}

	@FindBy(xpath = "//*[@class='flex flex-col lg:py-3 ']/div[1]/p[1]")
	private WebElement welcome;

	public String getErrorMessage2() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement errorMessage2 = driver.findElement(By.xpath("//div[@class='block !text-[#dc3545] valid-feedback']"));
		jk.executeScript("arguments[0].click()", loginButton);
		// return errorMessage2 ;
		String errorText = errorMessage2.getText();
		System.out.println(errorText);
		return errorText;
	}

	public String getErrorMessage() throws Exception {

		String error = errorMessage.getText();
		System.out.println(error);
		return error;
	}

	public void clickLoginButton() {

		loginButton.click();
	}

	public void setEmailId(String emailll) throws Exception {
		emailId.click();
		/*
		 * synchronized (driver) { driver.wait(1000);
		 * 
		 * }
		 */
		emailId.sendKeys(emailll);
	}

	public void setPassword(String pwddd) throws Exception {
		pwd.click();
		/*
		 * synchronized (driver) { driver.wait(1000);
		 * 
		 * }
		 */
		pwd.sendKeys(pwddd);
	}

	public void clickSubmitLogin() {
		Click(submitLogin);
	}

	public void clickFacebookLoginButton() {
		facebookLoginButton.click();
	}

	public void setFacebookEmail(String email) {
		facebookEmail.sendKeys(email);
	}

	public void setFacebookPassword(String password) {
		facebookPassword.sendKeys(password);
	}

	public void clickFacebookLoginSubmitButton() {
		facebookLoginSubmitButton.click();
	}

	public void clickFbSubmitLoginButton() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement FbSubmitLoginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		jk.executeScript("arguments[0].click()", FbSubmitLoginButton);
		// return errorMessage2 ;
	}

	public void clickGoogleLogin() {
		googleLogin.click();
	}

	public String getWelcome() throws Exception {

		synchronized (driver) {
			driver.wait(3000);

		}
		String text = welcome.getText();
		System.out.println(text);
		return text;
	}

	public void getErrorEmailMessage() {
		String message = errorEmailMessage.getText();

		extentTest.info(message);

	}

	public void getErrorPasswordMessage() {

		String message = errorPasswordMessage.getText();

		extentTest.info(message);

	}

	public void clickEyePasswordIcon() {
		eyePasswordIcon.click();

	}

	// Validate succesful login
	public String verifyValidCredential() {

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// String expectedValidationMessage = "Login Successfully.";

		WebElement toastMessage = driver.findElement(By.xpath("//*[@id='toast-success']/div[2]"));

		String actualValidationMessage = toastMessage.getText();

		return actualValidationMessage;

		// Assert.assertEquals(actualValidationMessage, expectedValidationMessage);

	}

	// Validate incorrect username or password
	public String verifyIncorrectPasswordOrUsername() {

		String expectedValidationMessage = "Incorrect username or password.";

		String actualValidationMessage = incorrectUsernamrOrPasswordMessage.getText();

		return actualValidationMessage;

		// System.out.println(actualValidationMessage);
		// extentTest.info("Validation message : "+actualValidationMessage);
		// Assert.assertEquals(actualValidationMessage, expectedValidationMessage);

		// extentTest.info("Login crendential with incorrect password is validated &
		// login is failed ");

	}

	// Validate User does not exist
	public String verifyUserDoesNotExist() {

		String expectedValidationMessage = "User does not exist.";

		String actualValidationMessage = userDoesNotExistMessage.getText();

		return actualValidationMessage;
		// System.out.println(actualValidationMessage);
		// extentTest.info("Validation message : " + actualValidationMessage);
		// Assert.assertEquals(actualValidationMessage, expectedValidationMessage);

		// extentTest.info("Login crendential with non-registered email is validated &
		// login is failed");

	}

	// verify google login is enabled

	public void verifyGoogleLogin() {
		boolean expectedGoogleLoginValue = true;
		boolean actualGoogleLoginValue = googleLogin.isEnabled();
		Assert.assertEquals(actualGoogleLoginValue, expectedGoogleLoginValue);

		extentTest.info("Google login  button in the login screen is enabled ");

	}

	// verify facebook login is enabled

	public void verifyFacebookLogin() {
		boolean expectedFacebookLoginValue = true;
		boolean actualFacebookLoginValue = facebookLoginButton.isEnabled();
		Assert.assertEquals(actualFacebookLoginValue, expectedFacebookLoginValue);

		extentTest.info("Facebook login  button in the login screen is enabled ");

	}

	// verify New user is enabled

	public void verifyNewUser() {
		WebElement newUser = driver.findElement(By.xpath("(//*[@class='col'])[3]/a"));
		boolean expectedNewUserValue = true;
		boolean actualNewUserValue = newUser.isEnabled();

		Assert.assertEquals(actualNewUserValue, expectedNewUserValue);

		extentTest.info("NewUser button in the login screen is enabled ");

	}

	// verify signup is enabled

	public void verifySignup() {

		WebElement signupCheck = driver.findElement(By.xpath("(//*[@class='col'])[3]/a/span"));
		boolean expectedSignupValue = true;
		boolean actualSignupValue = signupCheck.isEnabled();

		Assert.assertEquals(actualSignupValue, expectedSignupValue);

		extentTest.info("Signup button in the login screen is enabled ");

	}

	// Verify boundary value for email field text

	public String verifyBoundaryValue1(int minimumLength, int maximumLength) {

		// Creating insatnce for Random class

		Random random = new Random();

		// Last 10 digits are fixed for "@gmail.com"

		int last10Char = 10;

		// creating random length

		int randomlength = random.nextInt(maximumLength - minimumLength + 1) + minimumLength;

		// maximum character

		int maximumLengthLessLast10Characters = randomlength - last10Char;

		// Stringbuilder to store the values

		StringBuilder sb = new StringBuilder();

		// Auto generating Alphanumeric string

		for (int i = 0; i < maximumLengthLessLast10Characters; i++) {

			// random number bound is 62 because 0-9 digits, 26 LowerCase alphabets, 26
			// upper case alphabets
			int randomNumber = random.nextInt(62);

			// creating char instance

			char autoChar;
			// if random number is 1 to 9 it will return numrical digit
			if (randomNumber < 10) {
				// typcasting from int to character

				autoChar = (char) (randomNumber + '0');
			}
			// if random number is between 10 to 35 it will return Upper Case Alphabets
			// character
			else if (randomNumber < 36) {
				// typcasting from int to character
				autoChar = (char) (randomNumber + 'A');
			}
			// when the random number is nbetween 36 to 62 , it will return lower case
			// Alphabets
			else {
				// typcasting from int to character
				autoChar = (char) (randomNumber + 'a');
			}

			sb.append(autoChar);
		}
		sb.append("@gmail.com");

		return sb.toString();

	}
	
	// latest code for generating 
	
	public static String createAutoPassword() {

		final String charactersAllowedPassword = "Abc";

		// Creating instance for random object
		Random random = new Random();

		// stating length of the the passwor dto be created

		int passwordLimits = random.nextInt(11) + 6;

		// creatng instance for StringBuilder to store and append the created password
		// character

		StringBuilder sb = new StringBuilder();

		// creating for loop to iterate with passwordLimit int as condition

		for (int i = 0; i < passwordLimits; i++) {

			// creating instance for Character

			char autoPasswordCharacter;

			/*
			 * creating do while loop to check the given condition of 1st and last (16th) //
			 * character should not be neither Space nor emoji's
			 * 
			 */

			do {
				autoPasswordCharacter = charactersAllowedPassword
						.charAt(random.nextInt(charactersAllowedPassword.length()));
			} while ((i == 0) || (i == 15) && (autoPasswordCharacter == 'A' || autoPasswordCharacter == 'b'
					|| Character.isSurrogate(autoPasswordCharacter)));

			sb.append(autoPasswordCharacter);

		}

		return sb.toString();

	}
	
	// 255 Character to test upper limit in email text field

	public String verify255UpperBoundary(int maximumLength, String last10Charcater) {

		// creating instance for String builder

		StringBuilder sb = new StringBuilder();

		// creating instance for random class

		Random random = new Random();

		// Auto creation of Alphanumeric String

		for (int i = 0; i < maximumLength; i++) {
			if (i < maximumLength - 10) {
				// getting all 62 character including 10 digits, 26 lower case , 26 upper case
				// alphabets
				int randomNumber = random.nextInt(62);
				if(randomNumber<10) {
					sb.append((char)(randomNumber+48));
				}
				else if(randomNumber < 36) {
					// upper case letter
					
					sb.append((char)(randomNumber+55));
				}
				else {
					sb.append((char)(randomNumber+61));
				}
			}
			else {
				// append the last10 digits
				sb.append(last10Charcater.charAt(i-(maximumLength-10)));
			}
		}
		return sb.toString();
	}
}