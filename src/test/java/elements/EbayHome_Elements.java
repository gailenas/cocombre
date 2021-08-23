package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EbayHome_Elements {
    WebDriver driver;

    @FindBy(linkText = "Advanced") public WebElement advancedLink;
    @FindBy(id = "gh-ac") public WebElement searchField;
    @FindBy(css = "input#gh-btn") public WebElement searchButton;
    @FindBy(css = ".srp-controls__count-heading .BOLD:nth-of-type(1)") public WebElement resultsCount;
//    @FindBy(xpath = "//select[@id='gh-cat']/option") public List<WebElement> categories;
    @FindBy(css = ".hl-cat-nav__container a") public List<WebElement> categories;

    public EbayHome_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
