package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import tools.WaitTime;


public class LoginPage  {

    private WebDriver driver;
    private BasePage base;

    public LoginPage(BasePage base, WebDriver driver){
        this.base = base;
        this.driver = base.getDriver();
    }

    public void login(String username, String password) {

//        driver.findElement(By.id("q")).sendKeys(goodsName);
        String textValue = base.getWebElement(By.className("search-button"),By.className("btn-search")).getText();

        Assert.assertEquals(textValue,"搜索","搜索控件没有正确定位");
        WaitTime.waitingMilliseconds(1);

        base.getWebElement(By.className("search-button"),By.className("btn-search")).submit();
        WaitTime.waitingMilliseconds(1);

        base.getWebElement(By.id("J_LoginBox")).click();
        WaitTime.waitingMilliseconds(1);

        JavascriptExecutor driver_js= ((JavascriptExecutor) driver);
        String css = "document.getElementById('J_LoginBox').className='login-box no-longlogin module-static'";
        driver_js.executeScript(css);
        WaitTime.waitingMilliseconds(1);
//        用户名
        base.getWebElement(By.id("TPL_username_1")).sendKeys(username);
//        密码
        base.getWebElement(By.id("TPL_password_1")).sendKeys(password);
        WaitTime.waitingMilliseconds(1);
        base.getWebElement(By.id("J_SubmitStatic")).submit();

    }
}
