package com.vytrackHM.tests.smoke_tests;

import com.vytrackHM.utilities.BrowserUtils;
import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.TestBase;
import com.vytrackHM.utilities.VYtrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuOptionsTest extends TestBase {

    @Test
    public void menuOptionsDriverTest1() {
        pages.loginPage().loginAs("driver");
        extentLogger = report.createTest("Page title verified");
        VYtrackUtils.navigateToModule(driver, "Fleet", "Vehicles");
        String expectedFleetVehiclesTitle = "Car - Entities - System - Car - Entities - System";
        String actualFleetVehiclesTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedFleetVehiclesTitle, actualFleetVehiclesTitle);
        String expectedCarsPageName = "Cars";
        String actualCarsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedCarsPageName, expectedCarsPageName);
    }

    @Test
    public void menuOptionsDriverTest2() {
        pages.loginPage().loginAs("driver");
        extentLogger = report.createTest("Page title verified");
        VYtrackUtils.navigateToModule(driver, "Customers", "Accounts");
        String expectedCustomersAccountsTitle = "Accounts - Customers";
        String actualCustomersAccountsTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedCustomersAccountsTitle, actualCustomersAccountsTitle);
        String expectedAccountsPageName = "Accounts";
        String actualAccountsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedAccountsPageName, actualAccountsPageName);
    }
    @Test
    public void menuOptionsDriverTest3(){
        pages.loginPage().loginAs("driver");
        extentLogger = report.createTest("Page title verified");
        VYtrackUtils.navigateToModule(driver, "Customers" , "Contacts");
        String expectedContactsAccountsTitle = "Accounts - Customers";
        String actualContactsAccountsTitle = driver.getTitle();
        Assert.assertEquals(expectedContactsAccountsTitle, actualContactsAccountsTitle);
        String expectedContactsPageName = "Contacts";
        String actualContactsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedContactsPageName, actualContactsPageName);

    }

    @Test
    public void menuOptionsDriverTest4(){
        pages.loginPage().loginAs("driver");
        extentLogger = report.createTest("Page title verified");
        VYtrackUtils.navigateToModule(driver, "Activities" , "Calendar Events");
        String expectedActivitiesClndrEvntsTitle = "Calendar Events - Activities";
        String actualActivitiesClndrEvntsTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedActivitiesClndrEvntsTitle, actualActivitiesClndrEvntsTitle);
        String expectedCalendarEventsPageName = "Calendar Events";
        String actualCalendarEventsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedCalendarEventsPageName, actualCalendarEventsPageName);

    }

}
