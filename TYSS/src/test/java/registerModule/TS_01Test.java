package registerModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.RegisterPage;

public class TS_01Test extends BaseTest{ 
	@Test
public void Validate_the_user_registration_with_valid_data() {
		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.getRegisterLink().click();
		
		registerpage.getGenderRadioButton().click();

		registerpage.getFirstNameTextField().clear();
		registerpage.getFirstNameTextField().sendKeys("Mamatha");

		registerpage.getLastNameTextField().clear();
		registerpage.getLastNameTextField().sendKeys("K R");

		registerpage.getEmailTextField().clear();
		registerpage.getEmailTextField().sendKeys("mamatharangaswamaiah@gmail.com");


		registerpage.getPasswordTextField().clear();
		registerpage.getPasswordTextField().sendKeys("Mamatha1234");

		registerpage.getConfirmPasswordTextField().clear();
		registerpage.getConfirmPasswordTextField().sendKeys("Mamatha1234");

		registerpage.getRegisterButton().click();
		
		Reporter.log("TS 01 is succesfull",true);

}
}
