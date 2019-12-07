package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import tools.WaitTime;

import java.util.List;

public class CartPage {
    private BasePage base;
    private WebDriver driver;

    public CartPage(BasePage base,WebDriver driver){
        this.base = base;
        this.driver = driver;
    }

    public void addGoods(String[] goods) {
        driver.get("https://www.taobao.com/?spm=a230r.1.1581860521.1.62ee3d087UJOPT");

        goods = goods;


        base.getWebElement(By.className("search-combobox-input-wrap"),By.id("q")).sendKeys(goods[1]);
        WaitTime.waitingSeconds(1);

        base.getWebElement(By.cssSelector("button.btn-search.tb-bg")).submit();
        WaitTime.waitingSeconds(1);



        List<WebElement> elementList = driver.findElements(By.className("m-itemlist"));
        for(int i = 0; i<elementList.size(); i++){
            elementList.get(i).findElement(By.className("pic-box-inner")).findElement(By.cssSelector("pic-link.J_ClickStat.J_ItemPicA"));
            WaitTime.waitingSeconds(1);
            base.getWebElement(By.id("J_LinkBasket")).click();
            base.getWebElement(By.cssSelector("input.tb-text.mui-amount-input")).sendKeys("2");
            base.getWebElement(By.className("tm-clear J_TSaleProp"),By.xpath("//il>i")).sendKeys("已选中");
            WaitTime.waitingSeconds(1);
            String count_bf = base.getWebElement(By.className("sn-cart-link"),By.tagName("span")).getText();
            base.getWebElement(By.id("J_LinkBasket")).click();
            String count_af = base.getWebElement(By.className("sn-cart-link"),By.tagName("span")).getText();
            Assert.assertEquals(count_bf,count_af,"商品没有成功加入购物车");
        }
        WaitTime.waitingSeconds(10);
        base.close();
        }
}
