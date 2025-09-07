package POMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutYourInformationPage
{
    @FindBy(xpath="(//input[@class='input_error form_input'])[1]") private WebElement FN;
    @FindBy(xpath="(//input[@class='input_error form_input'])[2]") private WebElement LN;
    @FindBy(xpath="(//input[@class='input_error form_input'])[3]") private WebElement pincode;
    @FindBy(xpath="//input[@name='continue']") private WebElement ContinueBtn;

    public SwagLabsCheckoutYourInformationPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void inpSwagLabsCheckoutYourInformationPageFN(String firstname)
    {
        FN.sendKeys(firstname);
    }
    public void inpSwagLabsCheckoutYourInformationPageLN(String lastname)
    {
        LN.sendKeys(lastname);
    }
    public void inpSwagLabsCheckoutYourInformationPagePinCode(String pincodevalue)
    {
        pincode.sendKeys(pincodevalue);
    }
    public void clickSwagLabsCheckoutYourInformationPageContinueBtn()
    {
        ContinueBtn.click();
    }

}
