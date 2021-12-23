package Test;

import Page.SizePage;
import Page.SizeTypePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSize extends TestBase{


    SizePage SizePage;


    @Test(priority = 1)
    public void Happysize() throws InterruptedException {

        driver.navigate().to("https://partner-dev.shgardi.app/auth/login");
        SizePage = new SizePage(driver);
        SizePage.user_name("username369@gmail.com");
        SizePage.pass_word("100100");
        SizePage.log_in();
        SizePage.cata_log();
        SizePage.si_ze();
        SizePage.create_size();
        SizePage.english_name("small");
        SizePage.arabic_name("صغير");
        SizePage.sel_ect();
        SizePage.sele_ct1();
        SizePage.act_ive();
        SizePage.sa_ve();
        SizePage.delete();
        SizePage.enter();
        Thread.sleep(3000);
        Assert.assertTrue(SizePage.deleteMessage.getText().contains("SizeDeleteSuccessfully"));

    }
}
