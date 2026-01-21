package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class ProfilePage {
	public static WebDriver driver;
	WaitUtils wait;

	By Profile = By.xpath("(//*[.='Profile'])[1]");
	By Followers = By.xpath("//*[@href='/td_sharath/followers/']");
	By Following = By.xpath("//*[@href='/td_sharath/following/']");
	By AddProfilePhoto = By.xpath("//*[@title='Add a Profile Photo']");
	String f = "(//div[@style=\"height: auto; overflow: hidden auto;\"])[1]";
	By Highlite = By.xpath("(//*[@role='button'])[5]");
	By FollowsList = By.xpath(f);
	By Close = By.xpath("//*[@aria-label=\"Close\"]");
	By Options = By.xpath("//*[@aria-label='Options']");
	By LogOut = By.xpath("//button[8]");

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);

	}

	public void profile() {
		wait.waitForClick(Profile);
		driver.findElement(Profile).click();

	}

	public void options() {
		wait.waitForClick(Options);
		driver.findElement(Options).click();

	}

	public void logOut() {
		wait.waitForClick(LogOut);
		driver.findElement(LogOut).click();

	}

	public void followers() {
		WebElement f = driver.findElement(Followers);
		f.click();
		System.out.println("followers are displaaying");

	}

	public void followersList() {
		int count = driver.findElements(FollowsList).size();

		System.out.println("followers are displaaying" + count);

	}

	public void following() {
		wait.waitForClick(Following);
		driver.findElement(Following).click();
		System.out.println("Following are displaaying");
	}

	public void addProfilePhoto() {
		wait.waitForClick(AddProfilePhoto);
		driver.findElement(AddProfilePhoto).click();

	}

	public void close() {
		wait.waitForClick(Close);
		driver.findElement(Close).click();

	}

}
