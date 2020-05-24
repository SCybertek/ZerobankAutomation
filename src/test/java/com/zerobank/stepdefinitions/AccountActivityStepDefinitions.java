package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;

import io.cucumber.java.en.Then;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinitions {


    AccountActivityPage accountActivityPage = new AccountActivityPage();

    //SoftAssertions softAssertions = new SoftAssertions();
    //could not figure this part out

    @Then("Account dropdown default option {string} should display")
    public void account_dropdown_default_option_should_display(String string) {
        System.out.println("Verify that default option is Savings");
       Assert.assertEquals(string, accountActivityPage.getDefaultAccount() );
    }

    @Then("Account dropdown should have these options")
    public void account_dropdown_should_have_these_options(List<String> expectedDropDownOptions) {
        System.out.println("Verifying Account dropdown options");
        //softAssertions.asexpectedDropDownOptions, );
        Assert.assertEquals(expectedDropDownOptions, accountActivityPage.getAllDropdownOptions());
    }

    @Then("Transaction table should have these columns")
    public void transaction_table_should_have_these_columns(List<String > expectedColumns)  {
        Assert.assertEquals(expectedColumns, accountActivityPage.getTablesHeaders() );
    }
}
