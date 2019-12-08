package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools.ReadPropertyFile;
import tools.SelectDriver;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class BasePage {

    private WebDriver driver;

    private Set<Cookie> cookieSet;

    public BasePage(String browserName){
        String fileName = "driver.properties";
        Properties props = ReadPropertyFile.read(fileName);
        if (props != null) {
            driver = SelectDriver.getDriverByFile(browserName, props);
        } else {
            driver = SelectDriver.getDriverConstants(browserName);
        }
    }

    public void setCookie(Set<Cookie> cookieSet){
        for(Cookie cookie:cookieSet)
         driver.manage().addCookie(cookie);
    }

    public Set<Cookie> getCookie(){ return driver.manage().getCookies();}

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
