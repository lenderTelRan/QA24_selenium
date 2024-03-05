import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {

        WebElement home = wd.findElement(By.tagName("a"));
        WebElement about = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement login = wd.findElement(By.className("active"));

        WebElement inputEmail = wd.findElement(By.cssSelector("[name='email']"));
        WebElement inpEmail = wd.findElement(By.cssSelector("[placeholder ^='E']"));
        WebElement inpEmail2 = wd.findElement(By.cssSelector("[placeholder $='ail']"));
        WebElement inpEmail3 = wd.findElement(By.cssSelector("[placeholder *='mai']"));

        WebElement inputPass = wd.findElement(By.cssSelector("[name='password']"));

        WebElement buttonLogin = wd.findElement(By.cssSelector("[name ^='regis']"));

        wd.close();;
    }
}
