package shopping;

import org.openqa.selenium.WebDriver;
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

    public Shopping(String[] goods){
        this.base = new BasePage("chrome");
        this.driver = base.getDriver();
        this.login = new LoginPage(base,driver);
        this.cart = new CartPage(base,driver);
    }

    @Test
    public void shoping(){
//        this.base = new BasePage("chrome");
//        this.driver = base.getDriver();
//        this.login = new LoginPage(base,driver);
//        this.cart = new CartPage(base,driver);
        InputUrl.inputUrl(driver,url);
        login.login("","");
        cart.addGoods(goods);
    }

}
