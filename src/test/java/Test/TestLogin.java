package Test;

import Page.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.LoginPage;
import java.util.concurrent.TimeUnit;

import static Test.TestBase.driver;

public class TestLogin extends TestBase
{
    LoginPage loginPage;


    @Test(priority = 1)
    public void WrongPassword() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("202020");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message1.getText().contains("Wrong Password"));


    }

    @Test(priority = 2)
    public void UserNotRegistered() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("rest");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message2.getText().contains("UserNotRgeistred"));


    }

    @Test(priority = 3)
    public void Minimumlengthcharacter() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message3.getText().contains("Password : minimum Length is 6 characters"));


    }

    @Test(priority = 4)
    public void PasswordIsRequierd() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message4.getText().contains("Password requried"));


    }

    @Test(priority = 5)
    public void EmailIsRequierd() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        // test pul

    }

    @Test(priority = 6)
    public void EmailNotActive() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("pizzadominos@gmail.com");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message5.getText().contains("CannotLoginWithInActiveUser"));

    }
    @Test(priority = 7)
    public void HappyLogin() throws InterruptedException {
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.AddUserName("dairyqueen");
        loginPage.AddPassword("100100");
        loginPage.ClickLogin();
        Assert.assertTrue(loginPage.message.getText().contains("dairy queen"));

    }


}
