import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is: "+pageTitle);

        //Find check box input element

//        WebElement checkBox = driver.findElement(By.id("dynamicCheckbox"));

        //check if the checkbox is selected and print the result.

        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        if (checkBox.isSelected()) {
            System.out.println("Checkbox is selected");
        }
        else{
            System.out.println("Checkbox is not selected.");
        }

        //Click the checkbox to select it
        checkBox.click();
        if (checkBox.isSelected()) {
            System.out.println("Checkbox is selected");
        }
        else{
            System.out.println("Checkbox is not selected.");
        }
        driver.close();



    }
}
