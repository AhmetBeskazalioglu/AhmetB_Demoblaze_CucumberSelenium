package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "loginusername")
    public WebElement username;
    @FindBy(id = "loginpassword")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton2;

    public void login(){
        loginButton.click();
        this.username.sendKeys(ConfigurationReader.get("username"));
        this.password.sendKeys(ConfigurationReader.get("password"));
        loginButton2.click();
    }
    public void login(String username, String password){
        loginButton.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton2.click();
    }
    public void verifyErrorMessage(String errorMessage){
        Alert alert= Driver.get().switchTo().alert();
        String actual = alert.getText();
        String expected = errorMessage;
        Assert.assertEquals(expected, actual);
    }



}
