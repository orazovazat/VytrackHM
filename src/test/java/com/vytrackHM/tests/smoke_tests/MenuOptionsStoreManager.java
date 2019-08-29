package com.vytrackHM.tests.smoke_tests;

import com.vytrackHM.utilities.BrowserUtils;
import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.TestBase;
import com.vytrackHM.utilities.VYtrackUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class MenuOptionsStoreManager extends TestBase {

    @Test
    public void verifyDashboardTest1(){
        extentLogger = report.createTest("Verifying dashboard page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Dashboards", "Dashboard");
        String expectedDashboardsTitle = "Dashboard - Dashboards";
        String actualDashboardsTitle = driver.getTitle();
        Assert.assertEquals(expectedDashboardsTitle, actualDashboardsTitle);
        String expectedDashboardPageName = "Dashboard";
        String actualDashboardPageName = pages.vehiclesPage().pageNameElememnt.getText();
        Assert.assertEquals(expectedDashboardPageName, actualDashboardPageName);
    }

    @Test
    public void verifyDashboardTest2(){
        extentLogger = report.createTest("Verifying dashboard page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Fleet", "Vehicles");
        String expectedFleetVehiclesTitle = "Car - Entities - System - Car - Entities - System";
        String actualFleetVehiclesTitle = driver.getTitle();
        System.out.println(actualFleetVehiclesTitle);
        Assert.assertEquals(expectedFleetVehiclesTitle, actualFleetVehiclesTitle);
        String expectedAllCarsPageName = "Cars";
        String actualAllCarsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        System.out.println(actualAllCarsPageName);
        Assert.assertEquals(expectedAllCarsPageName, actualAllCarsPageName);
    }

    @Test
    public void verifyDashboardTest3() {
        extentLogger = report.createTest("Verifying dashboard page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Customers", "Accounts");
        String expectedCustomersAccountsTitle = "Accounts - Customers";
        String actualCustomersAccountsTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedCustomersAccountsTitle, actualCustomersAccountsTitle);
        String expectedAccountsPageName = "Accounts";
        String actualAccountsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedAccountsPageName, actualAccountsPageName);
    }

    @Test
    public void verifyDashboardTest4() {
        extentLogger = report.createTest("Verifying dashboard page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Customers", "Contacts");
        String expectedCustomersContactsTitle = "Accounts - Customers";
        String actualCustomersContactsTitle = driver.getTitle();
        Assert.assertEquals(expectedCustomersContactsTitle, actualCustomersContactsTitle);
        String expectedContactsPageName = "Contacts";
        String actualContactsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        Assert.assertEquals(expectedContactsPageName, actualContactsPageName);
    }

    @Test
    public void verifyDashboardTest5() {
        extentLogger = report.createTest("Verifying dashboard page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Sales", "Opportunities");
        String expectedOpenOpportunitiesTitle = "Open Opportunities - Opportunities - Sales";
        System.out.println(expectedOpenOpportunitiesTitle);
        String actualOpenOpportunitiesTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedOpenOpportunitiesTitle, actualOpenOpportunitiesTitle);
        String expectedOpenOpportunitiesPageName = "Open Opportunities";
        String actualOpenOpportunitiesPageName = pages.vehiclesPage().pageNameElememnt.getText();
        BrowserUtils.verifyEquals(expectedOpenOpportunitiesPageName, actualOpenOpportunitiesPageName);
    }

    @Test
    public void verifyDashboardTest6() {
        extentLogger = report.createTest("Verifying activities-calls page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Activities", "Calls");
        String expectedActivitiesCallsTitle = "Calendar Events - Activities";
        System.out.println(expectedActivitiesCallsTitle);
        String actualActivitiesCallsTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedActivitiesCallsTitle, actualActivitiesCallsTitle);
        String expectedAllCallsPageName = "All Calls";
        String actualAllCallsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        System.out.println(actualAllCallsPageName);
        BrowserUtils.verifyEquals(expectedAllCallsPageName, actualAllCallsPageName);
    }

    @Test
    public void verifyDashboardTest7() {
        extentLogger = report.createTest("Verifying activities-calls page's title");
        pages.loginPage().loginAs("Store manager");
        VYtrackUtils.navigateToModule(driver, "Activities", "Calendar Events");
        String expectedActivitiesCalendarEventsTitle = "Calendar Events - Activities";
        String actualActivitiesCalendarEventsTitle = driver.getTitle();
        BrowserUtils.verifyEquals(expectedActivitiesCalendarEventsTitle, actualActivitiesCalendarEventsTitle);
        String expectedCalendarEventsPageName = "Calendar Events";
        String actualCalendarEventsPageName = pages.vehiclesPage().pageNameElememnt.getText();
        System.out.println(actualCalendarEventsPageName);
        BrowserUtils.verifyEquals(expectedCalendarEventsPageName, actualCalendarEventsPageName);
    }

}
