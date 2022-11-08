import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class task9 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        System.out.println("Tittle" + driver.getTitle());
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        ////*[@id="menu_pim_viewMyDetails"]
        driver.findElement(By.id("btnSave")).click();

        WebElement personal_txtEmpFirstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        personal_txtEmpFirstName.clear();
        personal_txtEmpFirstName.sendKeys("John");
        WebElement personal_txtEmpLastName = driver.findElement(By.id("personal_txtEmpLastName"));
        personal_txtEmpLastName.clear();
        personal_txtEmpLastName.sendKeys("Doe");
        //select gender
        driver.findElement(By.id("personal_optGender_1")).click();
        Select se = new Select(driver.findElement(By.xpath("//*[@id='personal_cmbNation']")));
//#personal_DOB
        WebElement personal_DOB = driver.findElement(By.id("personal_DOB"));
        personal_DOB.clear();
        personal_DOB.sendKeys("1997-10-12");
// Select the option by index
        se.selectByIndex(3);
// Select the option by index
        //se.selectByIndex(3);
        //save
        driver.findElement(By.id("btnSave")).click();
        driver.close();
    }
}
