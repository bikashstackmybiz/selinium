import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("bikash");
        Thread.sleep(1000);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);

//        To accept the alert
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Assert.assertEquals(alertMessage, "Hello bikash, share this practice page and share your knowledge");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        System.out.println("Alert button has been selected successfully");

//        To dismiss the alert
        driver.findElement(By.id("name")).sendKeys("bikash");
        Thread.sleep(1000);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1000);
        String confirmMessage = driver.switchTo().alert().getText();
        System.out.println(confirmMessage);
        Assert.assertEquals(confirmMessage, "Hello bikash, Are you sure you want to confirm?");
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        System.out.println("Alert button has been dismissed successfully");

        driver.close();

    }
}
