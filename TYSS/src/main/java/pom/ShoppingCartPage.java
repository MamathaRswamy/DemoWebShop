package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public WebElement getFictionqtyTextbox() {
		return FictionqtyTextbox;
	}

	

	public WebElement getRemoveFromCartCheckBox() {
		return RemoveFromCartCheckBox;
	}



	public WebElement getHealthbookqtyTextbox() {
		return HealthbookqtyTextbox;
	}

	public ShoppingCartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}

	@FindBy(name="itemquantity1970758")
	private WebElement FictionqtyTextbox;
	
	@FindBy(name="removefromcart")
	private WebElement RemoveFromCartCheckBox;
	
	@FindBy(name="itemquantity1970762")
	private WebElement HealthbookqtyTextbox;
	
	@FindBy(id="CountryId")
	private WebElement CountryDropdown;

	@FindBy(name="estimateshipping")
	private WebElement EstimateShippingButton;
	
	@FindBy(name="termsofservice")
	private WebElement AgreeTermsAndConditionsCheckBox;
	
	@FindBy(id="checkout")
	private WebElement CheckOutButton;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement ContactUsLinkLink;
	
	@FindBy(id="Enquiry")
	private WebElement EnquiryTextField;
	
	@FindBy(name="send-email")
	private WebElement SubmitButton;
	
	public WebElement getContactUsLinkLink() {
		return ContactUsLinkLink;
	}

	public WebElement getEnquiryTextField() {
		return EnquiryTextField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getAgreeTermsAndConditionsCheckBox() {
		return AgreeTermsAndConditionsCheckBox;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

	public WebElement getEstimateShippingButton() {
		return EstimateShippingButton;
	}

	public WebElement getCountryDropdown() {
		return CountryDropdown;
	}
	
	
}
