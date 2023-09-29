package ru.ageev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoqaPage {
    protected WebDriver driver;

    private By elementBy = By.xpath("//div[@class = 'card mt-4 top-card'][.//h5[text() = 'Elements']]");

    public DemoqaPage(WebDriver driver) {
        this.driver = driver;
    }

    public ElementsPage clickOnElements(){
        driver.findElement(elementBy).click();

        return new ElementsPage(driver);
    }
}
