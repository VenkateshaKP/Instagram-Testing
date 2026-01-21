package utils;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String name) {
        try {
            // Add timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = name + "_" + timestamp + ".png";

            // Create screenshots folder if not exist
            File folder = new File("screenshots");
            if (!folder.exists())
            {
                folder.mkdirs();
            }

            // Take screenshot
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save file
            File dest = new File("screenshots/" + fileName);
            Files.copy(src.toPath(), dest.toPath());

            System.out.println("📸 Screenshot saved: " + dest.getPath());
            return dest.getPath();

        } catch (Exception e) {
            System.out.println("❌ Screenshot failed: " + e.getMessage());
            return null;
        }
    }
}
