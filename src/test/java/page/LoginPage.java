package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[contains(@id, 'user-name')]")
    WebElement username;
    @FindBy(xpath = "//input[contains(@id, 'password')]")
    WebElement password;
    @FindBy(xpath = "//input[contains(@id, 'login-button')]")
    WebElement loginButton;


    public void sendKeysUser(String user){
        wdWait.until(ExpectedConditions.visibilityOf(username));
        username.clear();
        username.sendKeys(user);
    }
    public void sendKeysPass(String pass){
        wdWait.until(ExpectedConditions.visibilityOf(password));
        password.clear();
        password.sendKeys(pass);
    }
    public void clickOnLoginButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

}


