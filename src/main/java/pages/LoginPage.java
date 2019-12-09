package pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tools.BasePage;
import tools.WaitTime;


public class LoginPage  {

    private WebDriver driver;
    private BasePage base;

    public LoginPage(BasePage base, WebDriver driver){
        this.base = base;
        this.driver = base.getDriver();
    }

    public boolean currentPage(){
        String textValue = base.getWebElement(By.className("search-button"),By.className("btn-search")).getText();
        Assert.assertEquals(textValue,"搜索","搜索控件没有正确定位");
        if(StringUtils.isNotEmpty(textValue))
            return true;
        else
            return false;
    }

    public WebElement searchElement(){
        return base.getWebElement(By.className("search-button"),By.className("btn-search"));
    }

    public WebElement loginBoxElement(){
        return base.getWebElement(By.id("J_LoginBox"));
    }

    public void findLoginBlock(){
        JavascriptExecutor driver_js= ((JavascriptExecutor) driver);
        String css = "document.getElementById('J_LoginBox').className='login-box no-longlogin module-static'";
        driver_js.executeScript(css);
        WaitTime.waitingMilliseconds(1);
    }

    public WebElement usernameElement(){
        return base.getWebElement(By.id("TPL_username_1"));
    }

    public WebElement passwordElement(){
        return base.getWebElement(By.id("TPL_password_1"));
    }

    public WebElement buttonElement(){
        return base.getWebElement(By.id("J_SubmitStatic"));
    }

    /**
     * taobao用selenium driver无法登录，所以测试会报错
     * @param username
     */
    public void currentLogin(String username) {
        WebElement elementdL = base.getWebElement(By.id("J_SiteNavBdL"));
        WebElement elementin = base.getWebElement(elementdL,By.id("J_SiteNavLogin"));
        WebElement elementhd = base.getWebElement(elementin,By.className("site-nav-menu-hd"));
        WebElement elementer = base.getWebElement(elementhd,By.className("site-nav-user"));

        String username_login =  elementer.findElement(By.tagName("a")).getText();
        Assert.assertEquals(username_login,username);
    }
}
