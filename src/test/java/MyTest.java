
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.ageev.pages.DemoqaPage;



@ExtendWith(MyTestWatcher.class)
public class MyTest extends BaseTest{

    @Test
    @Feature("UITest")
    @Owner("Ageev")
    @Tag("All")
    @DisplayName("ITFBTest")
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
