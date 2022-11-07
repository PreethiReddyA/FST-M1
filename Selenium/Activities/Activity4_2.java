import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title=driver.getTitle();
        System.out.println("Title of this page is:"+ title);
        //FirstName
        WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstName.sendKeys("Preethi");
        //LastName
        WebElement lastname= driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastname.sendKeys("Reddy");
        //Email
        WebElement emailid=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailid.sendKeys("preethi.reddy@gmail.com");
        //ContactNumber
        WebElement number=driver.findElement(By.xpath("//*[@id=\"number\"]"));
        number.sendKeys("9678109282");
        //Message
        WebElement message=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
        message.sendKeys("this is optional text");
        //submitbutton
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
        System.out.println("form has been submitted");
        driver.close();

    }
}
