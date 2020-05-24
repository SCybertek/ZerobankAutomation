package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy (id = "signin_button")
    private WebElement signInButton;

    @FindBy (id = "user_login")
    private WebElement loginInput;

    @FindBy (id = "user_password")
    private WebElement passwordInput;

    @FindBy (name = "submit")
    private WebElement submitButton;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    private WebElement errorMessage;


    public void login(){
        wait.until(ExpectedConditions.visibilityOf(signInButton)).click();
        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(loginInput)).sendKeys(ConfigurationReader.getProperty("username"));
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }

    public void login(String username, String password){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        BrowserUtils.wait(1);
        wait.until(ExpectedConditions.visibilityOf(loginInput)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
        submitButton.click();
    }

    public void clickOnSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String getErrorMessage(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }
}
