package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup {
    WebDriver driver;
    signup obsignup;
    By email = By.id("email_create");
    By submit = By.id("SubmitCreate");
    private String stremail;

    public signup(WebDriver driver){
        this.driver = driver;
        obsignup = new signup(driver);
    }
    public void inputemail(String stremail){
        this.stremail = stremail;
        driver.findElement((By) email).sendKeys(stremail);
    }

    public void clickcreate(){
        driver.findElement(submit).click();
    }
}
