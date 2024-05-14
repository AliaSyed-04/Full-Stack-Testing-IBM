import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;

class Activity4{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        //printing the pageTitle
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        //printing the third header content
        String headerXpath = "//*[@id=\"third-header\"]" ;
        String headerText = driver.findElement(By.xpath(headerXpath)).getText();
        System.out.println("Header Text is: "+ headerText);
        //printing the fifth header color
        WebElement coLor = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String cssValue = coLor.getCssValue("color");
        System.out.println("Color is: "+cssValue);
        //find violet button and print it's classes
        WebElement getClass = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
        String attribute = getClass.getAttribute("ui violet button");
        System.out.println("Classes of this button are: "+attribute);
        //find grey button and print it's text
        WebElement Text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        String text = Text.getText();
        System.out.println("The text is: "+text);
    }
}
