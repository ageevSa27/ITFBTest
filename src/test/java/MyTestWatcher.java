import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MyTestWatcher implements TestWatcher {
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        byte[] screenshotBytes = ((TakesScreenshot) BaseTest.getDriver()).getScreenshotAs(OutputType.BYTES);

        InputStream screenshootStream = new ByteArrayInputStream(screenshotBytes);
        Allure.addAttachment("screenshot", screenshootStream);
        TestWatcher.super.testFailed(context, cause);
    }
}
