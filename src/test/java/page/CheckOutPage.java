package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPage extends BaseTest {
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[contains(@id, 'first-name')]")
    WebElement firstName;
    @FindBy(xpath = "//input[contains(@id, 'last-name')]")
    WebElement lastName;
    @FindBy(xpath = "//input[contains(@id, 'postal-code')]")
    WebElement postalCode;
    @FindBy(xpath = "//input[contains(@type, 'submit')]")
    WebElement continueButton;
    @FindBy(xpath = "//button[contains(@id, 'finish')]")
    WebElement finishButton;

    public void sendKeysFirstName(String firstN){
        wdWait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.clear();
        firstName.sendKeys(firstN);
    }
    public void sendKeysLastName(String lastN){
        wdWait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.clear();
        lastName.sendKeys(lastN);
    }
    public void sendKeysPostalCode(String postal){
        wdWait.until(ExpectedConditions.visibilityOf(postalCode));
        postalCode.clear();
        postalCode.sendKeys(postal);
    }
    public void clickOnContinueButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
    public void clickOnFinishButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(finishButton));
        finishButton.click();
    }
}
