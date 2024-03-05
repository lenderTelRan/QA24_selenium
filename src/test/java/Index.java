import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Active/Downloads/21.index.html");
    }

    @Test
    public void cssLocators() {
        WebElement buttonSend = wd.findElement(By.tagName("button"));
        WebElement button = wd.findElement(By.cssSelector("button"));

        WebElement item1 = wd.findElement(By.tagName("a"));
        List<WebElement> itemList = wd.findElements(By.cssSelector("a"));
        //int i = itemList.size();

        WebElement el = wd.findElement(By.className("container"));
        WebElement el2 = wd.findElement(By.cssSelector(".container")); // find by class
        // cssSelector: find class ".class", find id "#id"

        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));

        wd.close();
    }
}
