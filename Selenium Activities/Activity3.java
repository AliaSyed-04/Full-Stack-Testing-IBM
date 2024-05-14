import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");

        // Perform testing and assertions
        String title = driver.getTitle(); // Get the title of the webpage

        // Print the title to the console
        System.out.println("Title of the webpage: " + title);
        //finding 3rd header
        WebElement header3 = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        //print the header3
        System.out.println("third header is" + header3.getText() );
        //finding 5th header
        WebElement header5 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        //finding the color of the 5th header
        String color = header5.getCssValue("color");

        // Print the color value
        System.out.println("Color of the text: " + color);

        //find violet button
        WebElement buttonviolet = driver.findElement(By.cssSelector(".violet"));
        // Get the value of the 'class' attribute
        String ss=buttonviolet.getAttribute("class");
        // Print the classes
        System.out.println("Classes of the button: " + ss);

        //find the grey button
        WebElement buttongrey = driver.findElement(By.cssSelector(".ui.grey.button"));

        //getting the text
        String buttonText = buttongrey.getText();

        //printing the text
        System.out.println("The Text of the button:" + buttonText);


        driver.quit();



    }
}
