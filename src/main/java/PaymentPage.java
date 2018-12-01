import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;
    By paymentType = By.id("payment-option-1");
    By agreement = By.id("conditions_to_approve[terms-and-conditions]");
    By paymentSubmit = By.xpath("//div[@id='payment-confirmation']//button");

    public PaymentPage (WebDriver driver) {
        this.driver=driver;
    }

    public void setPaymentType () {
        driver.findElement(paymentType).click();
    }

    public void acceptAgreement () {
        driver.findElement(agreement).click();
    }

    public void paymentSubmitClick () {
        driver.findElement(paymentSubmit).click();
    }

    public void submitPaymentAndAgreement () {
        setPaymentType();
        acceptAgreement();
        paymentSubmitClick();
    }
}
