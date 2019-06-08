package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;



public class TekSchoolHomePage extends ConfigFileReader {
	

	// @By annotation
	// @FindBy annotation

	@FindBy(how = How.XPATH, using = "(//a[text() = 'login'])[2]")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//a[text() = 'Test Environment']")
	private WebElement testEnvironment;
	
	public TekSchoolHomePage() {

		PageFactory.initElements(driver, this);

	}

	public void clickOnLogin() {
		loginButton.sendKeys(Keys.ENTER);

	}

	public void clickOnTestEnvironment() {
	
		testEnvironment.sendKeys(Keys.ENTER);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		System.out.println(driver.getTitle());
	}

	public void getPageTitle() {
		System.out.println(driver.getTitle());
		
	}
}
