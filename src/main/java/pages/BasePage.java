package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools.ReadPropertyFile;
import tools.SelectDriver;
import java.util.Properties;

public class BasePage {

    private WebDriver driver;

    public BasePage(String browserName){
        String fileName = "driver.properties";
        Properties props = ReadPropertyFile.read(fileName);
        if (props != null) {
            driver = SelectDriver.getDriverByFile(browserName, props);
        } else {
            driver = SelectDriver.getDriverConstants(browserName);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getWebElement(By by){
        return driver.findElement(by);
    }

    public WebElement getWebElement(By rootby,By by){
        return getWebElement(rootby).findElement(by);
    }

    public void close(){
        driver.close();
    }
}
