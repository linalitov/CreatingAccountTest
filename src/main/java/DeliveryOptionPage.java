import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryOptionPage {
    WebDriver driver;
    By deliveryOptionConfirm = By.name("confirmDeliveryOption");

    public DeliveryOptionPage (WebDriver driver) {
        this.driver=driver;
    }

    public void deliveryOptionConfirmation () {
        driver.findElement(deliveryOptionConfirm).click();
    }
}
