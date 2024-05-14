/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
//import com.example.test.simpleFormDP;

public class simpleForm {


    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @Test (dataProvider = "Simple Sign Up Form", dataProviderClass = com.example.test.simpleFormDP.class)

    public void filling_form(String first_Name, String last_Name, String Email, String Contact){
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstName.sendKeys(first_Name);


        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastName.sendKeys(last_Name);


        WebElement eMail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        eMail.sendKeys(Email);


        WebElement contact = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        contact.sendKeys(Contact);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input"));
        submit.click();

        WebElement clear = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[2]/input"));
        clear.click();

    }

    @AfterClass (alwaysRun = true)
    public void end_session(){
        driver.close();
    }
*/


