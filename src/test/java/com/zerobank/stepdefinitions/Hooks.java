package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //you can include driver.window.maximise in here as well
    @Before
    public void setup(){
        Driver.get();
    }

    //here we have to make sure scenario class will create screenshot for our failed tests
    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.get();
            byte [] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }


}
