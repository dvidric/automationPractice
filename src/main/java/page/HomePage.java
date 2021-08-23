package page;

import jdk.nashorn.internal.ir.LiteralNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    private By POPULAR_PRODUCTS = By.xpath("//ul[@id='homefeatured']/descendant::div[@class='product-container']");
    private By BESTSELLER_PRODUCTS = By.xpath("//ul[@id='blockbestsellers']/descendant::div[@class='product-container']");
    private By BESTSELLER_TAB = By.xpath("//a[contains(.,'Best Sellers')]");
    private By SEARCH = By.xpath("//input[@id='search_query_top']");
    private By SUBMIT_SEARCH = By.xpath("//button[@name='submit_search']");

    private By PRODUCT_LIST_GRID = By.xpath("//ul[@class='product_list grid row']");
    private By PRODUCTS_LIST = By.xpath("//ul[@class='product_list grid row']/descendant::a[@class='product-name']");
    private By FIRST_PRODUCT = By.xpath("//div[@class='product-container']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List getPopularProducts(){
       return findAll(POPULAR_PRODUCTS);
    }

    public List getBestsellerProducts(){
       return findAll(BESTSELLER_PRODUCTS);
    }

    public void goToBestseller(){
        click(BESTSELLER_TAB);
    }

    public void searchTerm(String text){
        input(SEARCH, text);
        click(SUBMIT_SEARCH);
        wait_element_to_appear(PRODUCT_LIST_GRID);
    }

    public ArrayList<String> getProductTitles(){
        List<WebElement> list = findAll(PRODUCTS_LIST);
        ArrayList<String> titles = new ArrayList<String>();
        for(WebElement item : list) {
           titles.add(item.getText());
        }
        return titles;
    }

    public void openFirstProduct(){
        click(FIRST_PRODUCT);
    }


}
