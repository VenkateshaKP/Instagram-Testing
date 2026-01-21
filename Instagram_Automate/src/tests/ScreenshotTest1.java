package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utils.ScreenshotUtil;

public class ScreenshotTest1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void testScreenshot()
    {
        ScreenshotUtil.takeScreenshot(driver, "GoogleHome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
