package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    HomePage homePage = new HomePage();

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(id = "totalp")
    public WebElement totalAmount;

    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "country")
    public WebElement countryField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "card")
    public WebElement cardField;

    @FindBy(id = "month")
    public WebElement monthField;

    @FindBy(id = "year")
    public WebElement yearField;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    public WebElement confirmationMessage;

    @FindBy(css = ".lead")
    public WebElement confirmationMessage2;

    public void fillForm() {
        BrowserUtils.waitForVisibility(nameField, 5);
        nameField.sendKeys(ConfigurationReader.get("name"));
        countryField.sendKeys(ConfigurationReader.get("country"));
        cityField.sendKeys(ConfigurationReader.get("city"));
        cardField.sendKeys(ConfigurationReader.get("card"));
        monthField.sendKeys(ConfigurationReader.get("month"));
        yearField.sendKeys(ConfigurationReader.get("year"));
    }

    public void verifyConfirmationMessage() {
        BrowserUtils.waitForVisibility(confirmationMessage, 5);
        String actual = confirmationMessage.getText();
        String expected = "Thank you for your purchase!";
        Assert.assertEquals(expected, actual);
    }

    public void removeProductFromCart(String product) {
        BrowserUtils.clickWithJS(cartButton);
        String productDeletexpath = "//td[.='" + product + "']/../td[.='Delete']/a";
        WebElement element = Driver.get().findElement(By.xpath(productDeletexpath));
        BrowserUtils.waitForClickablility(element, 5);
        String productAmountXPath = "//td[.='" + product + "']/../td[.='Delete']/a/../../td[3]";
        WebElement productAmountElement = Driver.get().findElement(By.xpath(productAmountXPath));
        HomePage.sum-=Integer.parseInt(productAmountElement.getText());
        BrowserUtils.clickWithJS(element);
        Assert.assertEquals(ConfigurationReader.get("totalAmount"), String.valueOf(HomePage.sum));
        BrowserUtils.waitFor(1);

    }

    public void placeOrder() {
        BrowserUtils.waitForClickablility(placeOrderButton, 5);
        placeOrderButton.click();
        fillForm();
        BrowserUtils.waitForClickablility(purchaseButton, 5);
        purchaseButton.click();
        BrowserUtils.waitFor(1);
        verifyConfirmationMessage();
    }

    public void verifyPurchaseAmount() {
        String text = confirmationMessage2.getText();
        String amount =String.valueOf(HomePage.sum);
        Assert.assertTrue(text.contains("Amount: "+amount+" USD"));
        BrowserUtils.waitFor(1);

    }





}
