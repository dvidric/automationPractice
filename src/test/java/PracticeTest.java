import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;
import java.io.IOException;

public class PracticeTest extends BaseTest {

    @Test
    public void firstTest() throws IOException {

        LandingPage page = new LandingPage(driver);

        page.goToSignIn();

        AuthenticationPage auth = new AuthenticationPage(driver);

        auth.goToCreateAnAccount(Helper.generateEmail());

        CreateAccountPage acc = new CreateAccountPage(driver);

        acc.register_new_account("Dragana",
                                "Vidric",
                                "blabla",
                                "14",
                                "8",
                                "1995",
                                "Dragana",
                                "Vidric",
                                "aflaksfls1",
                                "Beograd",
                                "21",
                                "4",
                                "42666",
                                "5456455",
                                "dragana.vidric@gmail.com"
                            );

        MyAccountPage myAcc = new MyAccountPage(driver);
        Assert.assertTrue(myAcc.verifySignOut());

        myAcc.goToHomePage();

        HomePage home = new HomePage(driver);

        Assert.assertEquals(7, home.getPopularProducts().size());

        home.goToBestseller();

        Assert.assertEquals(7, home.getBestsellerProducts().size());

        home.searchTerm("Printed dresses");

        Helper.writeArrayStringsToFile( home.getProductTitles());

        home.openFirstProduct();

        ProductDetailPage detail = new ProductDetailPage(driver);
        Assert.assertTrue(detail.verifyTweet());

        Assert.assertTrue(detail.verifyShare());

        Assert.assertTrue(detail.verifyGooglePlus());

        Assert.assertTrue(detail.verifyPinterest());

        Assert.assertTrue(detail.verifyDiscount());

        detail.changeQuantity("3");

        detail.changeSize("2");

        detail.changeColor();

        detail.addToCard();

        CheckoutPopupPage popup = new CheckoutPopupPage(driver);
        Assert.assertEquals("3", popup.getQuantity());

        Assert.assertEquals("Blue",popup.getColor());

        Assert.assertEquals("M", popup.getSize());

        popup.proceedToCheckOut();

        CartSummaryPage  summary = new CartSummaryPage(driver);

        Assert.assertEquals("$88.94", summary.getPrice());

        summary.proceedWithCheckout();

        Assert.assertEquals("Dragana Vidric", summary.getBuyerName());

        summary.processAddress();

        Assert.assertEquals("dragana.vidric@gmail.com", summary.getEmail());

        summary.confirmTOS();

        summary.processCarrier();

        Assert.assertTrue(summary.getDiscount());

        summary.payByBankWire();

        summary.confirmOrder();

        Assert.assertEquals("Your order on My Store is complete.", summary.getCompletionTitle());

    }
}
