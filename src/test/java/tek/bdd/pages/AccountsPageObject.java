package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utilities.SeleniumUtility;

public class AccountsPageObject extends SeleniumUtility {

    public static final By ACCOUNTS_BUTTON = By.linkText("Accounts");
    public static final By PRIMARY_ACCOUNT_TITLE = By.xpath("//h2[text()='Primary Accounts']");

    public static final By TABLE_ROW_ELEMENT = By.xpath("//table/tbody/tr");

    public static final By ITEM_PER_PAGE_SELECT = By.xpath("//table/following-sibling::div//select");

}
