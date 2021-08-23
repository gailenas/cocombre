package steps;

import actions.Common_Actions;
import actions.EbayHome_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;


public class EbayHome_Steps {
    Common_Actions common_actions;

    EbayHome_Actions ebayHome_actions;

    public EbayHome_Steps(Common_Actions common_actions, EbayHome_Actions ebayHome_actions) {
        this.ebayHome_actions = ebayHome_actions;
        this.common_actions = common_actions;
    }

    @Given("I am on Ebay Home Page")
    public void iAmOnEbayHomePage() {
        common_actions.goToUrl("https://www.ebay.com");
    }

    @When("I click on Advanced Link")
    public void iClickOnAdvancedLink() {
        ebayHome_actions.clickAdvancedLink();
    }

    @Then("I navigate to Advanced Search Page")
    public void iNavigateToAdvancedSearchPage() {
        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearchs";
        if(expectedUrl.equals(common_actions.getCurrentUrl())){
            fail("Do not navigated to Advanced Search Page");
        }
    }

    @When("I search for {string}")
    public void iSearchForAndroid(String arg0) {
        ebayHome_actions.searchAnItem(arg0);
        ebayHome_actions.clickSearchButton();
    }

    @Then("I validate at least {int} search results")
    public void iValidateAtLeastSearchResults(int arg0) {
        if (ebayHome_actions.getSearchItemCount() <= arg0) {
            fail("Amount of results less than " + arg0);
        }
    }

    @When("I search for {string} in {string} category")
    public void iSearchForSoapInBabyCategory(String arg0,String arg1) {
        ebayHome_actions.searchAnItem(arg0);
        ebayHome_actions.selectCategoryOption(arg1);
        ebayHome_actions.clickSearchButton();
    }

    @When("I click on {string}")
    public void iClickOnLink(String link) {
        ebayHome_actions.clickOnLinkByText(link);
    }

    @Then("I validate that page navigates to {string} and title contains {string}")
    public void iValidateThatPageNavigatesToUrlAndTitleContainsTitle(String url, String title) {
        if(!url.equals(common_actions.getCurrentUrl())) {
            fail("Did not navigate to correct url");
        } else if (!common_actions.getCurrentTitle().contains(title)) {
            fail("Title do not match");
        }
    }
}
