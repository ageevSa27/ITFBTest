package ru.ageev.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    By textBox = By.xpath("//span[text() = 'Text Box']");

    @Step("Нажать на «Text box»")
    public TextBoxPage clickOnTextBox() {
        waitElementIsVisible(textBox).click();
        return new TextBoxPage(driver);
    }

}
