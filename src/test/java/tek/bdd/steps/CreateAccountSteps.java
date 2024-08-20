package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPageObject;
import tek.bdd.utilities.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    @When("click on {string} links")
    public void clickOnLinks(String linkText) {
        clickOnElement(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_LINK);

    }
    @Then("validate section title to be {string}")
    public void validateSectionTitleToBe(String expectedTitle) {
       String createAccountHolderTitle = getElementText(CreateAccountPageObject.CREATE_PRIMARY_ACCOUNT_HOLDER_TILE);
        Assert.assertEquals("Create Primary Account Holder", createAccountHolderTitle);

    }
    @Then("fill up create account form")
    public void fillUpCreateAccountForm() {
        sendText(CreateAccountPageObject.EMAIL_INPUT, "jawid-12@gmail.com");
        sendText(CreateAccountPageObject.FIRST_NAME_INPUT, "Jawid");
        sendText(CreateAccountPageObject.LAST_NAME_INPUT, "Gulzai");
        sendText(CreateAccountPageObject.SELECT_DROPDOWN, "Mr.");
    }
    @When("click on {string} button")
    public void clickOnButton(String button) {

    }
}
