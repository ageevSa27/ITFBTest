package ru.ageev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    protected WebDriver driver;

    By textBox = By.xpath("//span[text() = 'Text Box']");
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }
    public TextBoxPage clickOnTextBox(){
        driver.findElement(textBox).click();
        return new TextBoxPage(driver);
    }

}
