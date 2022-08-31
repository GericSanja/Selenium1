package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {
    public HomePage(){PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    WebElement backpackButton;
    @FindBy(xpath = "//button[contains(@id, 'add-to-cart-sauce-labs-fleece-jacket')]")
    WebElement addToCartJacketButton;
    @FindBy(xpath = "//a[contains(@class, 'shopping_cart_link')]")
    WebElement shoppingCartButton;

    public void clickOnBackpackButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(backpackButton));
        backpackButton.click();
    }
    public void clickOnAddToCartJacketButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(addToCartJacketButton));
        addToCartJacketButton.click();
    }
    public void clickOnShoppingCartButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(shoppingCartButton));
        shoppingCartButton.click();
    }
}

