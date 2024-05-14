import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class testActivity9 {

    WebDriver driver;

    @BeforeTest
    public void open_link(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");


    }

    @Test
    public void simpleAlertTestcase(){
        WebElement sat = driver.findElement(By.xpath("//*[@id=\"simple\"]"));
        sat.click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
    }
    @Test
    public void confirmAlertTestcase(){
        WebElement cat = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        cat.click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.accept();

    }
    @Test
    public void promptAlertTestCase(){
        WebElement pat = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        pat.click();
        pat.sendKeys("MoonPie");
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.accept();

    }


    @AfterTest
    public void close_link(){
        driver.close();
    }
}
