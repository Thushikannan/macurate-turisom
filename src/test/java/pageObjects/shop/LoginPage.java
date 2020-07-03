package pageObjects.shop;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);


    private static By hdrWebshop = By.xpath("//*[@class=\"logo img-responsive\"]");
    private static By LoginUrlClick =By.xpath("//a[@class=\"login\"]");
    private static By LoginFormHr=By.xpath("//*[@src=\"http://automationpractice.com/img/logo.jpg\"]");
    private static By txtUserName = By.id("email");
    private static By txtPassword = By.id("passwd");
    private static By btnSubmit = By.id("SubmitLogin");
    private static By alertLogoutSuccess = By.id("flash");

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(hdrWebshop).isDisplayed();
    }

    public static void setUserName(String username) {
        getDriver().findElement(txtUserName).sendKeys(username);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnSubmit).click();
    }
    public static void clickloginUrl() {
        getDriver().findElement(LoginUrlClick).click();
    }

    public static boolean isLoginDisplayed() {
        return getDriver().findElement(LoginFormHr).isDisplayed();
    }

    public static String getLogoutAlertMessage() {
        return getDriver().findElement(alertLogoutSuccess).getText();
    }
}
