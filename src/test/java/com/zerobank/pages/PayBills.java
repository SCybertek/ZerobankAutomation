package com.zerobank.pages;


import io.cucumber.java.eo.Se;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PayBills extends BasePage {

    @FindBy (id = "sp_payee")
    private WebElement payee;

    @FindBy (id = "sp_account")
    private WebElement account;

    @FindBy (id = "sp_amount")
    private WebElement amount;

    @FindBy (id = "sp_date")
    private WebElement date;

    @FindBy (id = "sp_description")
    private WebElement description;

    @FindBy (id ="pay_saved_payees")
    private WebElement payButton;

    @FindBy (id ="alert_content")
    private WebElement successMessage;

    Select payeeDropdown = new Select(payee);
    Select accountDropdown = new Select(account);

    public void setPayee(String options){
        wait.until(ExpectedConditions.visibilityOf(payee));
        payeeDropdown.selectByVisibleText(options);
    }

    public void setAccount(String option){
        wait.until(ExpectedConditions.visibilityOf(account));
        accountDropdown.selectByVisibleText(option);
    }

    public void setAmount(String amount){
        wait.until(ExpectedConditions.visibilityOf(this.amount)).sendKeys(amount);
    }

    public void setDate(String date){
        wait.until(ExpectedConditions.visibilityOf(this.date)).sendKeys(date);
    }

    public void setDescription(String description) {
        wait.until(ExpectedConditions.visibilityOf(this.description)).sendKeys(description);
    }

    public void clickOnPay(){
        wait.until(ExpectedConditions.visibilityOf(payButton)).click();
    }


//???
    public String getAlert() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public String getMessage(){
        return successMessage.getText();
    }
}
