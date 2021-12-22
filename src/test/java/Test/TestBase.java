package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {


    public static WebDriver driver;


    @BeforeTest
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName) {

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Link
       // driver.navigate().to("https://partner-dev.shgardi.app/auth/login");

        // Demo Link
        // driver.navigate().to("Link demo here");

        // Live Link
        // driver.navigate().to("Link live here");
    }

    @AfterTest
    public void stopDriver() {

        //driver.quit();
    }
}