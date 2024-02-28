package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\SeleniumPRJEvng\\Ebanking\\src\\feature\\Login.feature",
		                    "D:\\SeleniumPRJEvng\\Ebanking\\src\\feature\\Role.feature"},
                          glue="stepdefination",monochrome=true,
                          plugin={"pretty","json:Target/Login/RoleRes.json"})
public class LoginRunner
{

}
