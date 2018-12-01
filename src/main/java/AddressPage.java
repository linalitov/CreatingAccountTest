import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    WebDriver driver;
    By addressConfirm = By.name("confirm-addresses");

    public AddressPage(WebDriver driver) {
        this.driver=driver;
    }

    public void addressConfirmationClick () {
        driver.findElement(addressConfirm).click();
    }
}
