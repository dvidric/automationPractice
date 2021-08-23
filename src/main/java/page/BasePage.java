package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BasePage  {

    protected WebDriver driver;
    private WebDriverWait wait;
    private int TIMEOUT = 10;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT);
    }


    protected WebElement find(By locator){
       WebElement el =  driver.findElement(locator);
       return el;
    }

    protected List findAll(By locator){
        List<WebElement> list = driver.findElements(locator);
        return list;
    }

    protected void click(By locator){
        driver.findElement(locator).click();
    }

    protected void input(By locator, String text){
       WebElement el = driver.findElement(locator);
       el.clear();
       el.sendKeys(text);
    }

    protected void select(By locator, String value){
        Select select = new Select(find(locator));
        select.selectByValue(value);
    }

    protected void wait_element_to_appear(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void wait_element_to_be_clickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
