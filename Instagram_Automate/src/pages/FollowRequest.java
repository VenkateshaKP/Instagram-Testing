package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class FollowRequest {
	public static WebDriver driver;
	WaitUtils wait;
	
	By FollowRequest=By.xpath("(//*[.='Follow'])[2]");

	
	public FollowRequest(WebDriver driver) {
		this.driver=driver;
		wait = new WaitUtils(driver);
		
	}
	
	public void followRequest() {
		wait.waitForClick(FollowRequest);
		driver.findElement(FollowRequest).click();
		System.out.println("FollowRequest is sent");
	}
	

}
