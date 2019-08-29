package com.vytrackHM.pages.fleet;

import com.vytrackHM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VehiclesContractsPage {

    public VehiclesContractsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='You do not have permission to perform this action.'] ")
    public WebElement noAccessMessageElement;
}
