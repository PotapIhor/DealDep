package google;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google {
    private static WebDriver driver;
    private WebElement input;

@BeforeClass
public static void setup() {
    System.setProperty("webdriver.chrome.driver", "C:\\ChromDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://google.com");
    driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
    final

}

}
