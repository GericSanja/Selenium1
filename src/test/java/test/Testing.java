package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class Testing extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    AssertPage assertPage;
    BackPackPage backPackPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;

    @Before
    public void setUp1() {

        loginPage = new LoginPage();
        homePage = new HomePage();
        assertPage = new AssertPage();
        backPackPage = new BackPackPage();
        cartPage = new CartPage();
        checkOutPage = new CheckOutPage();

    }

    @Test
    public void successfullLog() throws InterruptedException {
        /*
- open url https://www.saucedemo.com/
            - Login with valid user and password (standard_user/secret_sauce)
- Click on the "Sauce Labs Backpack" item
    - verify title, description and price of this item
    - click on the button "ADD TO CART"
            - Click on the button "BACK TO PRODUCTS"
            - From product home page click "ADD TO CART" button for "Sauce Labs Fleece Jacket" item
- Click on the "Shopping Cart" button to open Shopping Cart page
- Click on the "Chechout" button to continue with order
- Enter Firstname, Lastname, Zipcode and click on Finish button
- Verify "THANK YOU FOR YOUR ORDER" is displayed
- Logout
*/
        loginPage.sendKeysUser("standard_user");
        Thread.sleep(3000);
        loginPage.sendKeysPass("secret_sauce");
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
        homePage.clickOnBackpackButton();
        Thread.sleep(3000);
        Assert.assertEquals("$29.99",
                assertPage.isAssertOkay());
        Thread.sleep(3000);
        backPackPage.clickOnAddToCartButton();
        Thread.sleep(3000);
        backPackPage.clickOnBackToProductsButton();
        Thread.sleep(3000);
        homePage.clickOnAddToCartJacketButton();
        Thread.sleep(3000);
        homePage.clickOnShoppingCartButton();
        Thread.sleep(3000);
        cartPage.clickOnCheckOutButton();
        Thread.sleep(3000);
        checkOutPage.sendKeysFirstName("Sanja");
        Thread.sleep(3000);
        checkOutPage.sendKeysLastName("Geric");
        Thread.sleep(3000);
        checkOutPage.sendKeysPostalCode("123456");
        Thread.sleep(3000);
        checkOutPage.clickOnContinueButton();
        Thread.sleep(3000);
        checkOutPage.clickOnFinishButton();
        Thread.sleep(3000);


    }

}

