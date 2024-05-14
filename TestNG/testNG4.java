import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class testNG4 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testCase1() {
        //This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (groups = {"HeaderTests"})
    public void HeaderTests1() {
        WebElement firstheader = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(firstheader.isDisplayed());
        Assert.assertEquals(firstheader.getText(), "First header");
    }

    @Test (groups = {"HeaderTests"})
    public void HeaderTests2() {
        WebElement secondheader = driver.findElement(By.tagName("h2"));
        Assert.assertTrue(secondheader.isDisplayed());
        Assert.assertEquals(secondheader.getText(), "Second header");
    }

    @Test (groups = {"HeaderTests"})
    public void HeaderTests3() {
        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        //This test case will Fail
        WebElement thirdheader = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(thirdheader.isDisplayed());
        Assert.assertEquals(thirdheader.getText(), "Third header");
    }

    @Test (groups = {"HeaderTests"})
    public void HeaderTests4() {
        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        //This test case will Fail
        WebElement fourthheader = driver.findElement(By.tagName("h4"));
        Assert.assertTrue(fourthheader.isDisplayed());
        Assert.assertEquals(fourthheader.getText(), "Fourth header");
    }

    @Test (groups = {"HeaderTests"})
    public void HeaderTests5() {
        //Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        //This test case will Fail
        WebElement fifthheader = driver.findElement(By.tagName("h5"));
        Assert.assertTrue(fifthheader.isDisplayed());
        Assert.assertEquals(fifthheader.getText(), "Fifth header");
    }

    @Test (groups = {"ButtonTests"})
    public void ButtonTests1 () {
        WebElement olivebutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        Assert.assertTrue(olivebutton.isDisplayed());
        Assert.assertEquals(olivebutton.getText(), "Olive");
    }

    @Test (groups = {"ButtonTests"})
    public void ButtonTests2 () {
        WebElement brownbutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[1]"));
        Assert.assertTrue(brownbutton.isDisplayed());
        System.out.println(brownbutton.getCssValue("color"));
        Assert.assertEquals(brownbutton.getText(), "Brown");
    }




    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }


}
