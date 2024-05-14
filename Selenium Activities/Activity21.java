import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println("Home page title:" + driver.getTitle());

        // Find the button to open a new tab and click it
        WebElement newTabButton = driver.findElement(By.xpath("//*[@id=\"launcher\"]"));
        newTabButton.click();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Print all window handles
        System.out.println("All Window Handles: " + allWindowHandles);

        // Switch to the new tab
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Print title and heading of the new tab
        System.out.println("Title of the new tab: " + driver.getTitle());
        WebElement heading = driver.findElement(By.cssSelector("div.content:nth-child(2)"));
        System.out.println("Heading of the new tab: " + heading.getText());

        // Find the button to open a new tab and click it
        WebElement TabButton = driver.findElement(By.xpath("//*[@id=\"actionButton\"]"));
        TabButton.click();



        // Close the new tab
        driver.close();

        // Switch back to the main tab
        driver.switchTo().window((String) allWindowHandles.toArray()[0]);

        // Close the browser
        driver.quit();
    }
}
