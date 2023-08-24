package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.Driver;
import utilities.WaitUtils;

public class CommonStepDefs {

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {

        Driver.getDriver().get(url);

    }

    @And("close the application")
    public void closeTheApplication() {

        WaitUtils.waitFor(3);
        Driver.closeDriver();

    }
}
