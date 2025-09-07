package LibraryFiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilityclass
{
    public static String getPFData(String key) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\ganes\\IdeaProjects\\22MarchBDDCucumberFramework\\src\\main\\java\\LibraryFiles\\propertyFile.properties");
        Properties p=new Properties();
        p.load(file);
        String value = p.getProperty(key);
        return value;

    }
}
