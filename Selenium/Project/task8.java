import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class task8 {
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
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/span")).click();
        Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]")));
        //dropdown.selectByVisibleText("DayOff");
        dropdown.selectByValue("1");
        WebElement fromdate = driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]"));
        fromdate.clear();
        fromdate.sendKeys("2022-11-28");
        WebElement todate = driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]"));
        todate.clear();
        todate.sendKeys("2022-11-29");
        driver.findElement(By.xpath("//*[@id=\"applyBtn\"]")).click();
        System.out.println("Leave applied");
        driver.findElement(By.xpath("//*[@id=\"menu_leave_viewMyLeaveList\"]")).click();
        Thread.sleep(10000);
        WebElement fromdate2 = driver.findElement(By.xpath("//*[@id=\"calFromDate\"]"));
        fromdate2.clear();
        fromdate2.sendKeys("2022-11-28");
        WebElement todate2 = driver.findElement(By.xpath("//*[@id=\"calToDate\"]"));
        todate2.clear();
        todate2.sendKeys("2022-11-29");
        driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
        Thread.sleep(10000);


        driver.close();
    }
}
