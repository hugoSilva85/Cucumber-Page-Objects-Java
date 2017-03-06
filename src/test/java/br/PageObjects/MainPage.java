package br.PageObjects;

/**Objects of Main page after login

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	// The div with a message in main page after login
	@FindBy(xpath = "//body/div/div[2]")
	private WebElement divSignedSuccessfully;

	// button of Mytasks in main page access
	@FindBy(xpath = "//a[contains(@href, '/tasks')]")
	private WebElement myTasksbtn;

	/* below the getter of attributes above */

	public WebElement getDivSignedSuccessfully() {
		return divSignedSuccessfully;
	}

	public WebElement getMyTasksbtn() {
		return myTasksbtn;
	}

}
