package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    private By TWEET = By.xpath("//button[contains(.,'Tweet')]");
    private By PINTEREST = By.xpath("//button[contains(.,'Pinterest')]");
    private By SHARE = By.xpath("//button[contains(.,'Share')]");
    private By GOOGLE = By.xpath("//button[contains(.,'Google+')]");
    private By DISCOUNT = By.xpath("//span[contains(.,'-5%')]");
    private By QUANTITY = By.xpath("//input[@id='quantity_wanted']");
    private By SIZE = By.xpath("//select[@id='group_1']");
    private By BLUE_COLOR = By.xpath("//a[@id='color_14']");
    private By PROCEED_TO_CHECKOUT = By.name("Submit");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyTweet(){
        return find(TWEET).isDisplayed();
    }

    public boolean verifyPinterest(){
        return find(PINTEREST).isDisplayed();
    }

    public boolean verifyShare(){
        return find(SHARE).isDisplayed();
    }

    public boolean verifyGooglePlus(){
        return find(GOOGLE).isDisplayed();
    }

    public boolean verifyDiscount(){
        return find(DISCOUNT).isDisplayed();
    }

    public void changeQuantity(String text){
        input(QUANTITY, text);
    }

    public  void changeSize(String value){
        select(SIZE, value);
    }

    public void changeColor(){
        click(BLUE_COLOR);
    }

    public void addToCard(){
        click(PROCEED_TO_CHECKOUT);
    }
}
