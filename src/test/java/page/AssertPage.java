package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AssertPage extends BaseTest {
    public AssertPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[contains(@class, 'inventory_details_price')]")
    WebElement price;

    public boolean isAssertSuccessfull(){
        wdWait.until(ExpectedConditions.visibilityOf(price));
        return price.isDisplayed();

    }
    public String isAssertOkay(){
        wdWait.until(ExpectedConditions.visibilityOf(price));
        return price.getText();
    }
}
