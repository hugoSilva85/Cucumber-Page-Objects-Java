package br.PageObjects;

/**Objects of Taskpage

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {

	// The div that has contains name of owner tasks
	@FindBy(xpath = "/html/body/div[1]/h1")
	private WebElement nameOfOwnerTasks;

	// the input to add a new name task
	@FindBy(xpath = "//input[@id='new_task']")
	private WebElement newTasksinput;

	// the button to add a new task
	@FindBy(xpath = "//div[2]/span")
	private WebElement newTaskbtn;

	// The row of each register
	@FindBy(xpath = "//a[contains(@href, '#')]")
	private List<WebElement> tableContains;

	// Manage button to create a new subtask
	@FindBy(xpath = "//td[4]/button")
	private WebElement addNewSubTask;

	// button to remove one subtask
	@FindBy(xpath = "//button[@class='btn btn-xs btn-danger']")
	private WebElement removeSubTask;

	// button to logout
	@FindBy(xpath = "//a[contains(@href, '/users/sign_out')]")
	private WebElement logoutbtn;

	// the first element of Table
	@FindBy(xpath = "//td[2]/a")
	private WebElement valueOfFirstElementOfTable;

	/* below the getters of attributes above */

	public WebElement getValueOfFirstElementOfTable() {
		return valueOfFirstElementOfTable;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getNameOfOwnerTasks() {
		return nameOfOwnerTasks;
	}

	public WebElement getNewTasksinput() {
		return newTasksinput;
	}

	public WebElement getNewTaskbtn() {
		return newTaskbtn;
	}

	public List<WebElement> getTableContains() {
		return tableContains;
	}

	public WebElement getAddNewSubTask() {
		return addNewSubTask;
	}

	public WebElement getRemoveSubTask() {
		return removeSubTask;
	}

}
