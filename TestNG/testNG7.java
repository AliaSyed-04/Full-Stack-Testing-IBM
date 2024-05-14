import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testNG7 {

    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public Object[][] credentials(){
        return new Object[][]{
                {"admin", "password"},
        };
    }

    @Test (dataProvider = "Authentication")

    public void loginTest(String username, String password){
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(username);

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();

        System.out.println("logging in with username: "+username+" and Password: "+password);
        userName.clear();
        System.out.println("The credentials are correct");
        passWord.clear();
        System.out.println("The credentials are incorrect");
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();

    }

    ;
}
    }


}