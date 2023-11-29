import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd; //variable

    @Test
    public void test(){
        wd = new ChromeDriver();
        // wd.get("https://telranedu.web.app/home"); //without transition history
        wd.navigate().to("https://telranedu.web.app/home"); //remember transition history

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close();//only one tab if one & closes browser
        wd.quit();//closes all tabs & browser
    }
}
