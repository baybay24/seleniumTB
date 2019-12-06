package tools;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.logging.Logger;

public class SelectDriver {
@Test
	public static WebDriver getDriverByFile(String browserName, Properties prop) {

			String driver = "";

			if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_FIREFOX)) {
				driver = prop.getProperty(Constants.DRIVER_TYPE_FIREFOX);
				if(StringUtils.isNotEmpty(driver)) {
					System.setProperty(Constants.WEBDRIVER_FIREFOX, driver);
					return new FirefoxDriver();
				}
			}
			else if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_IE)){
				driver = prop.getProperty(Constants.DRIVER_TYPE_IE);
                if(StringUtils.isNotEmpty(driver)) {
                    System.setProperty(Constants.WEBDRIVER_IE, driver);
                    return new InternetExplorerDriver();
                }
			}
			else if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_CHROME)){
				driver = prop.getProperty(Constants.DRIVER_TYPE_CHROME);
                if(StringUtils.isNotEmpty(driver)) {
                    System.setProperty(Constants.WEBDRIVER_CHROME, driver);
                    return new ChromeDriver();
                }
			}else {
			    Logger.getLogger(SelectDriver.class.getName()).info("浏览器不在可选范围内");
            }
        return null;
    }

    public static WebDriver getDriverConstants(String browserName) {

        if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_FIREFOX)) {
            System.setProperty(Constants.WEBDRIVER_FIREFOX, Constants.DRIVER_FIREFOX_ADDRESS);
            return new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_IE)){
            System.setProperty(Constants.WEBDRIVER_IE, Constants.DRIVER_IE_ADDRESS);
            return new InternetExplorerDriver();
        }
        else if(browserName.equalsIgnoreCase(Constants.DRIVER_TYPE_CHROME)){
            System.setProperty(Constants.WEBDRIVER_CHROME, Constants.DRIVER_CHROME_ADDRESS);
            return new ChromeDriver();
        }else {
            Logger.getLogger(SelectDriver.class.getName()).info("浏览器不在可选范围内");
        }
        return null;
    }
}
