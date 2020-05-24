package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver = Driver.get();

    protected WebDriverWait wait = new WebDriverWait(driver, 15);
    //initializing wait object for explicit wait to be used in methods


    @FindBy (id = "signin_button")
    private WebElement signInButton;

    public BasePage(){
        PageFactory.initElements(driver,this );
    }

//    public void clickSignInButton(){
//        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
//    }

    public void navigateTo(String tab){
        WebElement tabLocator = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']//a[contains(text(),'" + tab +"')]"));

        Actions actions = new Actions(driver);
        BrowserUtils.wait(4);
        actions.moveToElement(tabLocator)
                .pause(2000)
                .click().build().perform();

        BrowserUtils.wait(4);
    }
}
