package tests.shopTes;


import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.LoginPage;

/*
 Create by  P.Theva
 2020/6/22
  Shop Login Script
   */
public class LoginTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(groups = { "test", "regression", "smoke"}, priority = 3)
    public void testlogin() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Shop Page is not Displayed");
        LoginPage.clickloginUrl();
        softAssert.assertTrue(LoginPage.isLoginDisplayed(), "Shop Page is not Displayed");
        LoginPage.setUserName("dailog1996@gmail.com");
        LoginPage.setPassword("admin123");
        LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Account Page is not displayed");
        softAssert.assertAll();

        LOGGER.info("successful Login");
    }

}
