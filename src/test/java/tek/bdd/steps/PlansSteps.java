package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.PlansPageObject;
import tek.bdd.utilities.SeleniumUtility;

public class PlansSteps extends SeleniumUtility {

    @Then("click on plans button")
    public void clickOnPlansButton() {
        clickOnElement(PlansPageObject.PLANS_ICON);

    }
    @Then("validate {int} row of the data is present")
    public void validate4RowOfTheDataIsPresent(Integer row) {

        String planType = getElementText(PlansPageObject.PLAN_TYPE);
        Assert.assertEquals("PLAN TYPE", planType);

        String planBasePrice = getElementText(PlansPageObject.PLAN_BASE_PRICE);
        Assert.assertEquals("PLAN BASE PRICE", planBasePrice);

        String dateCreated = getElementText(PlansPageObject.DATE_CREATED);
        Assert.assertEquals("DATE CREATED", dateCreated);

        String dateExpire = getElementText(PlansPageObject.DATE_EXPIRE);
        Assert.assertEquals("DATE EXPIRE", dateExpire);

    }
}
