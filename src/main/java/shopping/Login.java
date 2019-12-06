package shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.Test;
import tools.Wait;


public class Login {

    public static void search(WebDriver driver,String goodsName) {

        driver.findElement(By.id("q")).sendKeys(goodsName);
        String textValue = driver.findElement(By.className("search-button")).findElement(By.className("btn-search")).getText();
        Assert.assertEquals(textValue,"搜索","搜索控件没有正确定位");
        Wait.waitingMilliseconds(1);
        driver.findElement(By.className("search-button")).findElement(By.className("btn-search")).submit();
        Wait.waitingMilliseconds(1);
        driver.findElement(By.id("J_LoginBox")).click();
        Wait.waitingMilliseconds(1);

        JavascriptExecutor driver_js= ((JavascriptExecutor) driver);

        String css = "document.getElementById('J_LoginBox').className='login-box no-longlogin module-static'";
        driver_js.executeScript(css);
        Wait.waitingMilliseconds(1);
//        用户名
        driver.findElement(By.id("TPL_username_1")).sendKeys("");
//        密码
        driver.findElement(By.id("TPL_password_1")).sendKeys("");
        driver.findElement(By.id("J_SubmitStatic")).submit();

    }
}
