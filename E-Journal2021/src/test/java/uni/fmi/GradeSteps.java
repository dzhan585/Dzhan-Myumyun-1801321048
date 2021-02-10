package uni.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.GradesScreenModel;

public class GradeSteps {
	
	GradesScreenModel gradesScreenModel = new GradesScreenModel();

	@Given("^Teacher opens the home screen to insert the grade$")
	public void openHomeScreen() throws Throwable {
		gradesScreenModel.navigateToMe();
	}

	@When("^Teacher enters his subject$")
	public void enterSubject() throws Throwable {
	    gradesScreenModel.enterSubject();
	}

	@When("^Enters student \"([^\"]*)\"$")
	public void enterStudent(String firstName) throws Throwable {
		gradesScreenModel.enterStudent(firstName);
	}

	@When("^Enters grade \"([^\"]*)\"$")
	public void enterGrade(String grade) throws Throwable {
	    gradesScreenModel.enterGrade(grade);
	}

	@When("^Click add button$")
	public void clickAddButton() throws Throwable {
	    gradesScreenModel.clickAddButton();
	}

	@Then("^See message \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
	    final String resultMessage = gradesScreenModel.checkMessage();
	    assertEquals(message, resultMessage);
	}


	
	

}
