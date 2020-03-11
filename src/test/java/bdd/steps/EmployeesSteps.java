package bdd.steps;

import bdd.pages.EmployeesPage;
import bdd.utils.wait.PageWaits;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TestFailureException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmployeesSteps extends UIInteractionSteps {

    @Step("Get the greetings message text.")
    public String getGreetingsMessage() {

        new PageWaits().waitForPageToCompleteState(getDriver());
        return $(EmployeesPage.GREETINGS_LABEL).getText().trim();
    }

    @Step("Click to Create button.")
    public EmployeesSteps clickToCreateButton() {

        $(EmployeesPage.CREATE_BUTTON).click();
        return this;
    }

    @Step("Fill record form as -> First Name: {0} - Last Name: {1} - Start Date: {2} - Email: {3}")
    public EmployeesSteps fillRecordForm(String firstName, String lastName, String startDate, String email) {

        $(EmployeesPage.FIRST_NAME).typeAndTab(firstName);
        $(EmployeesPage.LAST_NAME).typeAndTab(lastName);
        $(EmployeesPage.START_DATE).typeAndTab(startDate);
        $(EmployeesPage.EMAIL).type(email);
        return this;
    }

    @Step("Click to Add button.")
    public void clickToAddButton() {

        $(EmployeesPage.ADD_BUTTON).click();
    }

    @Step("Check the firstName and lastName in the employees list: {0} {1}")
    public boolean isRecordExistInEmployeesList(String firstName, String lastName){

        List<WebElement> employees = getEmployees();

        for(WebElement employee : employees){

            if (employee.getText().contains(firstName + " " + lastName)){
                return true;
            }
        }
        return false;
    }


    @Step("Check the firstName and lastName in the employees list and click: {0} {1}")
    public EmployeesSteps clickRecordInEmployeesList(String firstName, String lastName){

        List<WebElement> employees = getEmployees();

        for(WebElement employee : employees){

            if (employee.getText().contains(firstName + " " + lastName)){
                employee.click();
            }
        }
        return this;
    }


    private List<WebElement> getEmployees(){
        new PageWaits().waitForPageToCompleteState(getDriver());
        List<WebElement> employees = getDriver().findElements(By.id("employee-list"));
        return employees;
    }


    @Step("Click to Edit button.")
    public EmployeesSteps clickToEditButton() {

        $(EmployeesPage.EDIT_BUTTON).click();
        return this;
    }

    @Step("Click to Update button.")
    public EmployeesSteps clickToUpdateButton() {

        $(EmployeesPage.UPDATE_BUTTON).click();
        return this;
    }
}