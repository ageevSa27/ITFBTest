package ru.ageev.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TextBoxPage {
    Map<String, String> data = new HashMap<>();
    Map<String, String> respData = new HashMap<>();

    WebDriver driver;
    public TextBoxPage(WebDriver driver) {
       this.driver = driver;
       data.put("Name","Vlad");
       data.put("Email","Vlad@mail.ru");
       data.put("CurrentAddress","Russian");
       data.put("PermanentAddress","Moscow");
    }
    By nameField = By.xpath("//input[@id = 'userName']");
    By emailField = By.xpath("//input[@id = 'userEmail']");
    By currentAddressField = By.xpath("//textarea[@id = 'currentAddress']");
    By permanentAddressField = By.xpath("//textarea[@id = 'permanentAddress']");
    By btnSubmit = By.cssSelector("div.text-right");
    By respName = By.id("name");
    By respEmail = By.id("email");
    By respCurAdd = By.xpath("//p[@id ='currentAddress']");
    By respPermAdd = By.xpath("//p[@id ='permanentAddress']");
    By buttonBox = By.xpath("//span[text() = 'Buttons']");


    public ButtonPage submitData(){
        driver.findElement(nameField).sendKeys(data.get("Name"));
        driver.findElement(emailField).sendKeys(data.get("Email"));
        driver.findElement(currentAddressField).sendKeys(data.get("CurrentAddress"));
        driver.findElement(permanentAddressField).sendKeys(data.get("PermanentAddress"));
        driver.findElement(btnSubmit).click();
        driver.findElement(respName).getText();

        respData.put("Name",driver.findElement(respName).getText().split(":")[1]);
        respData.put("Email",driver.findElement(respEmail).getText().split(":")[1]);
        respData.put("CurrentAddress",driver.findElement(respCurAdd).getText().split(":")[1]);
        respData.put("PermanentAddress",driver.findElement(respPermAdd).getText().split(":")[1]);


        Assertions.assertEquals(data, respData);
        driver.findElement(buttonBox).click();
        return new ButtonPage(driver);
    }




}
