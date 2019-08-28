package com.vytrackHM.pages.main;

import com.vytrackHM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "fa-share-square")
    public WebElement shortcutElement;

    @FindBy(xpath = "(//span[@class='title title-level-1']/i)[1]")
    public WebElement pageNameElement;


}
