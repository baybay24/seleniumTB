package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools.BasePage;


import java.util.List;

public class CartPage {
    private BasePage base;
    private WebDriver driver;

    public CartPage(BasePage base,WebDriver driver){
        this.base = base;
        this.driver = driver;
    }

    public WebElement inputElement(){
        return base.getWebElement(By.className("search-combobox-input-wrap"),By.id("q"));
    }

    public WebElement searchElement(){
        return base.getWebElement(By.cssSelector("button.btn-search.tb-bg"));
    }

    public List<WebElement> allGoodsElement(){
        return driver.findElements(By.className("m-itemlist"));
    }

    public WebElement goodElement(WebElement element){
        return element.findElement(By.className("pic-box-inner")).findElement(By.cssSelector("pic-link.J_ClickStat.J_ItemPicA"));
    }

    public WebElement linkBasketElement(){
        return base.getWebElement(By.id("J_LinkBasket"));
    }

    public WebElement goodSelectedElement(){
        return base.getWebElement(By.className("tm-clear J_TSaleProp"),By.xpath("//il>i"));
    }

    public WebElement goodAmountElement(){
        return base.getWebElement(By.cssSelector("input.tb-text.mui-amount-input"));
    }

    public WebElement cartCountElement(){
        return base.getWebElement(By.className("sn-cart-link"),By.tagName("span"));
    }
}
