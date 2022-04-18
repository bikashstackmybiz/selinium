import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class  HandleIFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/vikash/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        //First find the element of iframe using any of locator strategy
        WebElement iframeElement = driver.findElement(By.id("frame1"));

        //now use the switch command to bring driver in iframe
        driver.switchTo().frame(iframeElement);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText()); // Element of id sampleHeading is present in the iFrame
        //Switch back to the main window
        driver.switchTo().defaultContent();
        String textOnHeader = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(textOnHeader, "Frames");
        System.out.println("Iframe has been validated");
        driver.quit();

    }
}
