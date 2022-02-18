package test;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.signup;
import pages.welcomepage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcreateaccount {
    welcomepage obj;
    signup obsignup;

    @BeforeTest
    public WebDriver driverSetup() {
        //String driverpath = "D:\\Java\\chromedriver_win32\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        //return driver;
        return driver;
    }

    @Test
    public void test2(){
        //WebDriver driver = driverSetup();
        driverSetup();
        obj.clicksignin();
        obsignup.inputemail("syedamishra@iut-dhaka.edu");
        //obsignup.inputemail("mishra.saiara@gmail.com");
        obsignup.clickcreate();
    }
}
