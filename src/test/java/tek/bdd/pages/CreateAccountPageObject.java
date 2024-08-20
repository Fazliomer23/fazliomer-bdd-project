package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPageObject {
    public static final By CREATE_PRIMARY_ACCOUNT_LINK = By.linkText("Create Primary Account");
    public static final By CREATE_PRIMARY_ACCOUNT_HOLDER_TILE = By.xpath("Create Primary Account Holder");
    public static final By EMAIL_INPUT = By.name("email");
    public static final By FIRST_NAME_INPUT = By.name("firstName");
    public static final By LAST_NAME_INPUT = By.name("lastName");
    public static final By SELECT_DROPDOWN= By.name("title");
    public static final By SELECT_TITLE = By.xpath("//option[@value='Mr.']");
    public static final By GENDER_INPUT = By.name("gender");
    public static final By GENDER_SELECT = By.xpath("//option[@value='MALE']");
    public static final By MARITAL_STATUS_DROPDOWN= By.name("maritalStatus");
    public static final By MARITAL_STATUS = By.xpath("//option[@value='MARRIED']");
    public static final By EMPLOYMENT_STATUS = By.xpath("employmentStatus");
    public static final By DATE_OF_BIRTH = By.xpath("dateOfBirth");



}
