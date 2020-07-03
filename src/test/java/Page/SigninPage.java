package Page;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SigninPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(SigninPage.class);
    public SoftAssert softAssert;

    private static By Home = By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a");
//    private static By Signin = By.xpath("//input[@name=\"login\"]");
    private static By Signin = By.xpath("//*[@href=\"mercurysignon.php\"]");
    private static By username = By.xpath("//input[@name=\"userName\"]");
    private static By password = By.xpath("//input[@name=\"password\"]");
    private static By submitbt = By.xpath("//*[@name=\"login\"]");

    public static boolean isHomeDisplayed() {
        return getDriver().findElement(Home).isDisplayed();
    }
    public static void ClickHome() {
        getDriver().findElement(Home).click();
    }

    public static boolean isSigninDisplayed() {
        return getDriver().findElement(Signin).isDisplayed();
    }
    public static void ClickSignin() {

        getDriver().findElement(Signin).click();
    }

    public static void setusername(String Username) {
        getDriver().findElement(username).sendKeys(Username);
    }
    public static void setpassword(String Password) {
        getDriver().findElement(password).sendKeys(Password);
    }
    public static void Clicksubmitbt() {
        getDriver().findElement(submitbt).click();
    }

}
