package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class welcomepage {
        private WebDriver driver;
        welcomepage obj;

        public welcomepage(WebDriver driver)
        {
            this.driver = driver;
            obj = new welcomepage(driver);
        }

        public boolean clicksignin(WebElement button){
            driver.findElement((By) button).click();
            return true;
        }
    }
