package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import page.BackPackPage;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wdWait;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wdWait=new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


    }
    @After
    public void logout() throws InterruptedException {
        WebElement meni=driver.findElement(By.xpath("//button[contains(@id, 'react-burger-menu-btn')]"));
        meni.click();
        Thread.sleep(3000);
        WebElement logoutText=wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Logout')]")));
        logoutText.click();
        driver.close();
    }


}


