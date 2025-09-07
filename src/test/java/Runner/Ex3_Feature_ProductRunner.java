package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\src\\test\\java\\Features\\EX3_Product Features.feature",
        glue={"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\Reports\\FeatureProduct.html"}

)
public class Ex3_Feature_ProductRunner extends AbstractTestNGCucumberTests {
}
