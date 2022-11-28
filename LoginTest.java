
package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Opening the browser
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		login(driver);
		account(driver);
	}

	public static void login(WebDriver driver) throws Exception {

		// Object of the loginPage
		LoginPage logInPage = new LoginPage(driver);
		logInPage.emailField().sendKeys("vaibhavdharmik27@gmail.com");
		logInPage.passwordField().sendKeys("V@ibh@v1994");
		logInPage.loginButton().click();
		Thread.sleep(2000);
	}

	private static void account(WebDriver driver) {
		// Object of the AccountPage
		AccountPage accountPage = new AccountPage(driver);
		accountPage.acountBreadCrumb().isDisplayed();
		driver.close();
	}
}
