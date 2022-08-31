package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BackPackPage extends BaseTest {
    public BackPackPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(@name, 'add-to-cart-sauce-labs-backpack')]")
    WebElement addToCart;

    @FindBy(xpath = "//button[contains(@id, 'back-to-products')]")
    WebElement backToProducts;

    public void clickOnAddToCartButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(addToCart));
        addToCart.click();
    }

    public void clickOnBackToProductsButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(backToProducts));
        backToProducts.click();
    }
}