package loginModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.LoginPage;

public class TS_04Test extends BaseTest {
	@Test
	public void Validate_the_user_login_with_the_invalid_email_and_password() {
		LoginPage loginpage=new LoginPage(driver);

		loginpage.getLoginLink().click();

		loginpage.getEmailTextField().clear();
		loginpage.getEmailTextField().sendKeys("mamatharangaswamaiah@gmail.com");

		loginpage.getPasswordTextField().clear();
		loginpage.getPasswordTextField().sendKeys("Mamatha143");

		loginpage.getLoginButton().click();
		Reporter.log("TS 04 is succesfull",true);
	}

}
