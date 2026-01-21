package utils;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private WebDriverWait wait;
    WebDriverWait longWait;

    public WaitUtils(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // minimum 10 sec
        longWait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClick(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForPresence(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitUpToTwoMinutes(By locator) {
       
            
        longWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void v(By locator) {
    
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));

    }

}
