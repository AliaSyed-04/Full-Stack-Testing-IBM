import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;

class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        WebElement element = driver.findElement(By.id("about-link"));
        element.click();
        String currentPage = driver.getTitle();
        System.out.println("Page title is: " + currentPage);
        driver.quit();

    }
}
