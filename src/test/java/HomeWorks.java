import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){

        //by tag name - the search is not unique
        WebElement el = wd.findElement(By.tagName("body"));
        WebElement element = wd.findElement(By.cssSelector("body"));

        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement element1 = wd.findElement(By.cssSelector("div"));

        WebElement el2 = wd.findElement(By.tagName("h1"));
        WebElement element2 = wd.findElement(By.cssSelector("h1"));

        WebElement el3 = wd.findElement(By.tagName("a"));
        WebElement element3 = wd.findElement(By.cssSelector("a"));

        WebElement el4 = wd.findElement(By.tagName("form"));
        WebElement element4 = wd.findElement(By.cssSelector("form"));

        WebElement el5 = wd.findElement(By.tagName("input"));
        WebElement element5 = wd.findElement(By.cssSelector("input"));

        WebElement el6 = wd.findElement(By.tagName("button"));
        WebElement element6 = wd.findElement(By.cssSelector("button"));

        //by class. Classes added by developer
        WebElement el7 = wd.findElement(By.className("container"));
        WebElement element7 = wd.findElement(By.cssSelector(".container")); //the dor means class

        WebElement el8 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element8 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el9 = wd.findElement(By.className("active"));
        WebElement element9 = wd.findElement(By.cssSelector(".active"));

        WebElement el10 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement element10 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by ID - unique, set by developer but not all elements have id
        WebElement el11 = wd.findElement(By.id("root"));
        WebElement element11 = wd.findElement(By.cssSelector("#root")); //#means id

        //by attribute in [], css selector only except name
        WebElement element12 = wd.findElement(By.cssSelector("[id ='root']"));
        WebElement element13 = wd.findElement(By.cssSelector("[href ='/home']"));
        WebElement element14 = wd.findElement(By.cssSelector("[href ='/about']"));
        WebElement element15 = wd.findElement(By.cssSelector("[name ='email']"));
        WebElement element16 = wd.findElement(By.cssSelector("[name ='password']"));
        WebElement element17 = wd.findElement(By.cssSelector("password"));
    }
}
