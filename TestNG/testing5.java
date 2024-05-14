import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class testing5 {
    WebDriver driver;

    @BeforeTest(groups = {"BeforeTests"})
    public void BeforeTest() {
        System.out.println(" This method is BeforeTest ");
    }

    @BeforeClass(groups = {"BeforeTests"})
    public void BeforeClass() {
        System.out.println(" This method is BeforeClass");

    }

    @BeforeMethod(groups = {"BeforeTests"})
    public void BeforeMethod() {
        System.out.println(" This method is BeforeMethod");

    }

    @BeforeSuite(groups = {"BeforeTests"})
    public void BeforeSuite() {
        System.out.println("This method is BeforeSuite");

    }

    @Test
    public void test1() {

        System.out.println(" This method is Test ");

    }

    @AfterSuite(groups = {"AfterTests"})
    public void AfterSuite() {
        System.out.println(" This method is AfterSuite");

    }

    @AfterClass(groups = {"AfterTests"})
    public void AfterClass() {
        System.out.println(" This method is AfterClass");

    }

    @AfterMethod(groups = {"AfterTests"})
    public void AfterMethod() {
        System.out.println(" This method is AfterMethod");

    }

    @AfterTest(groups = {"AfterTests"})
    public void AfterTest() {
        System.out.println(" This method is AfterTest");

    }

}