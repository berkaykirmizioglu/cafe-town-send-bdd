package bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:cafetownsend.employees.page")
public class EmployeesPage extends PageObject {

    public static final By GREETINGS_LABEL = By.id("greetings");
    public static final By CREATE_BUTTON = By.id("bAdd");
    public static final By EDIT_BUTTON = By.id("bEdit");
    public static final By DELETE_BUTTON = By.id("bDelete");

    // New - Edit
    public static final By ADD_BUTTON = By.xpath("//button[contains(text(),'Add')]");
    public static final By UPDATE_BUTTON = By.xpath("//button[contains(text(),'Update')]");
    public static final By FIRST_NAME = By.xpath("//input[@ng-model='selectedEmployee.firstName']");
    public static final By LAST_NAME = By.xpath("//input[@ng-model='selectedEmployee.lastName']");
    public static final By START_DATE = By.xpath("//input[@ng-model='selectedEmployee.startDate']");
    public static final By EMAIL = By.xpath("//input[@ng-model='selectedEmployee.email']");
}