package tests.Test;

import Data.RegisterData;
import Data.SigninData;
import Page.RegisterPage;
import Page.SigninPage;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SigninTest extends TestBase {

    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(SigninTest.class);
    @Test(priority = 1,dataProviderClass = SigninData.class, dataProvider = "SigninPage")
    public void RegisterTest(String username,String pass) {
        softAssert = new SoftAssert();
        SigninPage.ClickHome();
        softAssert.assertTrue(SigninPage.isHomeDisplayed(), "home Page is not Displayed");
        SigninPage.isSigninDisplayed();
        softAssert.assertTrue(SigninPage.isSigninDisplayed(), "Signin page is not Displayed");
        SigninPage.setusername(username);
        SigninPage.setpassword(pass);
        SigninPage.Clicksubmitbt();
        softAssert.assertAll();

    }
}
