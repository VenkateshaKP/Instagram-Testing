package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class InstagramLogInPage {
	private WebDriver driver = null;
	WaitUtils wait;

	public InstagramLogInPage(WebDriver driver) {
		this.driver = driver;
		wait= new WaitUtils(driver);
	}

	By UserNameTextBox = By.xpath("//input[@type='text']");
	By UserPasswordTextBox = By.xpath("//input[@type='password']");
	By SubmitButton = By.xpath("(//*[.='Log in'])[2]");

	public void login(String uname, String pass)  {
		wait.waitForVisibility(UserNameTextBox);
		driver.findElement(UserNameTextBox).sendKeys(uname);
		wait.waitForVisibility(UserPasswordTextBox);
		driver.findElement(UserPasswordTextBox).sendKeys(pass);
		wait.waitForClick(SubmitButton);
		driver.findElement(SubmitButton).click();

	}
}
