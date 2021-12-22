package Test;

import Page.AdditionalPage;
import Page.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAdditional extends TestBase {

    AdditionalPage AdditionalPage;


    @Test(priority = 1)
    public void HappyAdditional() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        AdditionalPage = new AdditionalPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdditionalPage.user_name("subway@gmail.com");
        AdditionalPage.pass_word("100100100");
        AdditionalPage.log_in();
        AdditionalPage.cata_log();
        AdditionalPage.pro_duct();
        AdditionalPage.edit();
        AdditionalPage.additionalskus(driver);
        AdditionalPage.createadditionalsku(driver);
        AdditionalPage.code("1");
        AdditionalPage.select();
        AdditionalPage.size();
        AdditionalPage.price("20");
        AdditionalPage.ordering("2");
        AdditionalPage.save(driver);
        AdditionalPage.delete();
        AdditionalPage.enter();
        AdditionalPage.component(driver);
        AdditionalPage.createcomponent(driver);
        AdditionalPage.selectcomponent();
        AdditionalPage.choosecomponent();
        AdditionalPage.defult();
        AdditionalPage.savebutton(driver);
        AdditionalPage.delete1();
        AdditionalPage.enter1();
        AdditionalPage.option(driver);
        AdditionalPage.englishname("choose something else");
        AdditionalPage.arabicname("أختر شئ أخر");
        AdditionalPage.selectsku();
        AdditionalPage.sku();
        AdditionalPage.ordering2("1");
        AdditionalPage.save2(driver);
        AdditionalPage.edit2();
        AdditionalPage.selectsku2();
        AdditionalPage.addoption();
        AdditionalPage.price2("20");
        AdditionalPage.checkbox();
        AdditionalPage.save3(driver);
        AdditionalPage.delete2();
    }
}
