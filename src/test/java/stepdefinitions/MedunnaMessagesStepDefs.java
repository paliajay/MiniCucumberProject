package stepdefinitions;

import io.cucumber.java.en.*;
import pages.MedunnaHomePage;
import pages.MedunnaMessagesPage;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class MedunnaMessagesStepDefs {
    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaMessagesPage medunnaMessagesPage = new MedunnaMessagesPage();

    @When("click on messages option")
    public void click_on_messages_option() {
        WaitUtils.waitFor(1);
        medunnaHomePage.messagesOption.click();
    }

    @And("click on create a new message link")
    public void clickOnCreateANewMessageLink() {
        WaitUtils.waitFor(1);
        medunnaMessagesPage.createANewMessageLink.click();

    }

    @When("enter name {string}")
    public void enter_name(String name) {

        medunnaMessagesPage.name.sendKeys(name);
        //Rest is homework

    }

    @When("enter Email {string}")
    public void enter_email(String Email) {

        medunnaMessagesPage.email.sendKeys(Email);

    }

    @When("enter subject {string}")
    public void enter_subject(String subject) {

        medunnaMessagesPage.subject.sendKeys(subject);
    }

    @When("enter message {string}")
    public void enter_message(String message) {

        medunnaMessagesPage.message.sendKeys(message);
    }

    @When("click on save submit button")
    public void click_on_save_submit_button() {
        medunnaMessagesPage.saveButton.click();
    }

    @Then("verify alet message contains A new Message is created")
    public void verify_alet_message_contains_a_new_message_is_created() {
        WaitUtils.waitFor(1);
        assertTrue(medunnaMessagesPage.alertMessage.getText().contains("A new Message is created"));
    }
}
