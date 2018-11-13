package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends GooglePage {
    public SearchResultsPage(WebDriver webDriver) {
        super(webDriver, "/search?ei=0bTqW6HcIuyegAagr7WYBA&q=Nebuchadnezzar");
    }

    public void newSearch (){
        try {
            webDriver.get(googleUrl + expectedUrl );
        }
        catch (Exception e){
            Assert.fail();
        }}}

