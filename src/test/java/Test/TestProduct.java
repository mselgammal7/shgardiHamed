package Test;

import Page.CategoryPage;
import Page.ProductPage;
import org.testng.annotations.Test;

public class TestProduct extends TestBase{

    ProductPage ProductPage;


    @Test(priority = 1)
    public void HappyProduct() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        ProductPage = new ProductPage(driver);
        ProductPage.user_name("subway@gmail.com");
        ProductPage.pass_word("100100100");
        ProductPage.log_in();
        ProductPage.cata_log();
        ProductPage.pro_duct();
        ProductPage.create_product();
        ProductPage.co_de("5");
        ProductPage.english_name("burger");
        ProductPage.arabic_name("برجر");
        ProductPage.english_description("delicious taste");
        ProductPage.arabic_description("مذاق رائع");
        ProductPage.ordering("55");
        ProductPage.select_size_type();
        ProductPage.size_type();
        ProductPage.select_size();
        ProductPage.si_ze();
        //ProductPage.select_tag();
       // ProductPage.t_ag();
        ProductPage.select_category();
        ProductPage.cat_egory();
        ProductPage.unitprice("30");
        ProductPage.productimage();
        ProductPage.buttonsave(driver);
        ProductPage.delete();
        ProductPage.enter();
        ProductPage.enter();






    }
}
