import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver wd;

    @BeforeClass
    public void preCondition(){
        wd = new ChromeDriver();
        //open browser
        wd.get("https://telranedu.web.app/home");
        //open web site
    }

    @Test
    public void loginSuccess(){
        //open form (find element+click)
        //fill email (find element+click+clear+type)
        //fill password (find element+click+clear+type)
        //submit (find element+click)
    }

    @Test
    public void loginWrongEmail(){
        //open form
        //fill form
        //submit
    }

    @Test
    public void loginWrongPassword(){
        //open form
        //fill form
        //submit
    }

    @AfterClass
    public void postConditions(){
        //close browser
        wd.close();
    }
}
