package Page;

import controllers.MethodBase;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static controllers.PageBase.getDriver;

/*
creater by Thusi
script Register
Date 01.07.2020
Update by 03.07.2020
 */

public class RegisterPage {

    private static final Logger LOGGER = Logger.getLogger(RegisterPage.class);

    private static By Home = By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a");
    private static By register = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a");
    private static By firstname = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input");
    private static By lastname = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input");
    private static By phone = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input");
//    private static By email = By.xpath("/*[@id=\"userName\"]");
    private static By email = By.id("userName");
    private static By address = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input");
    private static By city = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input");
    private static By StateProvince = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input");
    private static By postalcode = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input");
        private static By country = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select");
//    private static By username = By.xpath("//*[@id=\"email\"]");

    private static By username = By.xpath("//*[@name=\"email\"]");
    private static By password = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");
    private static By confirmpass = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input");
    private static By submitbt = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");

    public static boolean isHomeDisplayed() {
        return getDriver().findElement(Home).isDisplayed();
    }
    public static void ClickHome() {
        getDriver().findElement(Home).click();
    }
    public static boolean isregisterDisplayed() {
        return getDriver().findElement(register).isDisplayed();
    }
    public static void Clickregister() {
        getDriver().findElement(register).click();
    }
    public static void setfirstname(String first_name) {
        getDriver().findElement(firstname).sendKeys(first_name);
    }
    public static void setlastname(String last_name) {
        getDriver().findElement(lastname).sendKeys(last_name);
    }
    public static void setphone(String Phone) {
        getDriver().findElement(phone).sendKeys(Phone);
    }
    public static void setemail(String Email) {
        getDriver().findElement(email).sendKeys(Email);
    }
    public static void setaddress(String Address) {
        getDriver().findElement(address).sendKeys(Address);
    }
    public static void setcity(String City) {
        getDriver().findElement(city).sendKeys(City);
    }
    public static void setStateProvince(String State_Province) {
        getDriver().findElement(StateProvince).sendKeys(State_Province);
    }
    public static void setpostalcode(String postal_code) {
        getDriver().findElement(postalcode).sendKeys(postal_code);
    }
    public static void Clickcountry() {
        getDriver().findElement(country).click();
    }
    public static void setusername(String user_name) {
        getDriver().findElement(username).sendKeys(user_name);
    }
    public static void setpassword(String Password) {
        getDriver().findElement(password).sendKeys(Password);
    }
    public static void setconfirmpass(String confirm_pass) {
        getDriver().findElement(confirmpass).sendKeys(confirm_pass);
    }
    public static void Clicksubmitbt() {
        getDriver().findElement(submitbt).click();
    }
    public static void Selectcountry() {
        MethodBase.selectDropDown("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select","ALBANIA");
        LOGGER.info("country Selected");
    }

}

