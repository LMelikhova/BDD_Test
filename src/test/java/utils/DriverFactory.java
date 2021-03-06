package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void shutDownDriver() {
        driver.quit();
        driver = null;
    }
}
