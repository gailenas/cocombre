package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Tagged_Hooks {
    WebDriver driver;

    public Tagged_Hooks(Common_Steps common_steps) {
        driver = common_steps.getDriver();
    }

    @Before(value = "@setCookies", order = 1)
    public void setCookies() {
        System.out.println("Scenario specific Hook - setCookies executed");
    }

    @After(value = "@Test", order = 0)
    public void testAfterHook() {
        System.out.println("Scenario specific Hook = After Hook Test");
    }
}
