package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.login;
import pages.welcomepage;

import java.util.concurrent.TimeUnit;

public class testlogin {
    welcomepage obj;
    login objlogin;
    WebDriver driver;

    @BeforeTest
    public WebDriver driverSetup() {
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        //return driver;
        return driver;
    }

    @Test
    public void testlogin(){
        driverSetup();
        obj.clicksignin();
        objlogin.logemail("syedamishra@iut-dhaka.edu");
        objlogin.passset("Pass123");
        objlogin.clicklogin();
    }
}