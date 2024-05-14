import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        //printing the pageTitle
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        Actions action = new Actions(driver);

        //Find the ball, destination1 and destination2
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

//drag and drop
        action.dragAndDrop(ball, drop1).build().perform();
        action.dragAndDrop(ball, drop2).build().perform();

//verify drop1
        WebElement dropverify1 = driver.findElement(By.id("droppable"));
        System.out.println(dropverify1.getText());

//verify drop2
        WebElement dropverify2 = driver.findElement(By.id("dropzone2"));
        System.out.println(dropverify2.getText());

    }
}
