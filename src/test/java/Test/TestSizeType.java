package Test;

import Page.SizeTypePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSizeType extends TestBase{

    SizeTypePage sizeTypePage;


    @Test(priority = 1)
    public void Happysizetype() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        sizeTypePage = new SizeTypePage(driver);
        sizeTypePage.user_name("username369@gmail.com");
        sizeTypePage.pass_word("100100");
        sizeTypePage.log_in();
        sizeTypePage.cata_log();
        sizeTypePage.size_type();
        sizeTypePage.cre_ate();
        sizeTypePage.english_name("pizza sizes");
        sizeTypePage.arabic_name("احجام البيتزا");
        sizeTypePage.act_ive();
        sizeTypePage.sa_ve();
        sizeTypePage.delete();
        sizeTypePage.enter();
        Thread.sleep(3000);
        Assert.assertTrue(sizeTypePage.deleteMessage.getText().contains("SizeTypeDeleteSuccessfully"));
    }
}
