import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    By quickView = By.xpath("//img[@alt='Brown bear printed sweater']");

    public ProductsPage (WebDriver driver) {
        this.driver = driver;
    }

    public void quickViewClick () {
        driver.findElement(quickView).click();
    }
}
