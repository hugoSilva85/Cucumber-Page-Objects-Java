package br.AppTest;

/**Class to Runner tests

 * @author Hugo Pereira Silva

 * @version 1.0
 

 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/cucumber"},
		features = "src/test/resources"
		)
public class RunnerTest {

}
