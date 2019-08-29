package com.vytrackHM.pages.login_navigation;

import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameElement;

    @FindBy(id = "prependedInput2")
    public WebElement passwordElement;

    @FindBy(id = "_submit")
    public WebElement loginButtonElement;

    @FindBy(xpath = "//div[text()='Invalid user name or password.']")
    public WebElement invalidMessageElement;

    @FindBy(xpath = "//h2")
    public WebElement loginPageNameElement;


    public void login(String username , String password){
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);
    }

    public void loginAs(String role){
        String username = "";
        String password = "";
        if(role.equalsIgnoreCase("driver")){
             username = ConfigurationReader.getProperty("driverusername");
             password = ConfigurationReader.getProperty("driverpassword");
        }else if(role.equalsIgnoreCase("store manager")) {
             username = ConfigurationReader.getProperty("storemanagerusername");
             password = ConfigurationReader.getProperty("storemanagerpassword");
        }else if(role.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("salesmanagerusername");
            password = ConfigurationReader.getProperty("salesmanagerpassword");
        }
            usernameElement.sendKeys(username);
            passwordElement.sendKeys(password, Keys.ENTER);
    }

}
