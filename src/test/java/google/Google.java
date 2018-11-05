package google;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class Google {

    private static WebDriver driver;
    private WebElement element;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com.ua");

    }
    @Test
    public void userLogin() {
        WebElement search = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        search.sendKeys("Навуходоносор");
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input"));
        button.click();


        driver.findElement(By.tagName( "https://ru.wikipedia.org/wiki/")).click();

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}