package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPageObject {

    public static final By LOGIN_BUTTON = By.linkText("Login");
    public static final By SIGN_IN_TO_YOUR_ACCOUNT_TEXT = By.xpath("//h2[normalize-space()='Sign in to your Account']");
    public static final By USERNAME_INPUT = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[text()='Sign In']");
    public static final By VALIDATE_CUSTOMER_SERVICES_PORTAL = By.xpath("//h2[text()='Customer Service Portal']");
    public static final By ERROR_MESSAGE = By.xpath("//div[text()='ERROR']");



}
