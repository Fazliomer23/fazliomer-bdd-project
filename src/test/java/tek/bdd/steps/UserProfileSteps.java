package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.UserProfilePageObject;
import tek.bdd.utilities.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {

    @Then("click on profile button")
    public void clickCnProfileButton() throws InterruptedException {
        clickOnElement(UserProfilePageObject.ACCOUNT_PROFILE);
        Thread.sleep(2000);

    }
    @Then("validate information in Profile Side Drawer is correct")
    public void validateInformationInProfileSideDrawerIsCorrect() {
        String actualProfile = getElementText(UserProfilePageObject.PROFILE_INFORMATION);
        Assert.assertEquals("Profile", actualProfile);

    }
    @Then("click on logout button")
    public void clickOnLogoutButton(){
        clickOnElement(UserProfilePageObject.LOGOUT_BUTTON);
    }

}
