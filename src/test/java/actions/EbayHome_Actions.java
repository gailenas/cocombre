package actions;

import elements.EbayHome_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Common_Steps;

import java.util.List;

public class EbayHome_Actions {

    private final WebDriver driver;
    EbayHome_Elements ebayhome_elements;

    public EbayHome_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        ebayhome_elements = new EbayHome_Elements(driver);
    }

    public void clickAdvancedLink(){
        ebayhome_elements.advancedLink.click();
    }

    public void searchAnItem(String searchString) {
        ebayhome_elements.searchField.sendKeys(searchString);
    }

    public void clickSearchButton() {
        ebayhome_elements.searchButton.click();
    }

    public int getSearchItemCount() {
        String itemCount = ebayhome_elements.resultsCount.getText().trim();
        String itemCountWithoutComa = itemCount.replace(",", "");
        return Integer.parseInt(itemCountWithoutComa);
    }

    public void selectCategoryOption(String option) {
        List<WebElement> categories = ebayhome_elements.categories;
        for (WebElement category: categories) {
            System.out.println(category.getText().trim());
            if(category.getText().trim().equalsIgnoreCase(option)){
                category.click();
                break;
            }
        }
    }

    public void clickOnLinkByText(String Text) {
        driver.findElement(By.linkText(Text)).click();
    }

}
