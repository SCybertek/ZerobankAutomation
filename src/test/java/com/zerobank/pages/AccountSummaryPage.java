package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AccountSummaryPage extends BasePage{

//    @FindBy (tagName = "h2")
//    private WebElement accountNames;
//


    public List<String > getAllAccounts(){
        BrowserUtils.wait(2);
        List<WebElement> allAccountNames = driver.findElements(By.xpath("//h2"));
        return BrowserUtils.getTextFromWebElements(allAccountNames);

//        for (int i = 1; i < 5; i++) {
//            allAccountNames.add(driver.findElement(By.xpath("//h2["+ i +"]")).getText());
//        }
//       return allAccountNames;
    }

    public List<String> getAllTableColumns(){
        BrowserUtils.wait(2);
        List<WebElement> allColumns = driver.findElements(By.xpath("(//table)[3]//th"));
        List<String> columns = BrowserUtils.getTextFromWebElements(allColumns);
        return columns;
    }
}
