package mainPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchPage extends MainPage {
    public SearchPage(WebDriver webDriver) {
        super(webDriver, "/search?client=opera&hs=Yes&ei=yVPjW5DGGYmvsAGX05_IBA&q=Nebuchadnezzar&oq=Nebuchadnezzar");
    }

    public void newSearch (){
        try {
            webDriver.get(googleUrl + expectedUrl );
        }
        catch (Exception e){
            Assert.fail();
        }}}

