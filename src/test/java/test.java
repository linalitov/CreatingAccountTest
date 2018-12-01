import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    LogInPage logInPage;
    CategoriesPage categoriesPage;
    ProductsPage productsPage;
    DetailsPage detailsPage;
    ProceedToCheckOutPage proceedToCheckOutPage;
    AddressPage addressPage;
    DeliveryOptionPage deliveryOptionPage;
    PaymentPage paymentPage;
    ConfirmationPage confirmationPage;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://fo.demo.prestashop.com/en/login?back=my-account");
    }

    @Test
    public void Submition () {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        logInPage = new LogInPage(driver);
        logInPage.submitLogIn("yjammorryz-4557@yopmail.com","password12345");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        categoriesPage = new CategoriesPage(driver);
        categoriesPage.setCategorySelectorClick();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        productsPage = new ProductsPage(driver);
        productsPage.quickViewClick();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        detailsPage = new DetailsPage(driver);
        detailsPage.placeOrder("M");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        proceedToCheckOutPage = new ProceedToCheckOutPage(driver);
        proceedToCheckOutPage.proceedButtonClick();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addressPage = new AddressPage(driver);
        addressPage.addressConfirmationClick();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        deliveryOptionPage = new DeliveryOptionPage(driver);
        deliveryOptionPage.deliveryOptionConfirmation();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        paymentPage = new PaymentPage(driver);
        paymentPage.submitPaymentAndAgreement();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        confirmationPage = new ConfirmationPage(driver);
        Assert.assertEquals(confirmationPage.getConfirmationMessage(),"YOUR ORDER IS CONFIRMED");
    }

    @AfterTest
    public void closing () {
        driver.quit();
    }

}
