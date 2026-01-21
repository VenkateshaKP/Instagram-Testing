package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class Explore {
	public static WebDriver driver;
	WaitUtils wait;
	public Explore(WebDriver driver) {
		this.driver = driver;
		wait=new WaitUtils(driver);	
	}
	
	By Explore=By.xpath("//*[@aria-label='Explore']");
	By ClickReel = By.xpath("(//*[@aria-label='Reel'])[1]");
	By Like = By.xpath("(//div[@class='x1ypdohk'])[1]");
	By Next = By.xpath("(//button[@class='_abl-'])[2]");
	By Back = By.xpath("(//button[@class='_abl-'])[1]");
	By Comment=By.xpath("//*[@aria-label='Comment']");
	By CommentInput=By.xpath("//*[@aria-label='Add a comment…']");
	By CommentPost=By.xpath("(//*[.='Post'])[last()]");
	By CommentClose=By.xpath("(//*[@aria-label='Close'])[last()]");
	By ExploreClose=By.xpath("//*[@aria-label='Close']");
	
	public void explore() {
		wait.waitForClick(Explore);
		driver.findElement(Explore).click();
	}
	public void exploreClose() {
		wait.waitForClick(ExploreClose);
		driver.findElement(ExploreClose).click();
	}
	public void clickReel() {
		wait.waitForClick(ClickReel);
		WebElement r = driver.findElement(ClickReel);
		//Actions a = new Actions(driver);
		//a.scrollToElement(r).perform();
		r.click();
	
	}

	public void like() {
		wait.waitForClick(Like);
		driver.findElement(Like).click();
	}

	public void next() {
		wait.waitForClick(Next);
		driver.findElement(Next).click();
	}

	public void back() {
		wait.waitForClick(Back);
		driver.findElement(Back).click();
	}
	public void comment(String input) throws InterruptedException {
		wait.waitForClick(Comment);
		driver.findElement(Comment).click();
		Thread.sleep(2000);
		driver.findElement(CommentInput).sendKeys(input);
		Thread.sleep(2000);
		driver.findElement(CommentPost).click();
		Thread.sleep(2000);
		
	}
	public void commentClose() {
		driver.findElement(CommentClose).click();
	}
	

}
