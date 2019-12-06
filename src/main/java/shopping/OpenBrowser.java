package shopping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tools.InitBrowser;

public class OpenBrowser {

    public static void openBrowser(WebDriver driver,String url){
        driver.get(url);
    }


}
