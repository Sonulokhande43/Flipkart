package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Private variables to locate the element
	private By emailField = By.xpath("//input[@name='email']");
	private By passwordField = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//input[@value='Login']");

	// Non Static Methods Creation
	public WebElement emailField() {
		return driver.findElement(emailField);
	}

	public WebElement passwordField() {
		return driver.findElement(passwordField);
	}

	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}

}
