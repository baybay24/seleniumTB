package tools;

import org.openqa.selenium.WebDriver;

public class OpenBrowser {

    public static void openBrowser(WebDriver driver,String url){
        driver.get(url);
    }


}
