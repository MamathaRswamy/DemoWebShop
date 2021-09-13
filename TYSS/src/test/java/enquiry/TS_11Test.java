package enquiry;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pom.ShoppingCartPage;

public class TS_11Test extends BaseTest{
	@Test
public void validate_the_user_can_contact_customer_care_for_enquiry() throws InterruptedException {
		ShoppingCartPage shoppingCart=new ShoppingCartPage(driver);
		shoppingCart.getContactUsLinkLink().click();
		shoppingCart.getEnquiryTextField().sendKeys("i cant able to Find Remove element From Cart");
		Thread.sleep(2000);
		shoppingCart.getSubmitButton().click();
}
}
