package Test;

import Page.LoginPage;
import Page.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestSignUp extends TestBase {

    SignUpPage signUpPage;


    @Test(priority = 1)
    public void HappySignUp() throws InterruptedException {

        driver.get("https://www.google.com/maps/search/https:%2F%2Fwww.google.com%2Fmaps%2Fplace%2FDr.Alaa%2BEzzat%2BHospital%2F@29.9633139,31.2480701,18z%2Fdata%3D!4m5!3m4!1s0x145847eddcb607f5:0x586683ac7dd31f42!8m2!3d29.9627984!4d31.2496875/@29.9628007,31.2485932,18z/data=!3m1!4b1");
        driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.CONTROL + "c");
        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);


    }

    @Test(priority = 2)
    public void EmptyPhoneNumber() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.invalidphone("");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.phonenumberrequird.getText().contains("Phone Number required"));

    }

    @Test(priority = 3)
    public void ShortPhoneNumber() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.invalidphone("123");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber.getText().contains("Invalid Phone Number"));

    }

    @Test(priority = 4)
    public void invalidPhoneNumber() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.invalidphone("552525252");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 5)
    public void invalidPhoneNumber2() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("1234526585");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 6)
    public void TallPhoneNumber() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("5555555555");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 7)
    public void PhoneNumberalreadyregistered() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.invalidphone("1220225220");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Thread.sleep(4000);
        Assert.assertTrue(signUpPage.numberisalreadyregistred.getText().contains("partner with mobile number +201220225220 is already registred"));
    }

    @Test(priority = 8)
    public void emptyusername() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.usernamerequird.getText().contains("Username requried"));
    }

    @Test(priority = 9)
    public void invalidusername() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("us");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername.getText().contains("You have less than 3 characters"));
    }

    @Test(priority = 10)
    public void invalidusername1() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName(".username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 11)
    public void invalidusername2() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("usernameusernameusern");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername2.getText().contains("You have more than 20 characters"));
    }

    @Test(priority = 12)
    public void invalidusername3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("_username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 13)
    public void invalidusername4() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username.");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 14)
    public void invalidusername5() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username_");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 15)
    public void invalidusername6() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("user_.name");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 16)
    public void invalidusername7() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("user__name");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.errorusername1.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name).\n" +
                "Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 17)
    public void emptyemail1() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.emailrequird.getText().contains("Email required"));
    }

    @Test(priority = 18)
    public void invalidemail() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("us");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.lessthan3characters.getText().contains("You have less than 3 characters"));
    }

    @Test(priority = 19)
    public void invalidemail1() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("username@yahoo.c");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidemail.getText().contains("Invalid Email Address"));
    }

    @Test(priority = 20)
    public void invalidemail2() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("username@yahoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo0");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.morethan100characters.getText().contains("You have more than 100 characters"));
    }

    @Test(priority = 21)
    public void invalidemail3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("user name@yahoo.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.invalidemail.getText().contains("Invalid Email Address"));
    }

    @Test(priority = 22)
    public void Emailalreadyregistred() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("subway@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.emailalreadyregistred.getText().contains("partner with Email subway@gmail.com is already registred"));
    }

    @Test(priority = 23)
    public void passwordrequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.passwordrequird.getText().contains("Password requried"));
    }

    @Test(priority = 24)
    public void fristnamerequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.fristnamerequird.getText().contains("Partner Frist Name Required"));
    }

    @Test(priority = 25)
    public void lastnamerequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.lastnamerequird.getText().contains("Partner Last Name Required"));
    }

    @Test(priority = 26)
    public void companynameenglishrequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.companynameenglishrequird.getText().contains("Company Name English Required"));
    }

    @Test(priority = 27)
    public void companynamearabicrequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.companynamearabicrequird.getText().contains("Company Name Arabic Required"));
    }

    @Test(priority = 28)
    public void storecategorytyperequird() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.storeCategoryTyperequired.getText().contains("Store Category Type requried"));
    }

    @Test(priority = 29)
    public void MaxAllowedStoreCategoryTypes() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.ClickOnSelect7();
        signUpPage.ClickOnSelect8();
        signUpPage.ClickOnSelect9();
      //  signUpPage.choosefile();
     //   signUpPage.nextbutton1(driver);
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.MaxAllowedStoreCategoryTypes3.getText().contains("Max Store Category Type Is 3"));
    }

    @Test(priority = 30)
    public void usernameallreadyused() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("subway");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.userallreadyused.getText().contains("Login name subway is already used"));
    }

    @Test(priority = 31)
    public void emptycompanyelogo() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("subway");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.nextbutton1(driver);
        Assert.assertTrue(signUpPage.companylogorequird.getText().contains("Company Logo required"));
    }

    @Test(priority = 32)
    public void emptynameofmanager() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.nameofmanager.getText().contains("Store Manager Name requried"));
    }

    @Test(priority = 33)
    public void shortnameofmanager() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ab");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.shortnameofmanager.getText().contains("You have less than 3 characters"));
    }

    @Test(priority = 34)
    public void emptyphonenumber3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.phone2requird.getText().contains("Phone Number required"));
    }

    @Test(priority = 35)
    public void shortphonenumber3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("552");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber2.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 36)
    public void invalidphonenumber3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("1202525555");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber2.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 37)
    public void invalid2PhoneNumber3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("543298483");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.samenumber.getText().contains("Cannot have same phone number for partner and store"));
    }


    @Test(priority = 38)
    public void tallPhoneNumber3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("5432984838");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidphonenumber2.getText().contains("Invalid Phone Number"));
    }

    @Test(priority = 39)
    public void PhoneNumber3allreadyregistered() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("552344193");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.phonallreadyresgistered.getText().contains("Store with mobile number +966552344193 is already registred"));
    }

    @Test(priority = 40)
    public void emptyusername8() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.username3.getText().contains("Username requried"));
    }

    @Test(priority = 41)
    public void invalidusername9() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("us");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername8.getText().contains("You have less than 3 characters"));
    }

    @Test(priority = 42)
    public void invalidusername10() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3(".username");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 43)
    public void invalidusername11() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("usernameusernameusern");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Number of Characters must be between 3 to 20."));
    }

    @Test(priority = 44)
    public void invalidusername12() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("_username");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 45)
    public void invalidusername13() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("username.");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 46)
    public void invalidusername14() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("username_");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 47)
    public void invalidusername15() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("user_.name");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 48)
    public void invalidusername16() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode1();
        signUpPage.invalidphone("543298483");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("user__name");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.invalidusername9.getText().contains("Only Contains Alphanumeric Characters, underscore and dot.\n" +
                "Underscore and dot can't be at the end or start of a username (e.g _username / username_ /.username / username.).\n" +
                "Underscore and dot can't be next to each other (e.g user_.name).\n" +
                "Underscore or dot can't be used multiple times in a row (e.g user__name / user..name)."));
    }

    @Test(priority = 49)
    public void sameusername() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("username");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.sameusername.getText().contains("Cannot have same loginName for partner and store"));
    }

    @Test(priority = 50)
    public void usernamealreadyused() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.invalidUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger2("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone3("502255225");
        signUpPage.user_name3("hamed");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.usernamealreadyused.getText().contains("Login name hamed is already used"));
    }

    @Test(priority = 51)
    public void emptystoremanageremail() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.manageremail.getText().contains("Store Manager Email requried"));

    }

    @Test(priority = 52)
    public void shortstoremanageremail() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("us");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.shortemail.getText().contains("You have less than 3 characters"));

    }

    @Test(priority = 53)
    public void storemanageremail1() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("username@gmail.c");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidmanageremail1.getText().contains("Invalid Store Manager Email Address"));

    }

    @Test(priority = 54)
    public void storemanageremail2() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("username@yahoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo0");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidmanageremail2.getText().contains("You have more than 100 characters"));
        Assert.assertTrue(signUpPage.invalidmanageremail22.getText().contains("Invalid Store Manager Email Address"));
    }

    @Test(priority = 55)
    public void storemanageremail3() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("user name@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.invalidmanageremail1.getText().contains("Invalid Store Manager Email Address"));
    }


    @Test(priority = 56)
    public void storemanageremail4() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("hamed@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(3000);
        Assert.assertTrue(signUpPage.manageremailregistred.getText().contains("Store with Email hamed@gmail.com is already registred"));
    }

    @Test(priority = 57)
    public void storemanageremail5() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.createinvalidemail("username@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);


        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email1("username@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.manageremailwithpartnerdata.getText().contains("Cannot have same email for partner and store"));
    }


    @Test(priority = 58)
    public void emptypassword() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.passwordrequired1.getText().contains("Password requried"));
    }

    @Test(priority = 59)
    public void emptyconfirmpassword() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.confirmpasswordrequired.getText().contains("Confirm Password requried"));
    }

    @Test(priority = 60)
    public void Passworddoesnotmatch() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("200200");
        signUpPage.nextbutton2(driver);
        Assert.assertTrue(signUpPage.passwordandconfirmpasswordnotmatch.getText().contains("Password and Confirm Password does not match"));
    }

    @Test(priority = 61)
    public void emptyenglishname() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("");
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.nameenglishrequired.getText().contains("Name English is required"));

    }

    @Test(priority = 63)
    public void twitter() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.twitteraccount("kfc@twitter.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errortwitterinvalid.getText().contains("Error in field format"));

    }

    @Test(priority = 64)
    public void instagram() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("");
        signUpPage.instagramaccount("kfc@instagram.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errorinstagraminvalid.getText().contains("Error in field format"));
    }

    @Test(priority = 65)
    public void youtube() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("");
        signUpPage.youtubeaccount("kfc@youtube.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.erroryoutubeinvalid.getText().contains("Error in field format"));
    }

    @Test(priority = 66)
    public void facebook() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("");
        signUpPage.facebookaccount("kfc@facebook.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errorfacebookinvalid.getText().contains("Error in field format"));
    }

    @Test(priority = 67)
    public void snapchat() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("");
        signUpPage.snapchataccount("kfc@snapchat.com");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("20");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errorsnapchatinvalid.getText().contains("Error in field format"));
    }

    @Test(priority = 68)
    public void maxdeliverytime() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("5");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapurl();
        signUpPage.registerbtton(driver);
        Assert.assertTrue(signUpPage.errordeliverytime.getText().contains("Min value is 15"));
    }

    @Test(priority = 69)
    public void mapurl() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        signUpPage = new SignUpPage(driver);
        signUpPage.ClickSignUp();
        signUpPage.ClickOnSelect();
        signUpPage.ClickOnCode();
        signUpPage.CreatePhoneNumber("1202020 ");
        signUpPage.CreateUserName("username");
        signUpPage.CreateEmail("username", "@gmail.com");
        signUpPage.CreatePassword("100100");
        signUpPage.CreateFirstName("kfc");
        signUpPage.CreateLastName("kfc");
        signUpPage.companynameenglish("shgardi");
        signUpPage.companynamearabic("شقردى");
        signUpPage.ClickOnSelect2();
        signUpPage.ClickOnSelect3();
        signUpPage.ClickOnSelect4();
        signUpPage.ClickOnSelect5();
        signUpPage.ClickOnSelect6();
        signUpPage.choosefile();
        signUpPage.nextbutton1(driver);

        signUpPage.nameofmanger("ahmed");
        //  signUpPage.code_22();
        // signUpPage.code_23();
        signUpPage.phone2("550000");
        signUpPage.user_name2("ali");
        signUpPage.store_manager_email("ali", "@gmail.com");
        signUpPage.CreatePassword2("100100");
        signUpPage.confirmpassword("100100");
        signUpPage.nextbutton2(driver);

        signUpPage.store_code("1");
        signUpPage.commerical_number("123");
        signUpPage.name_english("kfc maadi");
        signUpPage.name_arabic("كنتاكى المعادى");
        signUpPage.hot_line("11011");
        signUpPage.maxestmation("15");
        signUpPage.minimum_Charge("30");
        signUpPage.choose_file();
        signUpPage.choose_file2();
        signUpPage.mapmap();
        signUpPage.registerbtton(driver);
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.selectmapurl.getText().contains("please select location"));
    }
}
