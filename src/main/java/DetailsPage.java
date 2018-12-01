import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DetailsPage {
    WebDriver driver;
    By dropdown = By.id("group_1");
    By addButton = By.xpath("//div[@class='add']/button");
    By proceedToCheckOutButton = By.xpath("//a[@class='btn btn-primary']");

    public DetailsPage (WebDriver driver) {
        this.driver=driver;
    }

    public void setDropdown (String option) {
        Select drop = new Select(driver.findElement(dropdown));
        drop.selectByVisibleText(option);
    }


    public void addButtonClick () {
        driver.findElement(addButton).click();
    }

    public void proceedToCheckOutClick () {
        driver.findElement(proceedToCheckOutButton).click();
    }

    public void placeOrder (String option) {
        setDropdown(option);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        addButtonClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        proceedToCheckOutClick();
    }
}
