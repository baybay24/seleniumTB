package operate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tools.BasePage;
import pages.CartPage;
import tools.WaitTime;

public class CartOperate {

    CartPage cart;

    public CartOperate(BasePage base, WebDriver driver){
        cart = new CartPage(base,driver);
    }

    public void addGoods(String goods){
        cart.inputElement().sendKeys(goods);
        WaitTime.waitingSeconds(1);
        cart.searchElement().submit();
        WaitTime.waitingSeconds(1);

        for(WebElement element:cart.allGoodsElement()){

            cart.goodElement(element).click();
            WaitTime.waitingSeconds(1);

            cart.goodSelectedElement().sendKeys("已选中");
            WaitTime.waitingSeconds(1);

            cart.goodAmountElement().sendKeys("2");
            WaitTime.waitingSeconds(1);

            String count_bf = cart.cartCountElement().getText();
            cart.linkBasketElement().click();
            WaitTime.waitingSeconds(1);
            String count_af = cart.cartCountElement().getText();
            Assert.assertEquals(count_bf,count_af,"商品没有成功加入购物车");
        }
    }
}
