package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRoomPage {

    public MedunnaRoomPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "jh-create-entity")
    public WebElement createANewRoomLink;

    @FindBy(name = "roomNumber")
    public WebElement roomNumber;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeDropDown;

    @FindBy(id = "room-status")
    public WebElement statusCheckBox;

    @FindBy(id = "room-price")
    public WebElement price;

    @FindBy(id = "room-description")
    public WebElement description;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

}
