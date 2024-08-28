package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.AccountsPageObject;
import tek.bdd.utilities.SeleniumUtility;

import java.util.List;

public class AccountsSteps extends SeleniumUtility {

    @Then("click on Accounts button")
    public void clickOnAccountsButton() {
        clickOnElement(AccountsPageObject.ACCOUNTS_BUTTON);

    }

    @Then("validate Primary Accounts title is exist")
    public void validatePrimaryAccountsTitleIsExist() {
        String actualPrimaryAccountsTitle = getElementText(AccountsPageObject.PRIMARY_ACCOUNT_TITLE);
        Assert.assertEquals("Primary Accounts", actualPrimaryAccountsTitle);

    }

    @Then("validate table row count to be {int}")
    public void validateTableRowCountToBe(int expectedRows) {
         List<WebElement> tableRow = getElements(AccountsPageObject.TABLE_ROW_ELEMENT);
        Assert.assertEquals("validate table rows", tableRow.size(),expectedRows);
    }

    @When("change item per page to {string}")
    public void changeItemPerPageTo(String itemPerPage) {
        selectFromDropDown(AccountsPageObject.ITEM_PER_PAGE_SELECT, "Show " + itemPerPage);
    }
}