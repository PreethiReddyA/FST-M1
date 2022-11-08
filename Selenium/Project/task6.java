import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class task6 {
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
        //Thread.sleep(4000);
        WebElement directory=driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
        wait.until(ExpectedConditions.visibilityOf(directory));
        wait.until(ExpectedConditions.elementToBeClickable(directory));
        System.out.println("Directory menu option is clickable");
        directory.click();
        directory.click();
        String heading=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(heading,"Search Directory");
        System.out.println("Heading :"+heading+"matches with the expected heading: Search Directory");
        // Close the browser
        driver.quit();
    }

}
