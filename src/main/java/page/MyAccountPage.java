package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage{


    private By SIGN_OUT = By.xpath("//a[@class='logout']");
    private By LOGO = By.xpath("//a[@href='http://automationpractice.com/']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifySignOut(){

       return find(SIGN_OUT).isDisplayed();
    }

    public void goToHomePage(){
        click(LOGO);
    }
}
