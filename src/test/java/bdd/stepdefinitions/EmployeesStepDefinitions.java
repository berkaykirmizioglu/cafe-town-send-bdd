package bdd.stepdefinitions;

import bdd.steps.EmployeesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeesStepDefinitions {

    EmployeesSteps employeesSteps;

    List<Map<String,String>> records = new ArrayList<>();

    @Then("^s?he should see greetings message as \"(.*)\"$")
    public void shouldSeeGreetingsMessageAs(String message) {

        MatcherAssert.assertThat(message,
                                Matchers.equalTo(employeesSteps.getGreetingsMessage()));
    }

    @And("^s?he creates a new record with followings:$")
    public void createRecord(List<Map<String,String>> recordDetails) {

        records = recordDetails;

        employeesSteps.clickToCreateButton()
                      .fillRecordForm(
                              recordDetails.get(0).get("FirstName"),
                              recordDetails.get(0).get("LastName"),
                              recordDetails.get(0).get("StartDate"),
                              recordDetails.get(0).get("Email")
                      )
                      .clickToAddButton();
    }


    @Then("^s?he should see the record in employees list$")
    public void shouldSeeRecordInEmployeesList() {

        boolean isRecordExist = employeesSteps.isRecordExistInEmployeesList(records.get(0).get("FirstName"),
                                                                            records.get(0).get("LastName"));

        MatcherAssert.assertThat(isRecordExist, Matchers.is(true));
    }

    @And("^s?he updates a record with followings:$")
    public void updateRecord(List<Map<String,String>> recordDetails) {

        records = recordDetails;

        employeesSteps.clickRecordInEmployeesList(records.get(0).get("FirstName"),
                                                  records.get(0).get("LastName"));

        employeesSteps.clickToEditButton()
                      .fillRecordForm(
                              recordDetails.get(0).get("FirstName"),
                              recordDetails.get(0).get("LastName"),
                              recordDetails.get(0).get("StartDate"),
                              recordDetails.get(0).get("Email")
                      )
                      .clickToUpdateButton();
    }
}
