package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPageObject;
import tek.bdd.utilities.SeleniumUtility;

public class LoginPageSteps extends SeleniumUtility {

    @When("click on login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPageObject.LOGIN_BUTTON);
    }

    @Then("validate Sign in to your Account text is exist")
    public void validateSignInToYourAccountTextIsExist() {
        String loginPageText = getElementText(LoginPageObject.SIGN_IN_TO_YOUR_ACCOUNT_TEXT);
        Assert.assertEquals("Sign in to your Account", loginPageText);

    }

    @Then("enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
        sendText(LoginPageObject.USERNAME_INPUT, username);
        sendText(LoginPageObject.PASSWORD_INPUT, password);

    }
    @Then("click on sign in button")
    public void clickOnSignIButton() throws InterruptedException {
        clickOnElement(LoginPageObject.SIGN_IN_BUTTON);
        Thread.sleep(5000);

    }
    @Then("validate user navigate to Customer Service Portal")
    public void validateUserNavigateToCustomerServicePortal() {
        String actualCustomerServicesPortal = getElementText(LoginPageObject.VALIDATE_CUSTOMER_SERVICES_PORTAL);
        Assert.assertEquals("Customer Service Portal", actualCustomerServicesPortal);

    }

    @Then("validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPageObject.ERROR_MESSAGE);
        Assert.assertEquals("ERROR", actualErrorMessage, expectedErrorMessage);
    }

    @Then("close browser")
    public void closeBrowser() {
        quitBrowser();
    }
}