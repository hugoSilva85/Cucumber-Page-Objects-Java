package br.AppTest;

/**Class of process to Login and verification

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.openqa.selenium.support.PageFactory;

import br.PageObjects.LogOutPage;
import br.PageObjects.LoginPage;
import br.PageObjects.MainPage;
import br.Suport.Driver;
import br.Suport.UtilitiesMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTest {
	static LoginPage loginpage;
	static MainPage mainPage;
	static LogOutPage logOutPage;

	// First step get to navigate to login page
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() {
		Driver.driver = Driver.browser("firefox");
		loginpage = PageFactory.initElements(Driver.driver, LoginPage.class);
		mainPage = PageFactory.initElements(Driver.driver, MainPage.class);
		logOutPage = PageFactory.initElements(Driver.driver, LogOutPage.class);
		UtilitiesMethods.openBrowser("http://qa-test.avenuecode.com/users/sign_in");
		UtilitiesMethods.implicitWait(5);

	}

	// Method to call another method to login
	@When("^I fill username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_fill_and(String userName, String passWord) {
		loginpage.loginAppTest(userName, passWord);
		UtilitiesMethods.implicitWait(5);

	}

	// Method to press button login
	@When("^press sigin button$")
	public void press_sigin_button() {
		loginpage.signinBtn();
		UtilitiesMethods.implicitWait(5);

	}

	// Method to compare a login message
	@Then("^I should login in site and show a message \"([^\"]*)\"$")
	public void i_should_login_in_site_and_show_a_message(String welcomeMessage) {
		UtilitiesMethods.implicitWait(1);
		System.out.println(mainPage.getDivSignedSuccessfully().getText());
		Assert.assertEquals(welcomeMessage, mainPage.getDivSignedSuccessfully().getText());
		UtilitiesMethods.implicitWait(5);
	}

	@Given("^I click in sign$")
	public void i_click_in_sign() {
		loginpage.getSignLink().click();
		UtilitiesMethods.implicitWait(5);

	}

	@Given("^I click on Sign in$")
	public void i_click_on_Sign_in() {
		logOutPage.getloginPagebtn().click();
	}

}
