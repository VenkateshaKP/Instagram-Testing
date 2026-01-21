package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.Explore;
import pages.FollowRequest;
import pages.FollowRequestAccepted;
import pages.HomePageActions;
import pages.InstagramLogInPage;
import pages.MessagesPage;
import pages.ProfilePage;
import pages.ReelsPage;
import pages.Stories;

public class E2eTest extends BaseTest {

	@Test(priority = 4)
	public void msg() throws InterruptedException {

		h.home();

		m.messages();
		Thread.sleep(8000);
		m.sendMessage("vyadav80", "how are you");
		Thread.sleep(2000);
		h.home();
		m.msgBoxClose();
	}

	@Test(priority = 1)
	void search() throws InterruptedException {
		h.home();
		Thread.sleep(2000);
		h.search();
		h.searchInput("venkatesh");
		h.search1Profile();
		fr.followRequest();
		// h.profileData();
		System.out.println("search is done");
	}

//	@Test
//	void logOut() {
//		p.profile();
//		p.options();
//		p.logOut();
//		System.out.println(" td_sharath log out  is successfull");
//
//	}

//	@Test
//	void login() throws InterruptedException {
//		i.login("venkatakp", "Venky@2310");
//		System.out.println(" venkatakp log in is successfull");
//		h.notSave();
//	}

//	@Test
//	void followRequestAccepted() {
//		FollowRequestAccepted f = new FollowRequestAccepted(driver);
//		f.notifications();
//		f.FollowRequestAcc();
//	}

	@Test(priority = 2)
	void watchReels() throws InterruptedException {
		ReelsPage r = new ReelsPage(driver);
		h.home();
		Thread.sleep(2000);
		h.reels();
		Thread.sleep(4000);
		r.audioMute();
		r.like();
		// r.comment();
		// Thread.sleep(2000);
		r.save();
//		 Thread.sleep(2000);
//		 r.NextReel();
//		 Thread.sleep(2000);
		int i3 = 1;
		while (i3 <= 10) {
			
			r.NextReel();
			Thread.sleep(2000);
			r.like();
			Thread.sleep(2000);
			i3++;
		}
		int i4 = 1;
		while (i4 <= 10) {
			r.backReel();
			Thread.sleep(2000);
			r.unlike();
			Thread.sleep(2000);
			i4++;
		}
//
		System.out.println("reels is done");
	}

	@Test(priority = 3)
	void postLike() throws InterruptedException {
		h.home();
		Thread.sleep(2000);
		h.postLike();
		// h.postComment("go");

		// h.postShare("venkat");
		System.out.println("post opration is succysefull");
	}
	@Test(priority = 0)
	void viewStories() throws InterruptedException {
		h.home();
		Stories s = new Stories(driver);
		s.clickStory("venkat");
		System.out.println("Stories opeations is succesfull passed");
	}

	@Test(priority = 5)
	void explore() throws InterruptedException {
		h.home();
		Thread.sleep(2000);
		h.explore();
		Thread.sleep(10000);
		e.clickReel();
		Thread.sleep(8000);
		for (int i1 = 0; i1 < 5; i1++) {
			e.like();
			e.next();
		}
		for (int i1 = 0; i1 < 5; i1++) {
			e.like();
			e.back();
		} 
		e.exploreClose();
		System.out.println("explore operation is done");
	}

}
