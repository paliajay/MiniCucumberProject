package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMessagesPage {

    public MedunnaMessagesPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[.='Create a new Message']")
    public WebElement createANewMessageLink;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name="subject")
    public WebElement subject;

    @FindBy(name="message")
    public WebElement message;

    @FindBy(id="save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

}
