package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class HomePageActions {
	public static WebDriver driver;
	WaitUtils wait;
	By NotSave = By.xpath("(//div[.='Not now'])[1]");
	By Ok = By.xpath("//div[.='OK']");
	By Explore = By.xpath("(//span[.='Explore'])[2]");

	By Reels = By.xpath("(//*[.='Reels'])[10]");
	By searchResultsPanel =By.xpath("//div[@role='dialog']");


	// By PostLike=By.xpath("(//span[@class=\"x1qfufaz\"])[1]");

	By PostComment = By.xpath("(//textarea[@autocorrect='off'])[1]");
	By PostShare = By.xpath("(//div[.='Share'])[1]");
	By PostCmt = By.xpath("(//div[.='Post'])[1]");

	By HomePage = By.xpath("(//*[.='Home'])[10]");
	By searchTb = By.xpath("//*[@aria-label=\"Search\"][last()]");
	By searchTb1 = By.xpath("//*[@aria-label=\"Search input\"][last()]");

	By Search1Profile = By.xpath(
			"(//div[@class=\"html-div xdj266r x14z9mp xat24cr x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl x1qjc9v5 x9f619 x78zum5 xdt5ytf x1iyjqo2 xl56j7k xeuugli\"])[1]");
	By ProfileData = By.xpath("//main");

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}

	public void home() {
		wait.waitForClick(HomePage);
		driver.findElement(HomePage).click();

	}

	public void notSave() {
		wait.waitForClick(NotSave);
		wait.waitForVisibility(NotSave);
		driver.findElement(NotSave).click();
	}

	public void ok() {
		wait.waitForClick(Ok);
		driver.findElement(Ok).click();
	}

	public void explore() {
		wait.waitForClick(Explore);
		driver.findElement(Explore).click();
	}

	public void search() {
		wait.waitForClick(searchTb);
		driver.findElement(searchTb).click();

	}

	public void searchInput(String search) throws InterruptedException {
		wait.waitForVisibility(searchTb1);
		 driver.findElement(searchTb1).sendKeys(search);
		Thread.sleep(4000);
		System.out.println("data is displayed"+search);
		
	}

	public void search1Profile() throws InterruptedException {
		
		wait.waitForVisibility(Search1Profile);
		driver.findElement(Search1Profile).click();
		Thread.sleep(4000);
		System.out.println("search oparetion is done");
	}

	public void profileData() {
		wait.waitForVisibility(ProfileData);
		WebElement data = driver.findElement(ProfileData);
		String o = data.getText();
		System.out.println(o);
	}

	public void postLike() throws InterruptedException {

		for (int i = 1; i <= 6; i++) {
			wait.waitForVisibility(By.xpath("(//span[@class=\"x1qfufaz\"])[" + i + "]"));
			WebElement post = driver.findElement(By.xpath("(//span[@class=\"x1qfufaz\"])[" + i + "]"));
			System.out.println(post.getSize());
			Actions a = new Actions(driver);
			a.scrollToElement(post).perform();
			post.click();
			Thread.sleep(2000);
		}
	}

	public void postComment(String cmt1) throws InterruptedException {
		wait.waitForClick(PostComment);
		driver.findElement(PostComment).click();
		wait.waitForVisibility(By.xpath("(//textarea[@autocorrect='off'])[1]"));
		driver.findElement(By.xpath("(//textarea[@autocorrect='off'])[1]")).sendKeys(cmt1);
		wait.waitForClick(PostCmt);
		WebElement p = driver.findElement(PostCmt);
		p.click();
		Thread.sleep(4000);
	}

	public void postShare(String name) throws InterruptedException {
		wait.waitForClick(PostShare);
		driver.findElement(PostShare).click();
		wait.waitForVisibility(By.name("queryBox"));
		driver.findElement(By.name("queryBox")).sendKeys(name);
		wait.waitForClick(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		wait.waitForClick(By.xpath("(//div[.='Send'])[4]"));
		driver.findElement(By.xpath("(//div[.='Send'])[4]")).click();
		Thread.sleep(2000);
	}

	public void reels() {
		wait.waitForClick(Reels);
		driver.findElement(Reels).click();
	}

}
