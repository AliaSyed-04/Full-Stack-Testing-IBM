
import org.testng.annotations.*;

public class beforeMetods {

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
}
