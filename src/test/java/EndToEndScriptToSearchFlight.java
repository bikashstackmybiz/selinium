import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndScriptToSearchFlight {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@text=\"Durgapur (RDP)\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@text=\"Delhi (DEL)\"])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 0; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(1000);

        WebElement dropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        Select select = new Select(dropdown);
        select.selectByValue("USD");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        System.out.println("End to end Test script completed");
        driver.close();
    }
}
