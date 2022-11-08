import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class task2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement image = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        String url;
        url=image.getAttribute("src");
        System.out.println("URL is: "+url);
        driver.quit();
    }
}
