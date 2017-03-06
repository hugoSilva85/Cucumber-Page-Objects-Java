package br.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {

	// the first element of Table
	@FindBy(xpath = "// ul[2]/li/a")
	private WebElement loginPagebtn;

	/* below the getters of attributes above */

	public WebElement getloginPagebtn() {
		return loginPagebtn;
	}

}
