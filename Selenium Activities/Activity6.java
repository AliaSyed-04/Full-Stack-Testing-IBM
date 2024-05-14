import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import java.lang.String;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;



class Activity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        //printing the pageTitle
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Get the WebElement where you want to type the name
        // For example, let's assume there's an input field with id "name"
        WebElement nameInput = driver.findElement(By.id("userName"));

        // Type the name with the first letter in caps
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = name.nextLine();

        nameInput.sendKeys(userName.substring(0, 1).toUpperCase() + userName.substring(1));

        // Perform Ctrl+A to select all text
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // Perform Ctrl+C to copy the selected text
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
    }
}
