import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is: "+pageTitle);

        //Find the text field
        WebElement txtField = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));

        //Check if the text field is enabled and print it
        if (txtField.isEnabled()) System.out.println("Enabled");
        else System.out.println("Not Enabled");

        //Click the "Enable input" button to enable the input field
        WebElement buttonField = driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
        buttonField.click();

        //Check if the text field is enabled again
        if (buttonField.isEnabled()) System.out.println("Enabled");
        else System.out.println("Not Enabled");

        driver.close();


    }
}
