import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        System.out.println("Tittle" + driver.getTitle());
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"addWorkExperience\"]")).click();
        WebElement companyname = driver.findElement(By.xpath("//*[@id=\"experience_employer\"]"));
        companyname.sendKeys("XYZ");
        WebElement jobtittle = driver.findElement(By.xpath("//*[@id=\"experience_jobtitle\"]"));
        jobtittle.sendKeys("specialist");
        WebElement fromdate = driver.findElement(By.xpath("//*[@id=\"experience_from_date\"]"));
        fromdate.clear();
        fromdate.sendKeys("2021-08-16");
        WebElement todate = driver.findElement(By.xpath("//*[@id=\"experience_to_date\"]"));
        todate.clear();
        todate.sendKeys("2022-12-17");
        driver.findElement(By.xpath("//*[@id=\"btnWorkExpSave\"]")).click();
        driver.close();
    }

}
