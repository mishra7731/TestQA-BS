package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectCDress {
    WebDriver driver;
    casualDress objCD;
    selectCDress objselectCD;

    public selectCDress(WebDriver driver)
    {
        this.driver = driver;
        objselectCD = new selectCDress(driver);
    }

    public void addtoCart()
    {
        WebElement addCart = driver.findElement(By.linkText("Add to cart"));
        addCart.click();
    }
}
