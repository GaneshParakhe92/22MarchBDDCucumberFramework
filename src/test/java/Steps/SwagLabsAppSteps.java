package Steps;
import LibraryFiles.DriverFactory;
import LibraryFiles.Utilityclass;
import POMClasses.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.io.IOException;
import java.net.URL;

public class SwagLabsAppSteps
{
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabsHomePage home=new SwagLabsHomePage(DriverFactory.driver);
    SwagLabsYourCartPage yourcart=new SwagLabsYourCartPage(DriverFactory.driver);
    SwagLabsCheckoutYourInformationPage yourinfo=new SwagLabsCheckoutYourInformationPage(DriverFactory.driver);
    SwagLabsCheckoutOverviewPage overview=new SwagLabsCheckoutOverviewPage(DriverFactory.driver);
    SwagLabsCheckoutCompletePage checkoutcomplete=new SwagLabsCheckoutCompletePage(DriverFactory.driver);

    @Given("user is on Swag Labs login page")
    public void user_is_on_swag_labs_login_page() throws IOException
    {
        String url = Utilityclass.getPFData("URL");
        DriverFactory.driver.get(url);
    }

    @When("user enter username on Swag Labs login page {string}")
    public void user_enter_username_on_swag_labs_login_page(String unvalue)
    {
        login.inpSwagLabLoginPageUsername(unvalue);
    }

    @When("user enter password on Swag Labs login page {string}")
    public void user_enter_password_on_swag_labs_login_page(String pwdvalue)
    {
        login.inpSwagLabLoginPagePassword(pwdvalue);
    }

    @When("user click on login btn on Swag Labs login page")
    public void user_click_on_login_btn_on_swag_labs_login_page()
    {
        login.clickSwagLabLoginPageLoginBtn();
    }

    @Then("user home page with logo text {string}")
    public void user_home_page_with_logo_text(String expLogoText)
    {
        String actLogoText=home.getSwagLabsHomePageLogoText();
        Assert.assertEquals(expLogoText,actLogoText,"Failed act and exp logotext mismatch");
    }
    @Then("User can see error massage {string}")
    public void user_can_see_error_massage(String expErrorMsg)
    {
        String actErrorMsg=login.getSwagLabsLoginPageErrorMsg();
        Assert.assertEquals(expErrorMsg,actErrorMsg,"Failed act and exp are mismatch");
    }

    @Then("User can see {int} product on home page")
    public void user_can_see_product_on_home_page(Integer expProductCount)
    {
      Integer actProductCount=home.getSwagLabsHomePageProductCount();
      Assert.assertEquals(expProductCount,actProductCount,"Failed act and exp are diff");
    }
    @Then("Price of Sauce Labs Backpack Product should {double}")
    public void price_of_sauce_labs_backpack_product_should(Double expProductPrice)
    {
        double actprice = home.getSwagLabsHomePagebackpackProductPrice();
        Assert.assertEquals(expProductPrice,actprice,"Failed act and exp are mismatch");
    }

    @Then("Total price of all product should {double}")
    public void total_price_of_all_product_should(Double expTotalProductPrice)
    {
        double actTotalPrice = home.getSwagLabsHomePageTotalProductPrice();
        Assert.assertEquals(expTotalProductPrice,actTotalPrice,"Failed act and exp are mismatch");
    }

    @When("user click on Add to cart option for Product SwagLabsBackpack")
    public void user_click_on_add_to_cart_option_for_product_swag_labs_backpack()
    {
        home.clickSwagLabsHomePageAddtocartOption();
    }

    @When("user click on cart option")
    public void user_click_on_cart_option()
    {
        home.clickSwagLabsHomecartOption();
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button()
    {
        yourcart.clickSwagLabsYourCartPageCheckout();
    }

    @When("user enter FN as {string}")
    public void user_enter_fn_as(String fn)
    {
        yourinfo.inpSwagLabsCheckoutYourInformationPageFN(fn);
    }

    @When("user enter LN as {string}")
    public void user_enter_ln_as(String ln)
    {
        yourinfo.inpSwagLabsCheckoutYourInformationPageLN(ln);
    }

    @When("user enter pin code as {int}")
    public void user_enter_pin_code_as(Integer pincode)
    {
        String Stringpincode = Integer.toString(pincode);
        yourinfo.inpSwagLabsCheckoutYourInformationPagePinCode(Stringpincode);
    }


    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        yourinfo.clickSwagLabsCheckoutYourInformationPageContinueBtn();
    }

    @When("user click on finish button")
    public void user_click_on_finish_button()
    {
        overview.clickSwagLabsCheckoutOverviewPagefinishBtn();
    }

    @Then("order place message {string} should be visible")
    public void order_place_message_should_be_visible(String expMsg)
    {
        String actMsg=checkoutcomplete.getSwagLabsCheckoutCompletePageMsg();
        Assert.assertEquals(expMsg,actMsg,"Failed act and exp are checkout complete message is diff");
    }

}
