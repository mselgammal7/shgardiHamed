package Test;

import Page.CategoryPage;
import Page.ComponentPage;
import org.testng.annotations.Test;

public class TestComponent extends TestBase{

    ComponentPage ComponentPage;


    @Test(priority = 1)
    public void HappyComponent() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        ComponentPage = new ComponentPage(driver);
        ComponentPage.user_name("username369@gmail.com");
        ComponentPage.pass_word("100100");
        ComponentPage.log_in();
        ComponentPage.cata_log();
        ComponentPage.compo_nent();
        ComponentPage.create_component();
        ComponentPage.english_name("onion");
        ComponentPage.arabic_name("بصل");
        ComponentPage.pr_ice("3");
        ComponentPage.sa_ve();
        ComponentPage.delete();
        ComponentPage.enter();
    }
}
