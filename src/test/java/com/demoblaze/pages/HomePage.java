package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import org.junit.Assert;

public class HomePage extends BasePage{

    public void verifyWelcomeMessage(){
        BrowserUtils.waitForClickablility(nameOfUser, 5);
        String actual = nameOfUser.getText();
        Assert.assertTrue(actual.contains(ConfigurationReader.get("username")));
    }
    public void verifyWelcomeMessage(String username){
        BrowserUtils.waitForClickablility(nameOfUser, 5);
        String actual = nameOfUser.getText();
        Assert.assertTrue(actual.contains(username));
    }
}
