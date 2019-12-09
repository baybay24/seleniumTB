package operate;

import org.openqa.selenium.WebDriver;
import tools.BasePage;
import pages.LoginPage;
import tools.WaitTime;

public class LoginOperate {

    LoginPage login;
    BasePage base;
    WebDriver driver;

    public LoginOperate(BasePage base, WebDriver driver){
        login = new LoginPage(base,driver);
    }

    public void login(String username, String password){
        if(login.currentPage()){
            login.searchElement().submit();
            WaitTime.waitingMilliseconds(1);

            login.loginBoxElement().click();
            WaitTime.waitingMilliseconds(1);

            login.findLoginBlock();
            login.usernameElement().sendKeys(username);
            login.passwordElement().sendKeys(password);
            WaitTime.waitingMilliseconds(1);
            login.buttonElement().submit();

//            login.currentLogin(username);

        }
    }

}
