package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    WebDriver driver;
    login objlogin;

    By email1 = By.id("email");
    By pass = By.name("passwd");
    By login = By.id("SubmitLogin");
    private String email;
    private String pss;

    public login(WebDriver driver){
        this.driver = driver;
        objlogin = new login(driver);
    }
    public void logemail(String email){
        this.email = email;
        driver.findElement((By) email1).sendKeys(email);
    }

    public void passset(String pss){
        this.pss = pss;
        driver.findElement(pass).sendKeys();
    }

    public void clicklogin()
    {
        driver.findElement(login).click();
    }
}
