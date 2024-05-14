
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class task3Step{
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on the Login Page$")
    public void userIsOnLoginPage() throws Throwable {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");

    }

    @When("^User enters username and password$")
    public void userEntersUsernameAndPassword() throws Throwable {
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password", Keys.RETURN);
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();
    }

    @Then("^Read the page title and the confirmation message$")
    public void readThePageTitleAndConfirmMessage() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String actionStats = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(actionStats);

        System.out.println(driver.getTitle());
        //WebElement confirm_text = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/h2/div[2]"));
        //System.out.println(confirm_text.getText());


    }

    @And("^Close the login Browser$")
    public void closeTheBrowser() throws Throwable {
        driver.quit();
    }

}


