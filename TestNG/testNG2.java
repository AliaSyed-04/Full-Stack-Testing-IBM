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

public class testNG2 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test
    public void checkTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        //System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Target Practice", title);

        //Find the clickable link on the page and click it
        //driver.findElement(By.id("about-link")).click();

        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "About Target Practice");
    }

    @Test
    public void find_Element() {

        WebElement button_color = (WebElement) driver.findElements(By.id("ui black button"));
        button_color.click();
        Assert.assertEquals(button_color.getText(), "Red button");


    }

    @Test(enabled = false)

    public void skip_param(){
        System.out.println("This test method should be skipped, but won't be shown as skipped. ");
    }

    @Test

    public void skip_exception() {
        throw new SkipException("Skip the test case please");
    }

    @AfterClass

    public void last_tc(){
        System.out.println("Skip Test case 4");
        throw new SkipException("Fourth Skipped");
    }


}
