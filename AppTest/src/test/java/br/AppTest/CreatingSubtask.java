package br.AppTest;

/**Class of process of Create a new SubTask 

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import br.PageObjects.SubTaskPage;
import br.PageObjects.TaskPage;
import br.Suport.Driver;
import br.Suport.UtilitiesMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingSubtask {
	static SubTaskPage subtaskpage;
	static TaskPage taskPage;
	
	//First method to initial 
	@Given("^I am page of task$")
	public void i_am_page_of_task() {
		subtaskpage = PageFactory.initElements(Driver.driver, SubTaskPage.class);
		taskPage = PageFactory.initElements(Driver.driver, TaskPage.class);

	}
	//Method to select a task and click on manage Subtask
	@When("^I select one task and click on Manage Subtasks$")
	public void i_select_one_task_and_click_on_Manage_Subtasks() {
		taskPage.getAddNewSubTask().click();
		UtilitiesMethods.implicitWait(5);

	}
	//Method to take the modal and get text of father task
	@Then("^should be open a new modal to create a new subtask$")
	public void should_be_open_a_new_modal_to_create_a_new_subtask() {
		subtaskpage.getNameOfTheSelectedTask().getText();
		UtilitiesMethods.implicitWait(5);

	}
	//Method returns the Id of the father Task
	@Then("^should be the  task ID with a correct selection$")
	public void should_be_the_task_ID_with_a_correct_selection() {
		subtaskpage.getNameOfTheSelectedTask().getText();
		UtilitiesMethods.implicitWait(5);

	}
	//Method to clean and fill name value to subtask
	@When("^I fill Subtask Description with  \"([^\"]*)\"$")
	public void i_fill_Subtask_Description_with(String valueNameOfSubtask) {
		subtaskpage.getNewSubTasksinput().clear();
		subtaskpage.getNewSubTasksinput().sendKeys(valueNameOfSubtask);
		UtilitiesMethods.implicitWait(5);

	}
	
	//Method to clean and fill correct date
	@When("^fill the due date with \"([^\"]*)\"$")
	public void fill_the_due_date_with(String valueDateNameOfSubtask) {
		subtaskpage.getNewDateinput().clear();
		subtaskpage.getNewDateinput().sendKeys(valueDateNameOfSubtask);
		UtilitiesMethods.implicitWait(5);

	}
	//Method to click in add button
	@When("^I click in Add$")
	public void i_click_in_Add() {
		subtaskpage.getNewTaskbtn().click();
		UtilitiesMethods.implicitWait(5);

	}
	//This method compare parameter with text of element 
	@Then("^the value \"([^\"]*)\" should appear on table bellow as Subtask because this is the limit$")
	public void the_value_should_appear_on_table_bellow_as_Subtask_because_this_is_the_limit(
			String valueOfCreatedElement) {
		Assert.assertEquals(valueOfCreatedElement, subtaskpage.getValueOfFirstElementOfTable().getText());

	}
	//Close modal opened in TaskPage
	@When("^I close the modal$")
	public void i_close_the_modal() {
		subtaskpage.getCloseTheModal().click();
		UtilitiesMethods.implicitWait(5);

	}

	//This method compare parameter of created name subtask with text of element inside the table
	@Then("^when I see Manage Subtasks should be have one subtask inside \"([^\"]*)\"$")
	public void when_I_see_Manage_Subtasks_should_be_have_one_subtask_inside(String valueOfSubtaskCreated){	
		Assert.assertEquals(valueOfSubtaskCreated, taskPage.getAddNewSubTask().getText());
		UtilitiesMethods.implicitWait(5);
		
	
	}
	//This method compare the limit created with 250 characters
	@Then("^the value \"([^\"]*)\" should appear on table bellow as Subtask with limit of Two hundred characters$")
	public void the_value_should_appear_on_table_bellow_as_Subtask_with_limit_of_Two_hundred_characters(String valueOfSubtaskCreated)  {
		System.out.println(subtaskpage.getValueOfFirstElementOfTable().getText());
		Assert.assertNotEquals(valueOfSubtaskCreated, subtaskpage.getValueOfFirstElementOfTable().getText());
		UtilitiesMethods.implicitWait(5);
	}

}
