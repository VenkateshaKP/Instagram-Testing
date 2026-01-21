package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import utils.WaitUtils;

public class Stories extends BaseTest {
	public static WebDriver driver;
	WaitUtils wait;

	public Stories(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);

	}

	// By ClickStory = By.xpath("(//div[@role=\"button\"])[1]");
	By AudioPlay = By.xpath("(//*[@aria-label='Audio is playing'])");
	By AudioMute = By.xpath("(//*[@aria-label='Audio is muted'])[3]");
	// Enter video or photo operation of stop and run
	By Pause = By.xpath("(//*[@aria-label='Pause'])");
	By Play = By.xpath("(//*[@aria-label='Play'])[3]");

	By Like = By.xpath("(//*[@aria-label='Like'])[last()]");
	By Send = By.xpath("(//*[@aria-label='Direct'])");
	By SerchByName = By.name("queryBox");
	By SelectPerson = By.xpath("(//input[@type='checkbox'])[1]");
	By StorySend = By.xpath("(//*[.='Send'])[3]");
	By StoryClose = By.xpath("(//*[@aria-label='Close'])[last()]");

	public void clickStory(String name) throws InterruptedException {
		for (int i = 1; i <= 2; i++) {
			WebElement s = driver.findElement(By.xpath("(//div[@role='button'])[" + i + "]"));
			Thread.sleep(4000);
			s.click();
			Thread.sleep(4000);
			driver.findElement(Pause).click();
			// Thread.sleep(8000);
			// driver.findElement(AudioMute).click();
			Thread.sleep(2000);
			driver.findElement(Like).click();
			Thread.sleep(2000);
			driver.findElement(Send).click();
			Thread.sleep(2000);
			WebElement s1 = driver.findElement(SerchByName);
			s1.click();
			s1.sendKeys(name);
			Thread.sleep(2000);
			driver.findElement(SelectPerson).click();
			Thread.sleep(2000);
			WebElement s2 = driver.findElement(StorySend);
			Thread.sleep(2000);
			s2.click();
			Thread.sleep(2000);
			driver.findElement(StoryClose).click();
			Thread.sleep(4000);
		}

	}

	public void audioMute() throws InterruptedException {
		wait.waitForClick(AudioMute);
		driver.findElement(AudioMute).click();

	}

	public void audioPlay() throws InterruptedException {

		wait.waitForClick(AudioPlay);
		driver.findElement(AudioPlay).click();

//		driver.findElement(AudioMute).click();
//		Thread.sleep(3000);

	}

	public void storyPlayOrPause() throws InterruptedException {
		wait.waitForClick(Pause);
		driver.findElement(Pause).click();
//		Thread.sleep(5000);
//		driver.findElement(Play).click();

	}

	public void like() {
		wait.waitForClick(Like);
		driver.findElement(Like).click();

	}

	public void send() {
		wait.waitForClick(Send);
		driver.findElement(Send).click();

	}

	public void serchByName(String name) {
		WebElement s = driver.findElement(SerchByName);
		s.click();
		s.sendKeys(name);

	}

	public void selectPerson() {
		wait.waitForClick(SelectPerson);
		driver.findElement(SelectPerson).click();

	}

	public void storySend() throws InterruptedException {
		wait.waitForClick(StorySend);
		driver.findElement(StorySend).click();

	}

}