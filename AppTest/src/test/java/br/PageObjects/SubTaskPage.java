package br.PageObjects;

/**Objects of Subtask Modal

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubTaskPage {



	// The text area that contains the father of subtask selected previously
	@FindBy(id = "edit_task")
	private WebElement nameOfTheSelectedTask;

	// the input to add a new name subtask
	@FindBy(id = "new_sub_task")
	private WebElement newSubTasksinput;

	// the input to add a new date
	@FindBy(id = "dueDate")
	private WebElement newDateinput;
	
	// the button to add a new task
	@FindBy(id = "add-subtask")
	private WebElement newTaskbtn;

	// The row of each register name
	@FindBy(xpath = "//td[@class='task_body col-md-8']")
	private List<WebElement> tableContains;
	
	// the first element of Table
	@FindBy(xpath = "//div[2]/table/tbody/tr/td[2]/a")
	private WebElement valueOfFirstElementOfTable;	

	// the button to remove a new task
	@FindBy(xpath = "//button[@class='btn btn-xs btn-danger']")
	private WebElement removeSubTaskbtn;

	// the button to close a modal
	@FindBy(xpath = "//div/div[3]/button")
	private WebElement closeTheModal;
	
	
	/*	below the getters of attributes above  */
	
	public WebElement getValueOfFirstElementOfTable() {
		return valueOfFirstElementOfTable;
	}
	
	public WebElement getNameOfTheSelectedTask() {
		return nameOfTheSelectedTask;
	}

	public WebElement getNewSubTasksinput() {
		return newSubTasksinput;
	}

	public WebElement getNewDateinput() {
		return newDateinput;
	}

	public WebElement getNewTaskbtn() {
		return newTaskbtn;
	}

	public List<WebElement> getTableContains() {
		return tableContains;
	}

	public WebElement getRemoveSubTaskbtn() {
		return removeSubTaskbtn;
	}

	public WebElement getCloseTheModal() {
		return closeTheModal;
	}

}
