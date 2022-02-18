package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class fillform {
    WebDriver driver;
    fillform objform;
    By title = By.className("radio-inline");
    By firstname = By.name("customer_firstname");
    By cname = By.name("customer_lastname");
    By email = By.id("email");
    By pass = By.name("passwd");

    public fillform(WebDriver driver){
        this.driver = driver;
        objform = new fillform(driver);
    }

    public void setTitle()
    {
        driver.findElement(title).isSelected();
    }

    public void setFirstname(String strfname)
    {
        driver.findElement(firstname).sendKeys(strfname);
    }

    public void setCname(String strcname)
    {
        driver.findElement(cname).sendKeys(strcname);
    }

    public void setEmail(String stremail)
    {
        driver.findElement(email).sendKeys(stremail);
    }

    public void setPass(String strpass)
    {
        driver.findElement(pass).sendKeys(strpass);
    }

    public void setDate(){
        Select date = new Select(driver.findElement(By.id("days")));
        date.selectByVisibleText("3");
    }
    public void setMonth(){
        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByVisibleText("March");
    }

    public void setYear(){
        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByVisibleText("1999");
    }

    public boolean checknl()
    {
        driver.findElement(By.name("newsletter")).isSelected();
        return true;
    }
    public boolean check2()
    {
        driver.findElement(By.name("optin")).isSelected();
        return true;
    }

    public void setname1(String strname1)
    {
        driver.findElement(By.id("firstname")).sendKeys(strname1);
    }

    public void setname2(String strname2)
    {
        driver.findElement(By.id("lastname")).sendKeys(strname2);
    }

    public void setcompany(String strcom)
    {
        driver.findElement(By.id("company")).sendKeys(strcom);
    }

    public void setadd1(String strad1)
    {
        driver.findElement(By.id("address1")).sendKeys(strad1);
    }
    public void setadd2(String strad2)
    {
        driver.findElement(By.id("address2")).sendKeys(strad2);
    }
    public void setcity(String strcity)
    {
        driver.findElement(By.id("city")).sendKeys(strcity);
    }

    public void setState(){
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("California");
    }

    public void setZip(String strzip)
    {
        driver.findElement(By.id("postcode")).sendKeys(strzip);
    }

    public void setCountry() {
        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByVisibleText("United States");
    }

    public void setotherinfo(String strinfo)
    {
        driver.findElement(By.id("other")).sendKeys(strinfo);
    }
    public void sethomephone(String strhp)
    {
        driver.findElement(By.id("phone")).sendKeys(strhp);
    }
    public void setmp(String strmp)
    {
        driver.findElement(By.id("phone_mobile")).sendKeys(strmp);
    }
    public void setreference(String strref)
    {
        driver.findElement(By.id("alias")).sendKeys(strref);
    }
    public void clicksubmit()
    {
        driver.findElement(By.className("btn btn-default button button-medium")).click();
    }


}
