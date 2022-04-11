import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
        for (WebElement india : options
             ) {
            if (india.getText().equalsIgnoreCase("India")){
                india.click();
                System.out.println("Script PASS");
            }
        }
//        driver.findElement(By.xpath("//a[text()='India']")).click();
        driver.close();

    }
}
