package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

    private By SIGN_IN = By.xpath("//a[contains(.,'Sign in')]");


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void goToSignIn() {
        click(SIGN_IN);
    }


}
