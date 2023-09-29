import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.ageev.pages.*;

public class BaseTest {


    protected WebDriver driver = new ChromeDriver();
    protected AlertPage alertPage = new AlertPage(driver);
    protected BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(driver);
    protected ButtonPage buttonPage = new ButtonPage(driver);
    protected DemoqaPage demoqaPage = new DemoqaPage(driver);
    protected ElementsPage elementsPage = new ElementsPage(driver);
    protected TextBoxPage textBoxPage = new TextBoxPage(driver);
}
