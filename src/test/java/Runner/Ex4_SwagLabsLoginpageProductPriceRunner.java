package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\src\\test\\java\\Features\\Ex4_SwagLabsLoginpageProductPrice.feature",
        glue = {"Steps","Hooks"},
        plugin = {"pretty","html:C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\Reports\\productpricereport.html"}
)
public class Ex4_SwagLabsLoginpageProductPriceRunner extends AbstractTestNGCucumberTests
{
}
