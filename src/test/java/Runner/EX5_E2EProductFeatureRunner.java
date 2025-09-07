package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\src\\test\\java\\Features\\Ex5_E2E_Product_feature.feature",
        glue = {"Steps","Hooks"},
        plugin = {"pretty","html:C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\Reports\\E2EProductOrderReport.html"}

)
public class EX5_E2EProductFeatureRunner extends AbstractTestNGCucumberTests
{
}
