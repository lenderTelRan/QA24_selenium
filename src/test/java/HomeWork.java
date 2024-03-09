import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
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
        WebElement home2 = wd.findElement(By.cssSelector("a"));
        WebElement home3 = wd.findElement(By.xpath("//a"));

        WebElement about = wd.findElement(By.cssSelector("a[href='/about']"));
        WebElement about2 = wd.findElement(By.xpath("//a[text()='ABOUT']"));

        WebElement login = wd.findElement(By.className("active"));
        WebElement login2 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement inputEmail = wd.findElement(By.cssSelector("[name='email']"));
        WebElement inputEmail2 = wd.findElement(By.xpath("//input[@name='email']"));
        WebElement inputEmail3 = wd.findElement(By.xpath("//*[contains(@placeholder, 'Email')]"));

        WebElement inpEmail = wd.findElement(By.cssSelector("[placeholder ^='E']"));
        WebElement inpEmail2 = wd.findElement(By.cssSelector("[placeholder $='ail']"));
        WebElement inpEmail3 = wd.findElement(By.cssSelector("[placeholder *='mai']"));

        WebElement inputPass = wd.findElement(By.cssSelector("[name='password']"));
        WebElement inputPass2 = wd.findElement(By.xpath("//input[@name='password']"));
        WebElement inputPass3 = wd.findElement(By.xpath("//*[starts-with(@name, 'pass')]"));

        WebElement buttonLogin = wd.findElement(By.cssSelector("[name ^='regis']"));
        WebElement buttonLogin2 = wd.findElement(By.xpath("//button[@type='submit' and @name='login']"));

        WebElement buttonReg = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement buttonReg2 = wd.findElement(By.xpath("//button[text()='Registration']"));

    }

    @AfterClass
    public void close() {
        wd.close();
    }
}
