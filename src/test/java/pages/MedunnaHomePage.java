package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {

    public MedunnaHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInLink;

    @FindBy(id = "entity-menu")
    public WebElement itemsAndTitles;

    @FindBy(xpath = "//span[.='Room']")
    public WebElement roomOption;

    @FindBy(xpath = "//span[.='Messages']")
    public WebElement messagesOption;





}
