package shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tools.InitBrowser;
import tools.Wait;

import java.util.List;

public class Cart {
@Test
    public void addCart() {
    WebDriver driver = InitBrowser.initBrowser("chrome");
        driver.get("https://www.taobao.com/?spm=a230r.1.1581860521.1.62ee3d087UJOPT");

        String[] goods = new String[]{"云南白药", "柴火大院"};

//        for(String good:goods){
            driver.findElement(By.className("search-combobox-input-wrap")).findElement(By.id("q")).sendKeys("云南白药");
            Wait.waitingSeconds(1);
            driver.findElement(By.cssSelector("button.btn-search.tb-bg")).submit();
            Wait.waitingSeconds(1);
//            List<WebElement> elementList = driver.findElements(By.className("items"));
//            for(int i = 0; i<elementList.size(); i++){
//                elementList.get(i).findElement(By.id("J_Itemlist_Pic_538880682145")).findElement(By.cssSelector("ww-light ww-small"));
//            }
//        }

    driver.close();

    }


}
