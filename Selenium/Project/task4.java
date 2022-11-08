import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/orangehrm");

        System.out.println("Tittle" + driver.getTitle());

        WebElement username = driver.findElement(By.id("txtUsername"));

        username.sendKeys("orange");

        WebElement password = driver.findElement(By.id("txtPassword"));

        password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        WebElement empname = driver.findElement(By.id("empsearch_employee_name_empName"));

        empname.sendKeys("candy");

        WebElement empid = driver.findElement(By.id("empsearch_id"));

        empid.sendKeys("123456");

        WebElement supervisorname = driver.findElement(By.id("empsearch_supervisor_name"));

        supervisorname.sendKeys("apple");

        driver.findElement(By.id("btnAdd")).click();

        WebElement firstname = driver.findElement(By.id("firstName"));

        firstname.sendKeys(("candy"));

        WebElement lastname = driver.findElement(By.id("lastName"));

        lastname.sendKeys(("choclate"));

        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        WebElement empname1 = driver.findElement(By.id("empsearch_employee_name_empName"));

        empname1.sendKeys(("candy choclate"));

        //WebElement empid1 = driver.findElement(By.id("empsearch_id"));

        //empid1.sendKeys("123456");

        driver.findElement(By.id("searchBtn")).click();
        driver.quit();

    }
}
