package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selectCDress;
import pages.casualDress;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class testcasualdress {
    WebDriver driver;
    casualDress objCD;
    selectCDress objselectCD;

    @BeforeTest
    public WebDriver driverSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=my-account");

        return driver;
    }

    @Test
    public void checkaddtocart()
    {
        objCD.gotoCDsite();
        objselectCD.addtoCart();
    }

}
