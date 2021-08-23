package actions;

import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class Common_Actions {

    private final WebDriver driver;

    public Common_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getCurrentTitle(){
        return driver.getTitle();
    }

    public void quitWebDriver() {
        driver.quit();
    }
}
