package ru.ageev.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoqaPage extends BasePage {
    public DemoqaPage(WebDriver driver) {
        super(driver);
    }

    private By elementBy = By.xpath("//div[@class = 'card mt-4 top-card'][.//h5[text() = 'Elements']]");


    @Step("Нажать на Elements")
    public ElementsPage clickOnElements() {
        open("https://demoqa.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitElementIsVisible(elementBy).click();
        return new ElementsPage(driver);
    }
}
