package shopping;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CartPage;
import pages.LoginPage;

public class Shopping {
    String[] goods = new String[]{"云南白药", "柴火大院"};

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

    public void shoping(){
        login.login("","");
        cart.addGoods(goods);
    }

}
