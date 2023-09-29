package ru.ageev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserWindowsPage {

    WebDriver driver;

    public BrowserWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    By newTabBtn = By.id("tabButton");
    By newWindowBtn = By.id("windowButton");
    By alertBtn = By.xpath("//span[text() = 'Alerts']");

    public BrowserWindowsPage clickNewTab() {
        String window1 = driver.getWindowHandle();
        driver.findElement(newTabBtn).click();
        Set<String> currnetWindows = driver.getWindowHandles();
        String window2 = null;

        for (String windows : currnetWindows) {
            if (!windows.equals(window1)) {
                window2 = windows;
                break;
            }
        }
        driver.switchTo().window(window2);
        driver.close();
        driver.switchTo().window(window1);
        return this;
    }
    public AlertPage clickNewWindow(){
        String window1 = driver.getWindowHandle();
        driver.findElement(newWindowBtn).click();
        Set<String> currnetWindows = driver.getWindowHandles();
        String window2 = null;

        for (String windows : currnetWindows) {
            if (!windows.equals(window1)) {
                window2 = windows;
                break;
            }
        }
        driver.switchTo().window(window2);
        driver.close();
        driver.switchTo().window(window1);
        driver.findElement(alertBtn).click();
        return new AlertPage(driver);
    }

}
