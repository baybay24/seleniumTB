package testCases;

import operate.LoginOperate;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.BasePage;
import tools.InputUrl;


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
    public void loginCase(){
        InputUrl.inputUrl(driver,url);
        login.login("","");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
