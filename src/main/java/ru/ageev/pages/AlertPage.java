package ru.ageev.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    By clickBtn1 = By.id("alertButton");
    By clickBtn2 = By.id("timerAlertButton");
    By clickBtn3 = By.id("confirmButton");
    By clickBtn4 = By.id("promtButton");
    By resp1 = By.id("confirmResult");
    By resp2 = By.id("promptResult");

    public void clickAlertbtns() {

        driver.findElement(clickBtn1).click();
        driver.switchTo().alert().accept();
        driver.findElement(clickBtn2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(clickBtn3).click();
        driver.switchTo().alert().accept();
        Assertions.assertEquals(driver.findElement(resp1).getText(), "You selected Ok");
        driver.findElement(clickBtn4).click();
        driver.switchTo().alert().sendKeys("Test name");
        driver.switchTo().alert().accept();
        Assertions.assertEquals(driver.findElement(resp2).getText(), "You entered Test name");

    }
}
