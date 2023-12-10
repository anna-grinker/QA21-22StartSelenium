import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
       // wd.get("file:///F:/D/%D0%A3%D0%BD%D0%B8%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D1%82%D0%B5%D1%82%20-%20%D0%98%D0%B7%D1%80%D0%B0%D0%B8%D0%BB%D1%8C/Tel%20Ran/06%20Automation/02%20HTML,%20CSS/21.index.html");
        wd.get("file:///C:/Users/Anna/Downloads/21.index.html");
    }
    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        WebElement canada1 = wd.findElement(By.xpath("//td[text()='Canada']"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement e1 = wd.findElement(By.tagName("button"));//selenium library
        WebElement element = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        WebElement el3 = list.get(2);

        //by class
        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));//!!! dot because it is a class

        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));//!!! # because it is an ID

        //by attributes such as [href], [name] etc.
        //[href='#item'] - the value of attribute in Selenium devTool.
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='#item2']"));

        WebElement input1 = wd.findElement(By.cssSelector("[name='name']"));
        WebElement inputS = wd.findElement(By.name("name"));

        //By.linkText By.partial - old and not recommended
        WebElement el18 = wd.findElement(By.linkText("Item 1"));
        WebElement el19 = wd.findElement(By.partialLinkText("m 1"));

        WebElement inp = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));//complete coincidence
        //start
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));//particular coincidence
        //end
        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder$='name']"));//particular coincidence
        //contains
        WebElement inp3 = wd.findElement(By.cssSelector("[placeholder*='name']"));


    }

}
