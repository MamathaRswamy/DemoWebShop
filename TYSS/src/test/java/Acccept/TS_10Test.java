package Acccept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;
import pom.ShoppingCartPage;

public class TS_10Test extends BaseTest {
	@Test
	public void Validate_the_user_can_checkout_by_agreeing_the_terms_and_conditions() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		ShoppingCartPage shoppingCart=new ShoppingCartPage(driver);
		
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);
		homepage.getShoppingCartLink().click();
		
		WebElement dropdown = shoppingCart.getCountryDropdown();
		Select select=new Select(dropdown);
		Thread.sleep(2000);
		select.selectByVisibleText("India");
		
		shoppingCart.getEstimateShippingButton().click();
		Thread.sleep(2000);
		shoppingCart.getAgreeTermsAndConditionsCheckBox().click();
		Thread.sleep(2000);
		shoppingCart.getCheckOutButton().click();
		Thread.sleep(2000);
		Reporter.log("TS 10 is succesfull",true);
		
}
}
