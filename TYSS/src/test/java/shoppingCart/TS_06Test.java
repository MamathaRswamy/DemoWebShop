package shoppingCart;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;

public class TS_06Test extends BaseTest{
	@Test
	public void adding_Multiple_Product_To_Cart_and_Validating() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);
		homepage.getFictionAddToCart().click();
		Thread.sleep(2000);
		homepage.getHealthbookaddToCartButton().click();

		Reporter.log("TS 06 is succesfull",true);

	}
}
