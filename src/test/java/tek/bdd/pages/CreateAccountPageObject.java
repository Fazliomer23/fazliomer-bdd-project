package tek.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPageObject {
    public static final By CREATE_PRIMARY_ACCOUNT_LINK = By.linkText("Create Primary Account");
    public static final By CREATE_PRIMARY_ACCOUNT_HOLDER_TILE = By.xpath("//h2[text()='Create Primary Account Holder']");
    public static final By EMAIL_INPUT = By.name("email");
    public static final By PREFIX_SELECT = By.name("title");
    public static final By FIRST_NAME_INPUT = By.name("firstName");
    public static final By LAST_NAME_INPUT = By.name("lastName");
    public static final By GENDER_SELECT = By.name("gender");
    public static final By MARITAL_STATUS_SELECT = By.name("maritalStatus");
    public static final By EMPLOYMENT_STATUS = By.name("employmentStatus");
    public static final By DATE_OF_BIRTH = By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[text()='Create Account']");

    public static final By SIGN_UP_YOUR_ACCOUNT_TITLE = By.xpath("//h2[text()='Sign up your account']");

    public static final By USER_FULL_NAME = By.xpath("//div[@id='root']/div/div[2]//div[contains(@class, 'chakra-stack')]/h2[2]");
    public static final By USER_EMAIL_ADDRESS_TITLE = By.xpath("//div[@id='root']/div/div[2]//div[contains(@class, 'chakra-stack')]/h2[3]");

    public static final By USERNAME_INPUT = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By CONFIRM_PASSWORD_INPUT = By.name("confirm");
    public static final By SUBMIT_BUTTON = By.xpath("//button[text()='Submit']");

    public static final By ERROR_MESSAGE = By.xpath("//div[text()='ERROR']");



}
