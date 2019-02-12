package com.nikias.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        ((ChromeOptions) options).addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com/xhtml");

        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }


}
