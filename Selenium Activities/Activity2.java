import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;

class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        element1.sendKeys("admin");
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        element2.sendKeys("password");
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        element3.click();


    }
}

