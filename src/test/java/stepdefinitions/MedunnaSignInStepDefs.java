package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaSignInPage;
import utilities.ConfigReader;
import utilities.WaitUtils;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaSignInPage medunnaSignInPage = new MedunnaSignInPage();

    @When("click on user icon")
    public void click_on_user_icon() {

        medunnaHomePage.userIcon.click();

    }
    @When("click on sign in link")
    public void click_on_sign_in_link() {

        medunnaHomePage.signInLink.click();

    }
    @When("enter username")
    public void enter_username() {

        medunnaSignInPage.username.sendKeys(ConfigReader.getProperty("username"));

    }
    @When("enter password")
    public void enter_password() {

        medunnaSignInPage.password.sendKeys(ConfigReader.getProperty("password"));

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() {

        medunnaSignInPage.signInSubmitButton.click();

    }

}
