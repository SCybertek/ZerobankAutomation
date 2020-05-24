package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.sql.ClientInfoStatus;
import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy (id = "aa_accountId")
    private WebElement dropdown;

    @FindBy (xpath = "//table//th")
    private WebElement tableHeaders;


    Select selectAccount = new Select(dropdown);

    public String getDefaultAccount() {
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        return selectAccount.getFirstSelectedOption().getText();
    }

    public List<String> getAllDropdownOptions(){
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        List<WebElement> allOptions = selectAccount.getOptions();
        return BrowserUtils.getTextFromWebElements(allOptions);
    }

    public List<String> getTablesHeaders(){
        List<WebElement> allHeaders = driver.findElements(By.xpath("//table//th"));
        return  BrowserUtils.getTextFromWebElements(allHeaders);

    }




}
