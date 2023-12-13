import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {

        //by tag name - the search is not unique
        WebElement el = wd.findElement(By.tagName("body"));
        WebElement element = wd.findElement(By.cssSelector("body"));
        WebElement xElement = wd.findElement(By.xpath("//body"));

        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement element1 = wd.findElement(By.cssSelector("div"));
        WebElement xElement1 = wd.findElement(By.xpath("//div"));

        WebElement el2 = wd.findElement(By.tagName("h1"));
        WebElement element2 = wd.findElement(By.cssSelector("h1"));
        WebElement xElement2 = wd.findElement(By.xpath("//h1"));

        WebElement el3 = wd.findElement(By.tagName("a"));
        WebElement element3 = wd.findElement(By.cssSelector("a"));
        WebElement xElement3 = wd.findElement(By.xpath("//a"));

        WebElement el4 = wd.findElement(By.tagName("form"));
        WebElement element4 = wd.findElement(By.cssSelector("form"));
        WebElement xElement4 = wd.findElement(By.xpath("//form"));

        WebElement el5 = wd.findElement(By.tagName("input"));
        WebElement element5 = wd.findElement(By.cssSelector("input"));
        WebElement xElement5 = wd.findElement(By.xpath("//input"));

        WebElement el6 = wd.findElement(By.tagName("button"));
        WebElement element6 = wd.findElement(By.cssSelector("button"));
        WebElement xEl = wd.findElement(By.xpath("//button"));
        //WebElement xEl1 = wd.findElement(By.xpath("/html/body/div/div/div/form/button")); - hard html structure

        //by class. Classes added by developer
        WebElement el7 = wd.findElement(By.className("container"));
        WebElement element7 = wd.findElement(By.cssSelector(".container")); //the dot means class
        WebElement xElement7 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el8 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element8 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xElement8 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el9 = wd.findElement(By.className("active"));
        WebElement element9 = wd.findElement(By.cssSelector(".active"));
        WebElement xElement9 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement el10 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement element10 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xElement10 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by ID - unique, set by developer but not all elements have id
        WebElement el11 = wd.findElement(By.id("root"));
        WebElement element11 = wd.findElement(By.cssSelector("#root")); //#means id
        WebElement xElement11 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute in [], css selector only except name
        WebElement el12 = wd.findElement(By.cssSelector("[id ='root']"));
       //??? WebElement xElement12 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement el13 = wd.findElement(By.cssSelector("[href ='/home']"));
        WebElement el14 = wd.findElement(By.cssSelector("[href ='/about']"));
        WebElement xElement14 = wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement el15 = wd.findElement(By.cssSelector("[name ='email']"));
        WebElement el16 = wd.findElement(By.cssSelector("[name ='password']"));
        WebElement el17 = wd.findElement(By.name("password"));
        WebElement xElement17 = wd.findElement(By.xpath("//*[@name='email']")); //two slash or full path(directory)

        //one of elements find by attributes ==> start& end contains value
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement xEl18 = wd.findElement(By.xpath("//input [@placeholder='Email']"));

        WebElement el19 = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement xEl19 = wd.findElement(By.xpath("//input [starts-with(@placeholder, 'Em')]"));

        //contains
        WebElement el20 = wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement xEl20 = wd.findElement(By.xpath("//input [contains(@placeholder, 'il')]"));

        WebElement el21 = wd.findElement(By.cssSelector("[placeholder *= 'ma']"));
        WebElement xEl21 = wd.findElement(By.xpath("//input [contains(@placeholder, 'ma')]"));

        WebElement xEl22 = wd.findElement(By.xpath("//a[3]"));
    }

    @Test
    public void classwork(){
        //parent
        //WebElement el = wd.findElement(By.xpath("//div/div//input/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el3 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::*")); //all ancestors
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div")); //two options
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor::div[2]")); //numeration in Selectors Hub is unfair
        //the numeration goes from child up.

        //ancestor-or-self
        WebElement el7 = wd.findElement(By.xpath("//h1/ancestor-or-self::*")); //plus one more (all parents and the  child)
        List <WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a")); //search from up to down

        //preceding-sibling
        WebElement el8 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[@href='login']/preceding-sibling::a"));

    }

    @AfterClass
    public void close(){
        wd.close();
    }
}
