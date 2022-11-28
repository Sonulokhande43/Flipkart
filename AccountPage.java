package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	// Object of the AccountPage
	private By acountBreadCrumb = By.xpath("//a[text()='Account']");

	// Non Static Methods Creation
	public WebElement acountBreadCrumb() {
		return driver.findElement(acountBreadCrumb);
	}
}
