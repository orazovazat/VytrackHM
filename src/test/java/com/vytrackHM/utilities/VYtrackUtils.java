package com.vytrackHM.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VYtrackUtils {


    public static void navigateToModule(WebDriver driver, String tab, String module){
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[contains(text(),'"+module+"') and contains(@class, 'title title-level-2')]";
//        driver.findElement(By.xpath(tabLocator)).click();
        BrowserUtils.clickWithWait(driver, By.xpath(tabLocator), 5);
        BrowserUtils.waitPlease(1);
//        driver.findElement(By.xpath(moduleLocator)).click();

        BrowserUtils.clickWithWait(driver, By.xpath(moduleLocator), 5);

        BrowserUtils.waitPlease(2);
    }

}
