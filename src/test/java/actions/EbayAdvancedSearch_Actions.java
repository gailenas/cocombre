package actions;

import elements.EbayAdvancedSearch_Elements;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class EbayAdvancedSearch_Actions {
    EbayAdvancedSearch_Elements ebayAdvancedSearch_elements;

    public EbayAdvancedSearch_Actions(Common_Steps common_steps) {
        WebDriver driver = common_steps.getDriver();
        ebayAdvancedSearch_elements = new EbayAdvancedSearch_Elements(driver);
    }

    public void clickOnEbayLogo() {
        ebayAdvancedSearch_elements.ebayLogo.click();
    }

    public void enterSearchString(String string) {
        ebayAdvancedSearch_elements.searchString.sendKeys(string);
    }

    public void enterSearchExcludeString(String string) {
        ebayAdvancedSearch_elements.excludeString.sendKeys(string);
    }

    public void enterMinPrice(String string) {
        ebayAdvancedSearch_elements.minPrice.sendKeys(string);
    }

    public void  enterMaxPrice(String string) {
        ebayAdvancedSearch_elements.maxPrice.sendKeys(string);
    }

    public void clickOnSearchButton() {
        ebayAdvancedSearch_elements.searchButton.click();
    }

}
