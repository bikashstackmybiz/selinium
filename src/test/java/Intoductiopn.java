import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Intoductiopn {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.top-doc.com/");
        String title = driver.getTitle();
        driver.findElement(By.className("td-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("mobileNumber")).clear();
        driver.findElement(By.name("mobileNumber")).sendKeys("9471158978");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("qwertyui1");
        driver.findElement(By.xpath("//button[@class=\"ht-entry__submit\"]")).click();
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Successfully logged in!']"))
                .getText(), "Successfully logged in!");
        System.out.println(title);
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
}
