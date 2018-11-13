package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    WebDriver webDriver;
    String expectedUrl;
    final String googleUrl= "http://google.com.ua";

    public GooglePage(WebDriver webDriver, String expectedUrl) {
        this.webDriver = webDriver;
        this.expectedUrl = googleUrl + expectedUrl;
    }

    public GooglePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String getUrl (){
        return webDriver.getCurrentUrl();
    }

    public void checkUrl (){
        try {
            Assert.assertEquals("URL not expected", expectedUrl, getUrl());
        }
        catch (Exception e){
            Assert.fail("URL is not valid");

        }
    }
}
