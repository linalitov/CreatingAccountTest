import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    WebDriver driver;
    By confirmationMessage = By.xpath("//h3[@class='h1 card-title']");

    public ConfirmationPage (WebDriver driver) {
        this.driver=driver;
    }

    public String  getConfirmationMessage () {
        return driver.findElement(confirmationMessage).getText().substring(1);
    }
}
