package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {

    WebDriver driver;

    @FindBy(id = "gh-la") public WebElement ebayLogo;
    @FindBy(xpath = "/html//input[@id='_nkw']") public WebElement searchString;
    @FindBy(xpath = "/html//input[@id='_ex_kw']") public WebElement excludeString;
    @FindBy(xpath = "//form[@id='adv_search_from']//input[@name='_udlo']") public WebElement minPrice;
    @FindBy(xpath = "//form[@id='adv_search_from']//input[@name='_udhi']") public WebElement maxPrice;
    @FindBy(css = ".adv-s.mb.space-top > .btn.btn-prim") public WebElement searchButton;

    public EbayAdvancedSearch_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
