package billingModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;
import pom.ShoppingCartPage;

public class TS_09Test extends BaseTest{
	@Test
	public void Validate_the_user_can_estimate_the_shipping_with_valid_destination() throws InterruptedException {
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
		Thread.sleep(2000);
		shoppingCart.getEstimateShippingButton().click();
}
}
