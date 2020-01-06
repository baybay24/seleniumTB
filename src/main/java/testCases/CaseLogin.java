package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import operate.LoginOperate;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.BasePage;
import tools.InputUrl;

@Epic(value="登录测试")
@Feature("演示登录")
public class CaseLogin {

    String url = "http://www.taobao.com";

    private BasePage base ;
    private WebDriver driver ;
    private LoginOperate login ;

    @BeforeClass
    public void init(){
        this.base = new BasePage("IE");
        this.driver = base.getDriver();
        this.login = new LoginOperate(base,driver);

    }


    @Test
    @Description("Allure描述")
    @Story("Allure注释描述")
    public void loginCase(){
        InputUrl.inputUrl(driver,url);
        login.login("","");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
