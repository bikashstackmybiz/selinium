package org.example;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    WebDriver driver;
    String baseURI, nodeURL;

    @BeforeTest
    public  void setUp() throws MalformedURLException {


        baseURI = "http://qa.top-doc.com";
        nodeURL = "http://192.168.0.241:4444/wd/hub";

        ChromeOptions cap = new ChromeOptions();
        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                UnexpectedAlertBehaviour.IGNORE);

        driver = new RemoteWebDriver(new URL(nodeURL),cap);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    @Test
    public void simpleTest(){
        driver.get(baseURI);
        System.out.println("Test Sucessfull");
        Assert.assertEquals("Online Dentistry Course in India by TopDoc", driver.getTitle());
    }
}
