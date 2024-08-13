package tek.bdd.browsers;

import org.openqa.selenium.WebDriver;

public interface IBrowser {

    WebDriver openBrowser(boolean isHeadless);
}
