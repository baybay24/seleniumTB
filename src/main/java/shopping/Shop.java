package shopping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tools.InitBrowser;

public class Shop {
@Test
    public void shopping(){
        WebDriver driver = InitBrowser.initBrowser("chrome");
//      open browser and write down the url
      OpenBrowser.openBrowser(driver,"http://www.taobao.com");
//      searching goods which you want
        Login.search(driver,"云南白药");


    }



}
