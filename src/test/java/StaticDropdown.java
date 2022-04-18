import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdown {
    @Test
    public void staticDropdown() {
        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        WebElement webElement = driver.findElement(By
                .xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
        Select dropdown = new Select(webElement);
//        dropdown.selectByValue("USD");
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.close();

    }
}
