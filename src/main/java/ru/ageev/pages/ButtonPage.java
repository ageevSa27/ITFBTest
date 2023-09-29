package ru.ageev.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage extends BasePage {

    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    By clicMeBy = By.xpath("//button[text() = 'Click Me']");
    By rightClickMeBy = By.id("rightClickBtn");
    By doubleClickMeBy = By.id("doubleClickBtn");
    By respClickMeBy = By.id("dynamicClickMessage");
    By respDoubleClickMeBy = By.id("doubleClickMessage");
    By respRightClickMeBy = By.id("rightClickMessage");
    By alertBtn = By.xpath("//div[text() = 'Alerts, Frame & Windows']");
    By browserWindowBtn = By.xpath("//li[.//span[text() = 'Browser Windows']]");

    @Step("Нажать на кнопку «Click me», «Right Click me», «Double Click me»")
    public BrowserWindowsPage clickOnBtns() {

        driver.findElement(clicMeBy).click();
        Assertions.assertEquals(driver.findElement(respClickMeBy).getText(), "You have done a dynamic click");

        new Actions(driver)
                .contextClick(driver.findElement(rightClickMeBy))
                .perform();

        Assertions.assertEquals(driver.findElement(respRightClickMeBy).getText(), "You have done a right click");

        new Actions(driver)
                .doubleClick(driver.findElement(doubleClickMeBy))
                .perform();
        Assertions.assertEquals(driver.findElement(respDoubleClickMeBy).getText(), "You have done a double click");

        new Actions(driver)
                .scrollToElement(driver.findElement(By.xpath("//div[text() = 'Interactions']")))
                .perform();
        driver.findElement(alertBtn).click();
        driver.findElement(browserWindowBtn).click();
        return new BrowserWindowsPage(driver);
    }
}
