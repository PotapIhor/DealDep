package pages;

import org.openqa.selenium.WebDriver;

public class VikiPage extends GooglePage {

    public VikiPage(WebDriver webDriver, String expectedUrl) {
        super(webDriver, "https://en.wikipedia.org/wiki/Nebuchadnezzar_II");
    }

    public VikiPage(WebDriver driver) {
        super(driver);
    }

 public void result (){
        try {
            webDriver.get(expectedUrl);
        }
        catch (Exception e){
            org.junit.Assert.fail();
        }
 }
}
