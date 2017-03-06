package br.AppTest;

/**Class of process of Navagate between the pages

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import br.PageObjects.MainPage;
import br.Suport.Driver;
import br.Suport.UtilitiesMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateMyTasks {
	static MainPage mainPage;
	
	//Method intial
	@Given("^I am on the main Page$")
	public void i_am_on_the_main_Page() {
		mainPage = PageFactory.initElements(Driver.driver, MainPage.class);

	}

	//Method to click in navbar
	@When("^I click on \"([^\"]*)\" link on the NavBar I should to navigate to another page to create a task$")
	public void i_click_on_link_on_the_NavBar_I_should_to_navigate_to_another_page_to_create_a_task(String arg1) {
		mainPage.getMyTasksbtn().click();
		UtilitiesMethods.implicitWait(5);

	}
	//Method to compare a url with one model 
	@Then("^I navigate to create a task page$")
	public void i_navigate_to_create_a_task_page() {
		Assert.assertTrue(Driver.driver.getCurrentUrl().equals("http://qa-test.avenuecode.com/tasks"));
		UtilitiesMethods.implicitWait(5);

	}


}
