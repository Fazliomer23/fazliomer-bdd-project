package tek.bdd.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariBrowser implements IBrowser {

    @Override
    public WebDriver openBrowser(boolean isHeadless) {
        SafariOptions options = new SafariOptions();
        // Safari does not support headless mode, so the `isHeadless` parameter is not used here
        return new SafariDriver(options);
    }
}