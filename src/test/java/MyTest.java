
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.ageev.pages.DemoqaPage;

public class MyTest extends TestConf{

    @Test
    @Feature("UITest")
    @Owner("Ageev")
    @Tag("All")
    @DisplayName("UIтест")
    public void demoqaTest(){
        DemoqaPage demoqaPage = new DemoqaPage(driver);
        demoqaPage
                .clickOnElements()
                .clickOnTextBox()
                .submitData()
                .clickOnBtns()
                .clickNewTab()
                .clickNewWindow()
                .clickAlertbtns();
    }



}
