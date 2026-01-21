package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Explore;
import pages.FollowRequest;
import pages.FollowRequestAccepted;
import pages.HomePageActions;
import pages.InstagramLogInPage;
import pages.MessagesPage;
import pages.ProfilePage;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePageActions h;
    protected InstagramLogInPage i;
    protected FollowRequest fr;
    protected Explore e;
    protected ProfilePage p;
    protected MessagesPage m;
    protected FollowRequestAccepted f;

    @BeforeClass
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // GLOBAL WAIT = 4 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.instagram.com/");

        InstagramLogInPage login = new InstagramLogInPage(driver);
        h = new HomePageActions(driver);
        i = new InstagramLogInPage(driver);
		fr = new FollowRequest(driver);
		e = new Explore(driver);
		p = new ProfilePage(driver);
		m= new MessagesPage(driver);
		f = new FollowRequestAccepted(driver);

        login.login("td_sharath", "vs52venky");
        h.notSave();
        h.ok();

        System.out.println("Login done once (10 sec waits applied)");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
