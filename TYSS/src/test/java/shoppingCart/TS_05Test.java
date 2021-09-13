package shoppingCart;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;

public class TS_05Test extends BaseTest{
	@Test
	public void adding_Single_Product_To_Cart_and_Validating() {
		HomePage homepage=new HomePage(driver);
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();


	}
}
