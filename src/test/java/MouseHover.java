import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        WebElement webElement = driver.findElement(By
                .xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("emample"))).build().perform();
    }
}
