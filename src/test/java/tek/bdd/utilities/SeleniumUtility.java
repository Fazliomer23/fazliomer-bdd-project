package tek.bdd.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(Constants.WAIT_IN_SECONDS));
    }

    private WebElement waitForVisibilityOf(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendText(By locator, String value) {
        waitForVisibilityOf(locator).sendKeys(value);
    }

    public String getElementText(By locator) {
        return waitForVisibilityOf(locator).getText();
    }

    public boolean isElementIsEnabled(By locator) {
        return waitForVisibilityOf(locator).isEnabled();
    }

    public boolean isElementIsDisplayed(By locator) {
        return waitForVisibilityOf(locator).isDisplayed();
    }

    public void selectFromDropDown(By locator, String visibleText) {
        WebElement element = waitForVisibilityOf(locator);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static String getCurrentDate(){
        LocalDate localDate = Instant.now().atZone(ZoneId.of("America/New_York")).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        return formatter.format(localDate);
    }

    public static String getExpireDate(){
        LocalDate localDate = Instant.now().atZone(ZoneId.of("America/New_York")).plusDays(1).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        return formatter.format(localDate);
    }

}
