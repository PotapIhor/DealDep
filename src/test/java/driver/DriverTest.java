package driver;

import mainPage.MainPage;
import mainPage.SearchPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverTest {
    protected  WebDriver driver;
    protected MainPage mainPages;
    protected SearchPage searchPage;
    public WebElement element;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\DriverChrom\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
