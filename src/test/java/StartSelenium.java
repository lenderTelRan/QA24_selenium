import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @Test
    public void test() {
        wd = new ChromeDriver();
//        wd.get("https://telranedu.web.app/home");  // не запоминает историю переходов по сайту
        wd.navigate().to("https://telranedu.web.app/home"); // запоминает историю переходов по сайту
//        wd.close(); // закроет вкладку
//        wd.quit(); // закроет браузер
    }
}
