package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BaseTest {
    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(@id, 'checkout')]")
    WebElement checkOutButton;

    public void clickOnCheckOutButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(checkOutButton));
        checkOutButton.click();
    }
}
