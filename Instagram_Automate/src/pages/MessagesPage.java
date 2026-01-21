package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class MessagesPage {
	public static WebDriver driver;
	WaitUtils wait;

	public MessagesPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}

	By Messages = By.xpath("(//*[.='Messages'])[6]");
	By SendMessage = By.xpath("(//*[.='Send message'])[2]");
	By Search = By.name("queryBox");
	By FBox = By.xpath("(//input[@type='checkbox'])[1]");
	By Chat = By.xpath("(//*[.='Chat'])[2]");
	By MessageBox = By.xpath("//*[@aria-label='Message']");
	By Send = By.xpath("//*[.='Send']");
	By Call = By.xpath("//*[@aria-label='Audio Call']");
	By StratCall = By.xpath("(//*[.='Start Call'])[2]");

	By VideoCall = By.xpath("//*[@aria-label='Video Call']");
	By MsgBoxClose = By.xpath("//*[@aria-label='Close']");

	public void messages() {
		wait.waitForClick(Messages);
		driver.findElement(Messages).click();
	}

	public void msgBoxClose() {
		wait.waitForClick(MsgBoxClose);
		driver.findElement(MsgBoxClose).click();
	}

	public void sendMessage(String name, String msg) throws InterruptedException {
		wait.waitForClick(SendMessage);
		driver.findElement(SendMessage).click();
		wait.waitForVisibility(Search);
		driver.findElement(Search).sendKeys(name);
		Thread.sleep(4000);
		wait.waitForClick(FBox);
		driver.findElement(FBox).click();
		wait.waitForClick(Chat);
		driver.findElement(Chat).click();

		WebElement b = driver.findElement(MessageBox);
		b.click();
		Thread.sleep(4000);
		b.sendKeys(msg);
		Thread.sleep(4000);
		wait.waitForClick(Send);
		driver.findElement(Send).click();
		Thread.sleep(4000);
	}

	public void call() throws InterruptedException {
		wait.waitForClick(Call);
		driver.findElement(Call).click();
		wait.waitForClick(StratCall);
		driver.findElement(StratCall).click();
	}

	public void videoCall() {
		wait.waitForClick(VideoCall);
		driver.findElement(VideoCall).click();
	}

}
