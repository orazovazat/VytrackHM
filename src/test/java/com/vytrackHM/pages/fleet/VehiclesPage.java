package com.vytrackHM.pages.fleet;

import com.vytrackHM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {

    public VehiclesPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Vehicles']")
    public WebElement vehiclesElement;

    @FindBy(xpath = "//*[contains(text(),'') and contains(@class, 'oro-subtitle')]")
    public WebElement pageNameElememnt;


}
