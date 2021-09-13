/**
 * 
 */
package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author Mamatha
 *
 */
public class BaseTest {
	public static  WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/softwares/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
	}
	@AfterClass
	public void AfterExecution() {
		driver.quit();
	}
}
