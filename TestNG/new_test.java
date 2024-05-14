
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class new_test {


    @BeforeClass
    public void one(){
        System.out.println("Before Class Executed!");
    }

    @BeforeMethod
    public void two(){
        System.out.println("Before Method Executed!");
    }

    @BeforeTest
    public void three(){
        System.out.println("Before Test Executed!");
    }

    @BeforeSuite
    public void four(){
        System.out.println("Before Suite Executed!");
    }

    @BeforeGroups
    public void five(){
        System.out.println("Before Groups Executed!");
    }

    @Test
    public void test_1(){
        System.out.println("Test 1");
    }

    @Test (groups = {"group1"})
    public void test_2(){
        System.out.println("Test 2");
    }
}
