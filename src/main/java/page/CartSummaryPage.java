package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartSummaryPage extends BasePage {

    private By PROCEED = By.xpath("//a[@style][@title='Proceed to checkout']");
    private By SUMMARY_PROCEED = By.xpath("//a[@title='Proceed to checkout']");
    private By PRICE = By.id("total_price");
    private By NAME = By.xpath("(//li[@class='address_firstname address_lastname'])[1]");
    private By EMAIL = By.xpath("(//p[@class='carrier_title'])[1]");
    private By TOS = By.id("uniform-cgv");
    private By BANK_WIRE = By.xpath("//a[@title='Pay by bank wire']");
    private By DISCOUNT = By.xpath("(//span[contains(.,'-5%')])[1]");
    private By CONFIRM_ORDER = By.xpath("//button[@class='button btn btn-default button-medium']");
    private By COMPLETION_TITLE = By.xpath("//strong[contains(.,'Your order on My Store is complete.')]");
    private By PROCESS_ADDRESS = By.name("processAddress");
    private By PROCESS_CARRIER = By.name("processCarrier");

    public CartSummaryPage(WebDriver driver) {
        super(driver);
    }

    public String getPrice() {
        wait_element_to_appear(PRICE);
       return find(PRICE).getText();
    }

    public void processAddress(){
        wait_element_to_appear(PROCESS_ADDRESS);
        click(PROCESS_ADDRESS);
    }

    public void processCarrier(){
        wait_element_to_appear(PROCESS_CARRIER);
        click(PROCESS_CARRIER);
    }

    public void proceedWithCheckout(){
        wait_element_to_appear(PROCEED);
        click(PROCEED);
    }

    public void summaryProceed(){
        wait_element_to_appear(SUMMARY_PROCEED);
        click(SUMMARY_PROCEED);
    }

    public String getBuyerName(){
        wait_element_to_appear(NAME);
        return find(NAME).getText();
    }

    public String getEmail() {
        wait_element_to_appear(EMAIL);
       String[] parts = find(EMAIL).getText().split(":");
       return parts[1].trim();
    }

    public void confirmTOS() {
        wait_element_to_appear(TOS);
        click(TOS);
    }

    public void payByBankWire(){
        wait_element_to_appear(BANK_WIRE);
        click(BANK_WIRE);
    }

    public boolean getDiscount() {
        wait_element_to_appear(DISCOUNT);
        return find(DISCOUNT).isDisplayed();
    }

    public void confirmOrder(){
        wait_element_to_appear(CONFIRM_ORDER);
        click(CONFIRM_ORDER);
    }

    public String getCompletionTitle(){
        wait_element_to_appear(COMPLETION_TITLE);
        return find(COMPLETION_TITLE).getText().trim();
    }

}
