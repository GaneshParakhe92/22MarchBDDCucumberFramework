package POMClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SwagLabsHomePage
{
    @FindBy(xpath="//div[text()='Swag Labs']") private WebElement logo;
    @FindBy(xpath="//div[@class='inventory_item_name ']") private List<WebElement> allproduct;
    @FindBy(xpath="(//div[@class='inventory_item_price'])[1]") private WebElement backpackProductPrice;
    @FindBy(xpath="(//div[@class='inventory_item_price'])") private  List<WebElement> allProductPrice;
    @FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory '])[1]") private WebElement Addtocard;
    @FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartOption;

   public SwagLabsHomePage(WebDriver driver)
   {
       PageFactory.initElements(driver,this);
   }
   public String getSwagLabsHomePageLogoText()
   {
       String actLogoText = logo.getText();
       return actLogoText;
   }
   public int getSwagLabsHomePageProductCount()
   {
       int actProductCount = allproduct.size();
       return actProductCount;
   }
   public double getSwagLabsHomePagebackpackProductPrice()
   {
       String price = backpackProductPrice.getText();
       price=price.substring(1);
       double actprice = Double.parseDouble(price);
       return actprice;
   }
   public double getSwagLabsHomePageTotalProductPrice()
   {
       double actTotalPrice = 0.0;
       for(WebElement s1:allProductPrice)
       {
           String text = s1.getText();
           text=text.substring(1);
           double price = Double.parseDouble(text);
           actTotalPrice=actTotalPrice+price;
       }
       return actTotalPrice;
   }

   public void clickSwagLabsHomePageAddtocartOption()
   {
       Addtocard.click();
   }

   public void clickSwagLabsHomecartOption()
   {
       cartOption.click();
   }


}
