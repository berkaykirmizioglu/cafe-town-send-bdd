package bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithByLocator;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:cafetownsend.login.page")
public class LoginPage extends PageObject {

    public static final By USERNAME_FIELD = By.xpath("//input[@ng-model='user.name']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@ng-model='user.password']");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@class='main-button']");
}