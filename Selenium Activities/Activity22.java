import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Set the duration for WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the website
        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println("Home page title: " + driver.getTitle());

        // Find the sign in button and hover over it
        WebElement signInButton = driver.findElement(By.cssSelector(".inverted"));
        Actions action = new Actions(driver);
        action.moveToElement(signInButton).perform();

        // Print the tooltip message
        WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#sign-in-tooltip")));
        String tooltipMessage = tooltip.getText();
        System.out.println("Tooltip message: " + tooltipMessage);

        // Click the button to open the sign in form
        signInButton.click();

        // Enter the credentials: username: admin and password: password
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        usernameField.sendKeys("admin");
        passwordField.sendKeys("password");

        // Click login
        loginButton.click();

        // Print the message on the page after logging in
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#action-confirmation")));
        String loginMessage = message.getText();
        System.out.println("Login message: " + loginMessage);

        // Close the browser
        driver.quit();
    }
}