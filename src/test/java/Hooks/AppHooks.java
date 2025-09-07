package Hooks;
import LibraryFiles.DriverFactory;
import LibraryFiles.Utilityclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.Browser;

import java.io.IOException;

public class AppHooks
{
    @Before
    public void openBrowser() throws IOException {
        String Browser = Utilityclass.getPFData("BrowserName");
        DriverFactory.initializeBrowser(Browser);
    }
    @After
    public void closeBrowser()
    {
        DriverFactory.driver.quit();
    }
}
