import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

    WebDriver driver;
    By categorySelect = By.id("category-5");
    By mainCategory = By.id("category-3");

    public CategoriesPage (WebDriver driver) {
        this.driver=driver;
    }

    public void setCategorySelectorClick () {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(mainCategory)).perform();
        WebElement categoryName = driver.findElement(categorySelect);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(categoryName));
        categoryName.click();
    }
}
