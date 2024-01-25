package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(css = ".price-container")
    public WebElement priceContainer;


    public void verifyWelcomeMessage() {
        BrowserUtils.waitForClickablility(nameOfUser, 5);
        String actual = nameOfUser.getText();
        Assert.assertTrue(actual.contains(ConfigurationReader.get("username")));
    }

    public void verifyWelcomeMessage(String username) {
        BrowserUtils.waitForClickablility(nameOfUser, 5);
        String actual = nameOfUser.getText();
        Assert.assertTrue(actual.contains(username));
    }

    public void addProductFromCategory(String product, String category) {
        String categoryXpath = "//a[.='" + category + "']";
        WebElement categoryModule = Driver.get().findElement(By.xpath(categoryXpath));
        BrowserUtils.clickWithJS(categoryModule);
        BrowserUtils.waitFor(1);
        String productXpath = "//a[.='" + product + "']";
        WebElement productItem = Driver.get().findElement(By.xpath(productXpath));
        BrowserUtils.scrollToElement(productItem);
        BrowserUtils.clickWithJS(productItem);
        BrowserUtils.waitFor(1);
        sum+=getUnitPrice(product);
        BrowserUtils.clickWithJS(addToCartButton);
        BrowserUtils.waitFor(2);
        alert = Driver.get().switchTo().alert();
        alert.accept();
        BrowserUtils.waitFor(1);
        Driver.get().navigate().back();
        Driver.get().navigate().back();

    }
    public int getUnitPrice(String product) {
        BrowserUtils.waitForVisibility(priceContainer, 5);
        String price = priceContainer.getText();
        price = price.substring(1, price.indexOf("*"));
        return Integer.parseInt(price.trim());
    }
}
