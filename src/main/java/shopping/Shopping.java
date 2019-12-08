package shopping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.LoginPage;
import tools.InputUrl;

public class Shopping {
    String[] goods = new String[]{"云南白药", "柴火大院"};
    String url = "http://www.taobao.com";

    private BasePage base ;
    private WebDriver driver ;
    private LoginPage login ;
    private CartPage cart ;

    @BeforeClass
    public void init(){
        this.base = new BasePage("chrome");
        this.driver = base.getDriver();
        this.login = new LoginPage(base,driver);
        this.cart = new CartPage(base,driver);
    }

    @Test
    public void testShoping(){
        InputUrl.inputUrl(driver,url);
        login.login("","");
        cart.addGoods(goods);
    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
