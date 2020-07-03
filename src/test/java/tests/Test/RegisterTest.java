package tests.Test;

import Data.RegisterData;
import Page.RegisterPage;
import controllers.PageBase;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.LoginPage;
import tests.shopTes.LoginTest;

public class RegisterTest extends TestBase {

    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(RegisterTest.class);
    @Test(priority = 1,dataProviderClass = RegisterData.class, dataProvider = "RegisterPage")
    public void RegisterTest(String fname,String lname,String phone,String email,String address,String city,String state,String postal,String username,String pass,String confirmpass) {
        softAssert = new SoftAssert();
        RegisterPage.ClickHome();
        softAssert.assertTrue(RegisterPage.isHomeDisplayed(), "home Page is not Displayed");
        RegisterPage.Clickregister();
        softAssert.assertTrue(RegisterPage.isHomeDisplayed(), "home Page is not Displayed");
        RegisterPage.setfirstname(fname);
        RegisterPage.setlastname(lname);
        RegisterPage.setphone(phone);
        RegisterPage.setemail(email);
        RegisterPage.setaddress(address);
        RegisterPage.setcity(city);
        RegisterPage.setStateProvince(state);
        RegisterPage.setpostalcode(postal);
        RegisterPage.Selectcountry();
        RegisterPage.setusername(username);
        RegisterPage.setpassword(pass);
        RegisterPage.setconfirmpass(confirmpass);
        RegisterPage.Clicksubmitbt();
        softAssert.assertAll();

    }
}
