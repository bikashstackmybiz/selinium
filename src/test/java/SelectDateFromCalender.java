import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateFromCalender {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[1]")).click();
        driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-today\"]")).click();
        Thread.sleep(2000);
        System.out.println("Script PASS");
    }
}
