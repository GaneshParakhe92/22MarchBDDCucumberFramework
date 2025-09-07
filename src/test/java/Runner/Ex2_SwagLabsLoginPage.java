package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\src\\test\\java\\Features\\Ex2_SwagLabsLoginFunctionality.feature",
        glue = {"Steps","Hooks"}


)
public class Ex2_SwagLabsLoginPage extends AbstractTestNGCucumberTests {
}
