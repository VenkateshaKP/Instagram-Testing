package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class FollowRequestAccepted {
	public static WebDriver driver;
	WaitUtils wait;
	By Notifications=By.xpath("(//*[.='Notifications'])[last()]");
	By FollowRequestAccepted=By.xpath("(//*[.='Confirm'])[1]");
	
	
	public FollowRequestAccepted(WebDriver driver) {
		this.driver=driver;
		wait=new WaitUtils(driver);
		
	}
	
	
	public void notifications() {
		wait.waitForClick(Notifications);
		driver.findElement(Notifications).click();
		
	}
	
	public void FollowRequestAcc() {
		wait.waitForClick(FollowRequestAccepted);
		driver.findElement(FollowRequestAccepted).click();
		System.out.println("Follow Request is Accepted");
	}
	

}
