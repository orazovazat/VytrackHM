package com.vytrackHM.pages.login_navigation;

import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameElement;

    @FindBy(id = "prependedInput2")
    public WebElement passwordElement;

    @FindBy(id = "prependedInput")
    public WebElement dashboardElement;

    public void login(String username , String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);
    }

    public void login(){
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);

    }

}
