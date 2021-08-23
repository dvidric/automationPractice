package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPopupPage extends BasePage {


    public CheckoutPopupPage(WebDriver driver) {
        super(driver);
    }

    private By ATTRIBUTES = By.xpath("//span[@id='layer_cart_product_attributes']");
    private By QUANTITY = By.xpath("//span[@id='layer_cart_product_quantity']");
    private By PROCEED_TO_CHECKOUT = By.xpath("//a[@title='Proceed to checkout']");
    private By CART_SUMMARY_TITLE = By.id("cart_title");

    public String getCartAttributes(){
        return find(ATTRIBUTES).getText();
    }

    public String getQuantity(){
        wait_element_to_appear(QUANTITY);
        return find(QUANTITY).getText();
    }

    public String getColor(){
        String[] parts = getCartAttributes().split(",");
        String part1 = parts[0];
        return part1.trim();
    }

    public String getSize(){
        String[] parts = getCartAttributes().split(",");
        String part2 = parts[1];
        return part2.trim();

    }
    public void proceedToCheckOut(){
        click(PROCEED_TO_CHECKOUT);
        wait_element_to_appear(CART_SUMMARY_TITLE);
    }
}
