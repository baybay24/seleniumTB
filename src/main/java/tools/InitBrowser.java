package tools;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Properties;

public class InitBrowser {
    @Test
    public static WebDriver initBrowser(String browserName){
        String fileName = "driver.properties";
        Properties props = ReadPropertyFile.read(fileName);
        if (props != null) {
            WebDriver driver = SelectDriver.getDriverByFile(browserName, props);
            return driver;
        } else {
            WebDriver driver = SelectDriver.getDriverConstants(browserName);
            return driver;
        }
    }
}
