package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class casualDress {
    WebDriver driver;
    casualDress objCD;

    public casualDress(WebDriver driver)
    {
        this.driver = driver;
        objCD = new casualDress(driver);
    }

    public void gotoCDsite()
    {
        WebElement cdButton = driver.findElement(By.linkText("Casual Dresses"));
        cdButton.click();
    }

}
