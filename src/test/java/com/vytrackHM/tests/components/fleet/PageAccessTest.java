package com.vytrackHM.tests.components.fleet;

import com.vytrackHM.utilities.BrowserUtils;
import com.vytrackHM.utilities.TestBase;
import com.vytrackHM.utilities.VYtrackUtils;
import org.testng.annotations.Test;

public class PageAccessTest extends TestBase {

    @Test
    public void storeManagerVehicleContractsTest(){
        extentLogger = report.createTest("Vehicle contracts test store manager");
        pages.loginPage().loginAs("store manager");
        VYtrackUtils.navigateToModule(driver, "Fleet", "Vehicle Contracts");
        String expectedPageName = "Vehicle Contract";
        String actualPageName = pages.mainPage().pageNameElement.getText();
        if(actualPageName.equals(expectedPageName)){
            System.out.println("Passed");
            System.out.println("Verified that store manager has an access to vehicle contracts page");
        }else{
            System.out.println("Failed");
            System.out.println("Store manager doesn't have an access to vehicle contracts page");
        }
    }

    @Test
    public void salesManagerVehicleContractsTest(){
        extentLogger = report.createTest("Vehicle contracts test sales manager");
        pages.loginPage().loginAs("sales manager");
        VYtrackUtils.navigateToModule(driver, "Fleet", "Vehicle Contracts");
        String expectedPageName = "Vehicle Contract";
        String actualPageName = pages.mainPage().pageNameElement.getText();
        if(actualPageName.equals(expectedPageName)){
            System.out.println("Passed");
            System.out.println("Verified that sales manager has an access to vehicle contracts page");
        }else{
            System.out.println("Failed");
            System.out.println("Sales manager doesn't have an access to vehicle contracts page");
        }
    }

    @Test
    public void driverVehicleContractsTest(){
        extentLogger = report.createTest("Vehicle contracts test driver");
        pages.loginPage().loginAs("driver");
        VYtrackUtils.navigateToModule(driver, "Fleet", "Vehicle Contracts");
        String expectedPageName = "Vehicle Contract";
        String actualPageName = pages.mainPage().pageNameElement.getText();
        if(actualPageName.equals(expectedPageName)){
            System.out.println("Passed");
            System.out.println("Verified that driver has an access to vehicle contracts page");
        }else{
            System.out.println("Failed");
            System.out.println("Driver doesn't have an access to vehicle contracts page");
            String actualNoAccessMessage = pages.vehiclesContractsPage().noAccessMessageElement.getText();
            String expectedNoAccessMessage = "You do not have permission to perform this action.";
            if(actualNoAccessMessage.equals(expectedNoAccessMessage)){
                System.out.println("Passed");
                System.out.println(actualNoAccessMessage + " : message is displayed");
            }else{
                System.out.println("Failed");
            }
        }
    }

}
