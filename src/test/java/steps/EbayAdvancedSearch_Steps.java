package steps;


import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class EbayAdvancedSearch_Steps {

    Common_Actions common_actions;

    EbayAdvancedSearch_Actions ebayAdvancedSearch_actions;

    public EbayAdvancedSearch_Steps(Common_Actions common_actions, EbayAdvancedSearch_Actions ebayAdvancedSearch_actions) {
        this.common_actions = common_actions;
        this.ebayAdvancedSearch_actions = ebayAdvancedSearch_actions;
    }

    @Given("I am on Ebay Advanced Search Page")
    public void iAmOnEbayAdvancedSearchPage() {
        common_actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
    }

    @When("I click on Ebay Logo")
    public void iClickOnEbayLogo() {
        ebayAdvancedSearch_actions.clickOnEbayLogo();
    }

    @Then("I am navigated to Ebay Home Page")
    public void iAmNavigatedToEbayHomePage() {
        String expectedUrl = "https://www.ebay.com/";

        if(!expectedUrl.equals(common_actions.getCurrentUrl())) {
            fail("Do not navigated to Home Page");
        }
    }

    @When("I advanced search an item")
    public void iAdvancedSearchAnItem(DataTable dataTable) {
        ebayAdvancedSearch_actions.enterSearchString(dataTable.cell(1,0));
        ebayAdvancedSearch_actions.enterSearchExcludeString(dataTable.cell(1,1));
        ebayAdvancedSearch_actions.enterMinPrice(dataTable.cell(1,2));
        ebayAdvancedSearch_actions.enterMaxPrice(dataTable.cell(1,3));

    }
}
