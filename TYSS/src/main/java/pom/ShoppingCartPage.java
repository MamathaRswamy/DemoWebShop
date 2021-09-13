package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(name="itemquantity1970758")
	private WebElement FictionqtyTextbox;
	
	@FindBy(name="itemquantity1970759")
	private WebElement ComputerAndInternetqtyTextbox;
	
	@FindBy(name="itemquantity1970762")
	private WebElement HealthbookqtyTextbox;
	
}
