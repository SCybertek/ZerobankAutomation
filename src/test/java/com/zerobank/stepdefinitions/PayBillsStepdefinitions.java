package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBills;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class PayBillsStepdefinitions {

    PayBills payBills = new PayBills();

    @When("User completes the payment information")
    public void user_completes_the_payment_information(Map<String, String> paymentInfo) {
        payBills.setPayee(paymentInfo.get("Payee"));
        payBills.setAccount(paymentInfo.get("Account"));
        payBills.setAmount(paymentInfo.get("Amount"));
        payBills.setDate(paymentInfo.get("Date"));
        payBills.setDescription(paymentInfo.get("Description"));
    }

    @When("User clicks on pay button")
    public void user_clicks_on_pay_button() {
        payBills.clickOnPay();
    }

    @Then("{string} message should display")
    public void message_should_display(String string) {
        Assert.assertEquals(string,payBills.getMessage());
    }


    @Then("{string} error message should display")
    public void error_Message_Should_Display(String string) {
            Assert.assertEquals(string, payBills.getAlert() );

        }
    }

