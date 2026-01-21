package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FollowRequestAccepted;
import pages.HomePageActions;
import pages.InstagramLogInPage;
import pages.ProfilePage;

public class FollowRequestAccept extends BaseTest {
	
	
	@Test(priority = 1)
	void FollowAccept() throws InterruptedException {
		InstagramLogInPage i = new InstagramLogInPage(driver);
		HomePageActions h = new HomePageActions(driver);
		// FollowRequest fr=new FollowRequest(driver);
		// Explore e = new Explore(driver);
		ProfilePage p = new ProfilePage(driver);

		Thread.sleep(10000);
		i.login("venkatakp", "Venky@2310");
		System.out.println(" venkatakp log in is successfull");
		Thread.sleep(10000);
		h.notSave();
		Thread.sleep(4000);
//	h.ok();
//		Thread.sleep(4000);

		FollowRequestAccepted f = new FollowRequestAccepted(driver);
		f.notifications();
		Thread.sleep(4000);
		f.FollowRequestAcc();
		Thread.sleep(4000);
	}

}
