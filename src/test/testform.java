package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.fillform;

import java.util.concurrent.TimeUnit;

public class testform {
    fillform objform;
    WebDriver driver;

    @BeforeTest
    public WebDriver driverSetup() {
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication#account-creation");

        //return driver;
        return driver;
    }

    @Test
    public void test3()
    {
        objform.setTitle();
        objform.setFirstname("Syeda");
        objform.setCname("Saiara");
        objform.setEmail("syedamishra@-iut-dhaka.edu");
        objform.setPass("pass123");
        objform.setDate();
        objform.setMonth();
        objform.setYear();
        objform.checknl();
        //objform.check2();
        objform.setname1("XYZZ");
        objform.setname2("ksnkdcnkd");
        objform.setcompany("IUT");
        //objform.setadd1();        //Check if required works
        objform.setadd2("Dhanmondi 12/A");
        objform.setcity("Dhaka");
        objform.setState();
        objform.setZip("98074");
        objform.setCountry();
        objform.setotherinfo("test info");
        objform.sethomephone("0947322");
        objform.setmp("877777");
        objform.setreference("N/A");

        objform.clicksubmit();

    }
}
