package tek.bdd.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import tek.bdd.browsers.BaseBrowser;
import tek.bdd.browsers.ChromeBrowser;
import tek.bdd.browsers.EdgeBrowser;
import tek.bdd.browsers.FireFoxBrowser;
import tek.bdd.exceptions.ExceptionsHandling;
import tek.bdd.utilities.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public abstract class BaseSetup {

    private static WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(BaseSetup.class);
    private final Properties properties;

    public BaseSetup() {

        try {
            String configFilePath = System.getProperty("user.dir") + "/src/test/resources/configs/dev-config.properties";
            LOGGER.info("Reading Config file {}", configFilePath);
            File file = new File(configFilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (IOException exception){
            LOGGER.error("Error reading config file", exception);
            throw new ExceptionsHandling("Something wrong with config file");
        }
    }



    public void openBrowser(){
        String browserType = properties.getProperty("ui.browser");
        boolean isHeadless = Boolean.parseBoolean(properties.getProperty("ui.browser.headless"));
        LOGGER.info("Running on browser {}", browserType);
        LOGGER.info("Is Headless ON {}", isHeadless);
        BaseBrowser browser;

        if (browserType.equalsIgnoreCase("chrome"))
            browser = new ChromeBrowser();
        else if (browserType.equalsIgnoreCase("edge"))
            browser = new EdgeBrowser();
        else if (browserType.equalsIgnoreCase("firefox"))
            browser = new FireFoxBrowser();
        else
            throw new ExceptionsHandling("Wrong browser type, choose another browser such as chrome, firefox and edge");

        driver = browser.openBrowser(isHeadless);
        String url = properties.getProperty("ui.url");
        LOGGER.debug("Using URL {}", url);
        driver.get(url);
        LOGGER.info("Maximizing the browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.WAIT_IN_SECONDS));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.WAIT_IN_SECONDS));

    }
    public void quitBrowser(){
        if(driver != null){
            LOGGER.info("Quitting the Browser");
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        LOGGER.info("Getting the driver");
        return driver;
    }
}
