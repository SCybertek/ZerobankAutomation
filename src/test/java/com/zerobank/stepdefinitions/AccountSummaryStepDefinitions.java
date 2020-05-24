package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("User navigates to {string}")
    public void user_navigates_to(String page) {
        accountSummaryPage.navigateTo(page);
    }

    @Then("User should verify that title {string} is displayed")
    public void user_should_verify_that_title_is_displayed(String string) {
        System.out.println("Verifying that title of the page is displayed");
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertEquals(string, Driver.get().getTitle());

    }

    @Then("Account summary page should display following")
    public void account_summary_page_should_display_following(List<String> expectedAccounts) {
        System.out.println("Verifying accounts that are displayed");
        Assert.assertEquals(expectedAccounts,accountSummaryPage.getAllAccounts());
    }

    @Then("Credit Accounts table should have these options")
    public void credit_Accounts_table_should_have_these_options(List<String> expectedColumns) {
        System.out.println("Verifying column names");
        Assert.assertEquals(expectedColumns,accountSummaryPage.getAllTableColumns() );
    }

}
