import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

class Activity10 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        String pageTitle = driver.getTitle();
        System.out.println("Page Title is: "+pageTitle);

        //Find check box input element

        WebElement checkBox = driver.findElement(By.id("dynamicCheckbox"));

        //check if it is visible on the page
        if (checkBox.isDisplayed()) System.out.println("Visible");

        //Click the "Remove Checkbox" button
        WebElement rmCheck = driver.findElement(By.id("toggleCheckbox"));
        rmCheck.click();

        //check if it is visible again
        if (!checkBox.isDisplayed()) System.out.println(checkBox.isDisplayed());


    }
}
