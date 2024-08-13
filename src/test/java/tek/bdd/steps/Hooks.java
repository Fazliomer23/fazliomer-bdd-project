package tek.bdd.steps;

import org.junit.After;
import org.junit.Before;
import tek.bdd.utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Before
    public void beforeEachScenario(){
        openBrowser();
    }

    @After
    public void afterEachScenario(){
        quitBrowser();
    }
}
