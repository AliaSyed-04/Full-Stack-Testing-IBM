
import org.testng.annotations.DataProvider;

public class simpleFormDP {

    @DataProvider(name = "Simple Sign Up Form")
    public Object[][] credentials() {
        // Provide test data (firstname, lastname, email, contact)
        return new Object[][]{
                {"Alia", "Syed", "alia.syed@ibm.com", "11223344"},
                {"Feline","Chief","feline.chief@ibm.com", "12345678"},
                {"Moon","Pie","moon.pie@ibm.com", "98765432"},

        };

    }

}
