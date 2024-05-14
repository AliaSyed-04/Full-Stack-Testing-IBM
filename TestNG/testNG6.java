import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG6{
    WebDriver driver;

    @BeforeTest
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"Username","Password"})
    public void testCase1(String Username,String Password) {
        //This test case will pass
        WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        user.sendKeys("admin");

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys(Password);

        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();
    }





    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();

    }

}

