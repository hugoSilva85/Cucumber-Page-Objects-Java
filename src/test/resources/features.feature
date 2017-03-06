Feature: Tests in Task and Subtasks

    Scenario: Login in web application
		Given I am on the homepage
		When I fill username "hugo.pereira.silva85@gmail.com" and password "sumica10"
		And press sigin button
		Then I should login in site and show a message "Signed in successfully."
			   
   Scenario: Navigate to link on the NavBar
   		Given I am on the main Page
   		When I click on "MyTask" link on the NavBar I should to navigate to another page to create a task
   		Then I navigate to create a task page
   		
   Scenario: Create Task
   		Given I am on the main Page   		
   		Then I should see one message on the top part saying that list belongs to me
   		When I fill the input task "123"
   		And click in button to add value
   		Then the value should appear on table bellow as task"123"
   		
   Scenario: Create Task with two hundred fifty characters 	
   		When I fill the input task "Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit ullamcorper pulvinar. Vestibulum fermentum tortor"
   		And click in button to add value
   		Then the value should appear on table bellow as task"Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit ullamcorper pulvinar. Vestibulum fermentum tortor"
   		
   Scenario: Create Task with more than two hundred fifty characters 	
   		When I fill the input task "One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections. The bedding was hardly "
   		And click in button to add value
   		Then the value should appear on table bellow as task"One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arche"
   		
 	Scenario: Create a SubTask
		Given I am page of task 
		When I select one task and click on Manage Subtasks 
		Then should be open a new modal to create a new subtask
		And should be the  task ID with a correct selection
		When I fill Subtask Description with  "VAR1"
		And fill the due date with "3/7/2020"
		And I click in Add
		Then the value "VAR1" should appear on table bellow as Subtask because this is the limit 
		When I close the modal
		Then when I see Manage Subtasks should be have one subtask inside "(1) Manage Subtasks" 
		
 	Scenario: Create a SubTask with two hundred fifty characters
		Given I am page of task 
		When I select one task and click on Manage Subtasks 
		Then should be open a new modal to create a new subtask
		And should be the  task ID with a correct selection
		When I fill Subtask Description with  "Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit ullamcorper pulvinar. Vestibulum fermentum tortor"
		And fill the due date with "3/7/2020"
		And I click in Add
		Then the value "Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit ullamcorper pulvinar. Vestibulum fermentum tortor" should appear on table bellow as Subtask because this is the limit 
		When I close the modal
		Then when I see Manage Subtasks should be have one subtask inside "(2) Manage Subtasks"
		
 	Scenario: Create a SubTask with Over than two hundred fifty characters
		Given I am page of task 
		When I select one task and click on Manage Subtasks 
		Then should be open a new modal to create a new subtask
		And should be the  task ID with a correct selection
		When I fill Subtask Description with  "OVER THAN 250 CHARACTERS Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem. Phasellus rhoncus. Aenean id metus id velit ullamcorper pulvinar. Vestibulum fermentum tortor"
		And fill the due date with "3/7/2020"
		And I click in Add
		Then the value "OVER THAN 250 CHARACTERS  Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Nam quis nulla. Integer malesuada. In in enim a arcu imperdiet malesuada. Sed vel lectus. Donec odio urna, tempus molestie, porttitor ut, iaculis quis, sem" should appear on table bellow as Subtask with limit of Two hundred characters 
		When I close the modal
		Then when I see Manage Subtasks should be have one subtask inside "(3) Manage Subtasks"
		
 	Scenario: Log out and close browser
		Given I am page of task 
		When I click on signout
		Then I out of web app I need see message"Signed out successfully."


   	Scenario: Login in web application with john
		Given I am page of task 
		And I click on Sign in 
		When I fill username "John@John.com.br" and password "12345678"
		And press sigin button				
   		When I click on "MyTask" link on the NavBar I should to navigate to another page to create a task
   		Then I can see a message displayed to John "Hey John, this is your todo list for today:"	
		
		
		
 	