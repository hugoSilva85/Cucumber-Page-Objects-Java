package br.AppTest;

/**Class of process of Create a new Task 

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.PageObjects.MainPage;
import br.PageObjects.TaskPage;
import br.Suport.Driver;
import br.Suport.UtilitiesMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingTask {
	static TaskPage taskpage;
	static MainPage mainPage;

	// Initial method that compare if name list belongs to login user
	@Then("^I should see one message on the top part saying that list belongs to me$")
	public void i_should_see_one_message_on_the_top_part_saying_that_list_belongs_to_me() {
		taskpage = PageFactory.initElements(Driver.driver, TaskPage.class);
		mainPage = PageFactory.initElements(Driver.driver, MainPage.class);
		Assert.assertEquals("Hugo Pereira Silva's ToDo List", taskpage.getNameOfOwnerTasks().getText());

	}

	// Method to fill the input task
	@When("^I fill the input task \"([^\"]*)\"$")
	public void i_fill_the_input_task(String NomeTask) {
		taskpage.getNewTasksinput().sendKeys(NomeTask);
		UtilitiesMethods.implicitWait(5);

	}

	// Method to click in button
	@When("^click in button to add value$")
	public static void click_in_button_to_add_value() {
		taskpage.getNewTaskbtn().click();
		UtilitiesMethods.implicitWait(5);

	}

	// This method compare parameter of created name subtask with text of
	// element inside the table
	@Then("^the value should appear on table bellow as task\"([^\"]*)\"$")
	public void the_value_should_appear_on_table_bellow_as_task(String valueOftaskCreated) {
		Assert.assertEquals(valueOftaskCreated, taskpage.getValueOfFirstElementOfTable().getText());
		UtilitiesMethods.implicitWait(5);

	}

	// Method to click signout
	@When("^I click on signout$")
	public void i_click_on_signout() {
		taskpage.getLogoutbtn().click();
		UtilitiesMethods.implicitWait(5);

	}

	// Method to compare message sign out and close the app
	@Then("^I out of web app I need see message\"([^\"]*)\"$")
	public void i_out_of_web_app_I_need_see_message(String messageValueLogOut) {
		Assert.assertEquals(messageValueLogOut, mainPage.getDivSignedSuccessfully().getText());

	}

	// Method to compare if appears the message to user and after close
	@Then("^I can see a message displayed to John \"([^\"]*)\"$")
	public void i_can_see_a_message_displayed_to_John(String messageToJohn) {
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(), \"" + messageToJohn + ")]\"")));
		Driver.driver.close();
	}

}
