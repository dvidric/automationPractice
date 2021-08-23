package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    private By EMAIL = By.id("email_create");
    private By CREATE_BUTTON = By.id("SubmitCreate");

    public void goToCreateAnAccount(String email){
        wait_element_to_appear(EMAIL);
        enterEmail(email);
        clickCreateAnAccount();
    }

    public void enterEmail(String email){
        input(EMAIL, email);
    }

    public void clickCreateAnAccount(){
        click(CREATE_BUTTON);
    }
}
