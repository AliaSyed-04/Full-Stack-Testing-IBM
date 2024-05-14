import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG3 {
    static WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");


            WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));

            username.sendKeys("admin");
            password.sendKeys("password");

            WebElement login = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
            login.click();

    }
        @Test

        public static void test_case() {

            WebElement confirm_msg = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
            System.out.println(confirm_msg.getText());
            Assert.assertEquals("Welcome Back, admin", confirm_msg.getText());
        }

    }

