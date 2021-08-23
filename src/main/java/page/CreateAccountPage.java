package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {


    private By TITLE = By.id("id_gender2");
    private By FIRST_NAME = By.id("customer_firstname");
    private By LAST_NAME = By.id("customer_lastname");
    private By PASSWORD = By.id("passwd");
    private By DOB_DAY = By.id("days");
    private By DOB_MONTH = By.id("months");
    private By DOB_YEAR = By.id("years");
    private By ADDRESS_FIRST_NAME = By.id("firstname");
    private By ADDRESS_LAST_NAME = By.id("lastname");
    private By ADDRESS = By.id("address1");
    private By CITY = By.id("city");
    private By COUNTRY = By.id("id_country");
    private By STATE = By.id("id_state");
    private By ZIP = By.id("postcode");
    private By MOBILE_PHONE = By.id("phone_mobile");
    private By ASSIGN_ALIAS = By.id("alias");
    private By SUBMIT_ACCOUNT = By.id("submitAccount");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void populate_dob(String day, String month, String year) {
       // wait_element_to_appear(DOB_DAY);
        select(DOB_DAY, day);
        select(DOB_MONTH, month);
        select(DOB_YEAR, year);
    }

    public void register_new_account(String firstName,
                                     String lastName,
                                     String password,
                                     String dobDay,
                                     String dobMonth,
                                     String dobYear,
                                     String addressFirstName,
                                     String addressLastName,
                                     String address,
                                     String city,
                                     String country,
                                     String state,
                                     String zip,
                                     String mobilePhone,
                                     String assignAlias) {
        wait_element_to_appear(TITLE);
        click(TITLE);
        input(FIRST_NAME, firstName);
        input(LAST_NAME, lastName);
        input(PASSWORD, password);
        populate_dob(dobDay, dobMonth, dobYear);
        input(ADDRESS_FIRST_NAME, addressFirstName);
        input(ADDRESS_LAST_NAME, addressLastName);
        input(ADDRESS, address);
        input(CITY, city);
        select(COUNTRY, country);
        select(STATE, state);
        input(ZIP, zip);
        input(MOBILE_PHONE, mobilePhone);
        input(ASSIGN_ALIAS, assignAlias);
        click(SUBMIT_ACCOUNT);
    }

}
