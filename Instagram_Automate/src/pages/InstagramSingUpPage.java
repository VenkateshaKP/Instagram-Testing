package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramSingUpPage {
	
	private WebDriver driver=null;
	
		public InstagramSingUpPage(WebDriver driver) {
			this.driver=driver;
		// TODO Auto-generated constructor stub
	}
		
		
		By UserNumberOrEmailTxtBox =By.name("emailOrPhone");
		By UserPasswordTb = By.name("password");
		By UserFullNameb =By.name("fullName");
		By Username = By.name("username");
		By UserSubmitbtn=By.xpath("//button[.='Sign up']");
	//	By UserSingUPLink=By.xpath("//span[.='Sign up']");
		
		public void UserNumberOrEmailTxtBox(String emailPhone)
		{
			driver.findElement(UserNumberOrEmailTxtBox).sendKeys(emailPhone);
		}
		public void UserPasswordTb(String password)
		{
			driver.findElement(UserPasswordTb).sendKeys(password);
		}
		public void UserFullNameb(String fullname)
		{
			driver.findElement(UserNumberOrEmailTxtBox).sendKeys(fullname);
		}
		public void Username(String Usernames)
		{
			driver.findElement(Username).sendKeys(Usernames);
		}
		public void UserSubmitbtn()
		{
			driver.findElement(UserSubmitbtn).clear();
		}
		
}
