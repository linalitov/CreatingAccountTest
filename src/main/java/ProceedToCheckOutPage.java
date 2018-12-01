import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckOutPage {
    WebDriver driver;
    By proceedButton = By.xpath("//a[@class='btn btn-primary']");

    public ProceedToCheckOutPage (WebDriver driver) {
        this.driver=driver;
    }

    public void proceedButtonClick () {
        driver.findElement(proceedButton).click();
    }
}
