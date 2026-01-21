package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class ReelsPage {
	public static WebDriver driver;
	WaitUtils wait;

	public ReelsPage(WebDriver driver) {
		this.driver = driver;
		wait=new WaitUtils(driver);
	}

	By AudioMute = By.xpath("(//*[@aria-label='Audio is muted'])[1]");
	By Like = By.xpath("(//*[@aria-label='Like'])[1]");
	By UnLike = By.xpath("(//*[@aria-label='Unlike'])");
	By Comment = By.xpath("(//*[@aria-label='Comment'])[1]");
	By Share = By.xpath("(//*[@aria-label='Share'])[1]");
	By Save = By.xpath("(//*[@aria-label='Save'])[1]");
	By NextReel = By.xpath("(//*[@aria-label=''])[2]");
	By BackReel = By.xpath("(//*[@aria-label=''])[1]");

	public void audioMute() {
		wait.waitForClick(AudioMute);
		driver.findElement(AudioMute).click();
	}

	public void like() {
		wait.waitForClick(Like);
		driver.findElement(Like).click();
	}
	public void unlike() {
		wait.waitForClick(UnLike);
		driver.findElement(UnLike).click();
	}

	public void comment() {
		wait.waitForClick(Comment);
		driver.findElement(Comment).click();
	}

	public void share() {
		wait.waitForClick(Share);
		driver.findElement(Share).click();
	}

	public void save() {
		wait.waitForClick(Save);
		driver.findElement(Save).click();
	}

	public void NextReel() {
		wait.waitForClick(NextReel);
		driver.findElement(NextReel).click();
	}

	public void backReel() {
		wait.waitForClick(BackReel);
		driver.findElement(BackReel).click();
	}

}
