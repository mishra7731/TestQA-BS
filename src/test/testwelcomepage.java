package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import pages.welcomepage;

public class testwelcomepage {

    welcomepage obj;
    public static WebDriver driverSetup()
    {
        String driverpath = "F:\\Java\\chromedriver_win32\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();;
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver.manage().window().maximize();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        return driver;
    }
    @Test
    private void test(){
        WebDriver driver = driverSetup();
        //oilCum cum = new oilCum(driver);
        WebElement button = driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]"));
        obj.clicksignin(button);
        System.out.println("Test");
        //Assertions.assertEquals(true ,cum.clicksignin(button));
    }

}
