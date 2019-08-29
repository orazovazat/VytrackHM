package com.vytrackHM.tests.components.login_navigation;

import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.Driver;
import com.vytrackHM.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTestPositive() throws InterruptedException {
        extentLogger = report.createTest("Login test (positive)");
        pages.loginPage().loginAs("store manager");
        String storeManagerName = pages.mainPage().userNameElement.getText();
        if(pages.mainPage().userNameElement.isDisplayed()){
            System.out.println("Store manager name is displayed on top right");
            System.out.println("Store manager name is: " + pages.mainPage().userNameElement.getText());
        }else{
            System.out.println("Failed");
        }
        if(pages.mainPage().pageNameElement.getText().equals("Dashboard")){
            System.out.println("Verified that Dashboard page is opened");
        }else{
            System.out.println("Failed");
            System.out.println("The page name is: " + pages.mainPage().pageNameElement.getText());
        }
        Thread.sleep(5000);
        pages.mainPage().userNameElement.click();
        pages.mainPage().logoutElement.click();

        pages.loginPage().loginAs("sales manager");
        String salesManagerName = pages.mainPage().userNameElement.getText();
        if(pages.mainPage().pageNameElement.getText().equals("Dashboard")){
            System.out.println("Verified that Dashboard page is opened");
        }else{
            System.out.println("Failed");
            System.out.println("The page name is: " + pages.mainPage().pageNameElement.getText());
        }
        if(pages.mainPage().userNameElement.isDisplayed()){
            if (!pages.mainPage().userNameElement.equals(storeManagerName)){
            System.out.println("Sales manager name is displayed on top right");
            System.out.println("Sales manager name is: " + pages.mainPage().userNameElement.getText());
        }else{
            System.out.println("Failed");
        }
        }
        Thread.sleep(5000);
        pages.mainPage().userNameElement.click();
        pages.mainPage().logoutElement.click();

        pages.loginPage().loginAs("driver");
        if(pages.mainPage().pageNameElement.getText().equals("Quick Launchpad")){
            System.out.println("Verified that Quick Launchpad page is opened");
        }else{
            System.out.println("Failed");
            System.out.println("The page name is: " + pages.mainPage().pageNameElement.getText());
        }
        if(pages.mainPage().userNameElement.isDisplayed()){
            if (!pages.mainPage().userNameElement.equals(salesManagerName)){
                System.out.println("Driver name is displayed on top right");
                System.out.println("Driver name is: " + pages.mainPage().userNameElement.getText());
            }else{
                System.out.println("Failed");
            }
        }
    }

    @Test
    public void loginTestNegative() throws InterruptedException {
        extentLogger = report.createTest("Login test (negative)");
        pages.loginPage().login(ConfigurationReader.getProperty("salesmanagerusername"), "wrong");
        pages.loginPage().loginButtonElement.click();
        String expectedMesaage = "Invalid user name or password.";
        String actualMessage = pages.loginPage().invalidMessageElement.getText();
        Assert.assertEquals(actualMessage, expectedMesaage);
        String pageTitle = Driver.getDriver().getTitle();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        if(pageTitle.equals(actualUrl)){
            System.out.println("Passed");
            System.out.println("Verified that page title and url are same");
        }else{
            System.out.println("Failed");
            System.out.println("The page title and url are not same");
            System.out.println("Page title: " + pageTitle);
            System.out.println("Actual URL: " + actualUrl);
        }

    }

}
