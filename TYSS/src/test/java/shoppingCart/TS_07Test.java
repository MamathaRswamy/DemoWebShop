package shoppingCart;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;
import pom.ShoppingCartPage;

public class TS_07Test extends BaseTest {
	@Test
	public void removing_Single_Product_To_Cart_and_Validating() throws InterruptedException, AWTException {
		HomePage homepage=new HomePage(driver);
		ShoppingCartPage Shoppingcartpage=new ShoppingCartPage(driver);
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		homepage.getShoppingCartLink().click();
		Shoppingcartpage.getRemoveFromCartCheckBox().click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Reporter.log("TS 07 is succesfull",true);
	}
}