package shoppingCart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.HomePage;
import pom.ShoppingCartPage;

public class TS_08Test extends BaseTest {
	@Test
	public void removing_Multiple_Product_To_Cart_and_Validating() throws InterruptedException, AWTException {
		HomePage homepage=new HomePage(driver);
		ShoppingCartPage Shoppingcartpage=new ShoppingCartPage(driver);
		homepage.getBookLink().click();
		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);

		homepage.getFictionAddToCart().click();
		Thread.sleep(2000);

		homepage.getHealthbookaddToCartButton().click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1000,30)");
		Thread.sleep(2000);
		homepage.getShoppingCartLink().click();
		for(int i=0;i<3;i++) {
		Shoppingcartpage.getRemoveFromCartCheckBox().click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
				
		}
		Reporter.log("TS 08 is succesfull",true);

	}
}

