package mainPage;

import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver webDriver;
    String expectedUrl;
    final String googleUrl= "http://google.com.ua";

    public MainPage(WebDriver webDriver, String expectedUrl) {
        this.webDriver = webDriver;
        this.expectedUrl = expectedUrl;
    }


    public String getUrl (){
        return webDriver.getCurrentUrl();

    }
}
