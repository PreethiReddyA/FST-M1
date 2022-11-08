import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task3 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Check the title of the page
        String pageTitle = driver.getTitle();
        //Print the title of the page
        System.out.println(pageTitle);

        //Find the input fields and enter text
        WebElement username = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        driver.quit();
    }
}
