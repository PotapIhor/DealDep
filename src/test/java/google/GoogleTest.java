package google;


import driver.DriverTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleTest {
    public   WebDriver driver;



    @Test
    public void find() {
        driver.get("http://google.com.ua");
        DriverTest test = new DriverTest();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        search.sendKeys("Nebuchadnezzar");
        search.submit();

        Assert.assertTrue(isPresent());
    }

    public Boolean isPresent(){
        List <WebElement> allElements = driver.findElements(By.className("iUh30" ));
        int s = allElements.size();
        Boolean b = false;
        if(s>0) {
            b = true;
        }
        return b;
    }


}

///переписать на PageObject & Selenide



