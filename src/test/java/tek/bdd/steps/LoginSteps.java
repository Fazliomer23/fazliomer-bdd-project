package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPageObject;
import tek.bdd.utilities.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {

    @When("click on login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPageObject.LOGIN_BUTTON);
    }

    @Then("validate Sign in to your Account text is exist")
    public void validateSignInToYourAccountTextIsExist() {
        String loginPageText = getElementText(LoginPageObject.SIGN_IN_TO_YOUR_ACCOUNT_TEXT);
        Assert.assertEquals("Sign in to your Account", loginPageText);

    }
}
