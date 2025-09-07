package POMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutCompletePage
{
    @FindBy(xpath="//h2[@class='complete-header']") private WebElement CheckoutCompletemsg;

    public SwagLabsCheckoutCompletePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public String getSwagLabsCheckoutCompletePageMsg()
    {
        String actMsg = CheckoutCompletemsg.getText();
        return actMsg;
    }

}
