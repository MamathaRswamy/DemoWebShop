package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[contains(@onclick,'/addproducttocart/catalog/13/1/1')]")
	private WebElement ComputingAndInternetaddToCartButton;
	
	@FindBy(xpath="//input[contains(@onclick,'/addproducttocart/catalog/45/1/1')]")
	private WebElement FictionAddToCart;
	
	@FindBy(xpath="//input[contains(@onclick,'/addproducttocart/catalog/22/1/1')]")
	private WebElement HealthbookaddToCartButton;
	
	@FindBy(className="ico-logout")
	private WebElement logOutButton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCartLink;
	
	@FindBy(xpath="//a[text()='book']")
	private WebElement BookLink;

	public WebElement getComputingAndInternetaddToCartButton() {
		return ComputingAndInternetaddToCartButton;
	}

	public WebElement getFictionAddToCart() {
		return FictionAddToCart;
	}

	public WebElement getHealthbookaddToCartButton() {
		return HealthbookaddToCartButton;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public WebElement getBookLink() {
		return BookLink;
	}

	

}
