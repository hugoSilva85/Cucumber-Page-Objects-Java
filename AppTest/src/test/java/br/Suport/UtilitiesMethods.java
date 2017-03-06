package br.Suport;

/**Class of support methods

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import br.PageObjects.TaskPage;

public class UtilitiesMethods {

	static TaskPage taskPage = new TaskPage();
	
	// Method to create a implicitWait between methods
	public static boolean implicitWait(long time) {
		try {
			Driver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			System.out.println("Waited for " + time + " sec implicitly");

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	//Method to Open and maximize the web Browser
	public static boolean openBrowser(String url) {
		try {
			Driver.driver.get(url);
			Driver.driver.manage().window().maximize();
			System.out.println("Browser opened successfully");

		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	//Method to search one value inside the table
	public static  WebElement searchTable(String searchTable) {
		for (WebElement i : taskPage.getTableContains()) {
			if (i.getText().equals(searchTable)) {
				return i;
			}
		}
		return null;
	}	


}
