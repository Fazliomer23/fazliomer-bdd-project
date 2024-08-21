package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.HomePageObject;
import tek.bdd.utilities.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigateToRetail_app() {
        openBrowser();

    }
    @Then("validate TEK Insurance UI is exist")
    public void validateTekInsuranceUiIsExist() {
        String tekInsuranceText = getElementText(HomePageObject.TEK_INSURANCE_UI_TEXT);
        Assert.assertEquals("TEK Insurance App", tekInsuranceText);
        System.out.println(tekInsuranceText);

    }
    @Then("validate Create Primary Account is exist")
    public void validateCreatePrimaryAccountIsExist() {
        String createPrimaryAccountText = getElementText(HomePageObject.CREATE_PRIMARY_ACCOUNT_BUTTON);
        Assert.assertEquals("Create Primary Account",createPrimaryAccountText);
        System.out.println(createPrimaryAccountText);

    }
    @Then("validate Login button is enabled")
    public void validateLoginButtonIsEnabled() {
        boolean loginBtnText = isElementIsEnabled(HomePageObject.LOGIN_BUTTON);
        Assert.assertTrue("Login button should be enabled", loginBtnText);

    }
    @Then("validate color mode button is displayed")
    public void validateColorModeButtonIsDisplayed() {
        boolean colorModeOption = isElementIsDisplayed(HomePageObject.COLOR_MOOD_BUTTON);
        Assert.assertTrue("Dark mode color button must be displayed", colorModeOption);
    }
}
