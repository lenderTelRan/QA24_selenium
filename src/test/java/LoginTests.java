import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    @BeforeClass
    public void preCondition() {
        // open browser
        // open site
    }

    @Test
    public void loginSuccess() {
        // open form
        // fill email
        // fill password
        // submit
    }

    @Test
    public void loginWrongEmail() {

    }

    @Test
    public void loginWrongPassword() {

    }

    @AfterClass
    public void postCondition() {
        // close browser
    }
}
