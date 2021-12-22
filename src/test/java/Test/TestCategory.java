package Test;

import Page.CategoryPage;
import Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategory extends TestBase{


    CategoryPage CategoryPage;

    @Test(priority = 1)
    public void HappyCategory() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        CategoryPage = new CategoryPage(driver);
        CategoryPage.user_name("username369@gmail.com");
        CategoryPage.pass_word("100100");
        CategoryPage.log_in();
        CategoryPage.cata_log();
        CategoryPage.cate_gory();
        CategoryPage.cre_ate();
        CategoryPage.sel_ect();
        CategoryPage.sel_ect1();
        CategoryPage.english_name("sandwich");
        CategoryPage.arabic_name("ساندوتش");
        CategoryPage.english_description("sandwich");
        CategoryPage.arabic_description("ساندوتش");
        CategoryPage.act_ive();
        CategoryPage.choose_file();
        CategoryPage.sa_ve(driver);
        CategoryPage.delete();
      //  CategoryPage.enter();


    }
}
