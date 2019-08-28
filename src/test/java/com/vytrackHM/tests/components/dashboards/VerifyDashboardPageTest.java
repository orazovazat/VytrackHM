package com.vytrackHM.tests.components.dashboards;

import com.vytrackHM.utilities.ConfigurationReader;
import com.vytrackHM.utilities.TestBase;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class VerifyDashboardPageTest extends TestBase {

    @Test
    public void verifyDashboardTest(){
        extentLogger = report.createTest("Verifying dashboard page's title");

        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        pages.loginPage().login(username, password);
    }

}
