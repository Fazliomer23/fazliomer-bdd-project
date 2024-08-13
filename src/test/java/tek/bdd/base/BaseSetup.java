package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tek.bdd.utilities.Constants;
import java.time.Duration;

public class BaseSetup {

    private static WebDriver driver;

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.WAIT_IN_SECONDS));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.WAIT_IN_SECONDS));

    }
    public void quitBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }
}
