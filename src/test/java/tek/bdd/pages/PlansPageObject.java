package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.utilities.SeleniumUtility;

public class PlansPageObject extends SeleniumUtility {

    public static final By PLANS_ICON = By.linkText("Plans");
    public static final By PLAN_TYPE = By.xpath("//th[text()='Plan Type']");
    public static final By PLAN_BASE_PRICE = By.xpath("//th[text()='Plan Base Price']");
    public static final By DATE_CREATED = By.xpath("//th[text()='Date Created']");
    public static final By DATE_EXPIRE = By.xpath("//th[text()='Date Expire']");
}
