package registerModule;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.RegisterPage;


public class TS_02Test extends BaseTest {
	@Test
	public void Validate_the_user_registration_with_invalid_data() {

		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.getRegisterLink().click();

		registerpage.getGenderRadioButton().click();

		registerpage.getFirstNameTextField().clear();
		registerpage.getFirstNameTextField().sendKeys("adarsh");

		registerpage.getLastNameTextField().clear();
		registerpage.getLastNameTextField().sendKeys("K R");

		registerpage.getEmailTextField().clear();
		registerpage.getEmailTextField().sendKeys("mamath@yahhhooo.com");


		registerpage.getPasswordTextField().clear();
		registerpage.getPasswordTextField().sendKeys("Mamatha1234");

		registerpage.getConfirmPasswordTextField().clear();
		registerpage.getConfirmPasswordTextField().sendKeys("Mamapoa1234");

		registerpage.getRegisterButton().click();

		registerpage.getLogOutLink().click();

	}
}
