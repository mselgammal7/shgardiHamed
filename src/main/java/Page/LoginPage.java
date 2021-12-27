package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy (id = "username")
    public WebElement usernameTx;
    @FindBy (id = "password")
    public WebElement passwordTx;
    @FindBy (id = "btn_login kt_login_signin_submit")
    public WebElement LoginButton;
    @FindBy (xpath = "//*[@id=\"kt_header\"]/kt-topbar/div/kt-user-profile/div/div[1]/div/span[3]")
    public WebElement message;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message1;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message2;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]")
    public WebElement message3;
    @FindBy (xpath = "//*[@id=\"kt_login\"]/div/div[2]/kt-login/div/div/form/div[2]/mat-form-field/div/div[3]/div")
    public WebElement message4;
    @FindBy (xpath = "//*[@id=\"toast-container\"]/div/div[2]")
    public WebElement message5;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void AddUserName(String name)
    {

        usernameTx.sendKeys(name);

    }

    public void AddPassword(String password)
    {

        passwordTx.sendKeys(password);

    }


    public void ClickLogin() throws InterruptedException
    {
        LoginButton.click();
        Thread.sleep(1000);
    }
}
