package br.PageObjects;

/**Objects of login page

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.Suport.UtilitiesMethods;

public class LoginPage {

	// element type input with id in page login
	@FindBy(id = "user_email")
	private WebElement usernameInput;

	// element type input with xpath in page login
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[3]/input")
	private WebElement passwordInput;

	// element type button submit
	@FindBy(name = "commit")
	private WebElement submitBtn;

	// element type link to sign in
	@FindBy(xpath = "//a[contains(@href, '/users/sign_in')]")
	private WebElement signLink;

	// Method to take the name and pass to login, here use a implicitWat to wait
	// one time to response page
	public boolean loginAppTest(String userName, String passWord) {

		try {

			usernameInput.clear();
			usernameInput.sendKeys(userName);
			passwordInput.clear();
			passwordInput.sendKeys(passWord);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// Method to click in signbtn
	public void signinBtn() {
		submitBtn.click();
		UtilitiesMethods.implicitWait(20);

	}

	public WebElement getSignLink() {
		return signLink;
	}

}
