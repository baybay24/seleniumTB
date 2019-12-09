package testCases;

import operate.CartOperate;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.BasePage;
import tools.InputUrl;

public class CaseShopping {
    String goods = "云南白药";
    String url = "https://www.taobao.com/?spm=a230r.1.1581860521.1.62ee3d087UJOPT";
    String username = "";
    String password = "";

    private BasePage base ;
    private WebDriver driver ;
    private CartOperate cart ;

    @BeforeClass
    public void init(){
        this.base = new BasePage("chrome");
        this.driver = base.getDriver();
        this.cart = new CartOperate(base,driver);
    }

    @Test
    public void shopingCase(){
        InputUrl.inputUrl(driver,url);
        cart.addGoods(goods);
    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
