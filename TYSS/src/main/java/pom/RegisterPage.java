package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterLink;

	@FindBy(id="gender-female")
	private WebElement GenderRadioButton;

	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;

	@FindBy(id="LastName")
	private WebElement LastNameTextField;		

	@FindBy(id="Email")
	private WebElement EmailTextField;

	@FindBy(id="Password")
	private WebElement PasswordTextField;

	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;

	@FindBy(id="register-button")
	private WebElement RegisterButton;
	
	public WebElement getLogOutLink() {
		return LogOutLink;
	}

	@FindBy(xpath="//a[text()='Log out']")
	private WebElement LogOutLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getGenderRadioButton() {
		return GenderRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
}
