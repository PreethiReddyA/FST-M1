import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task5 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the browser
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
        //Login
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
                //My Info
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();

        WebElement EditButton=driver.findElement(By.xpath("//input[@value=\"Edit\"]"));
        wait.until(ExpectedConditions.visibilityOf(EditButton));
        EditButton.click();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("Ashwini");
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("Harbhakanjj");
        driver.findElement(By.xpath("//*[@id=\"personal_optGender_2\"]")).click();
        Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]")));
        dropdown.selectByVisibleText("Kuwaiti");
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).sendKeys("1995-10-12");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();




        // Close the browser
        driver.quit();
    }
}
