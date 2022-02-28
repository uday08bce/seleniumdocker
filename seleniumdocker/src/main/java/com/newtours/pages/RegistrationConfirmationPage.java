package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitConfirmationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText="sign-in")
    private WebElement signInlink;

    @FindBy(id="flight-link")
    private WebElement flightsLink;

    SubmitConfirmationPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void clickOnFlights(){
        wait
    }
}
