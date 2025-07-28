package org.example;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ScreenshotTest {
    @Test
    public void testScreenshot() throws IOException, InterruptedException {
        SeleniumCode seleniumCode = new SeleniumCode();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        seleniumCode.executeProcess(driver);
        String titleOfPage = seleniumCode.takeTheNameUrl();
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedTitleSpanish = "Amazon.com en espanol. Gasta menos. Sonríe más.";
        if (titleOfPage.equals(expectedTitleSpanish)) {
            assertEquals(expectedTitleSpanish, titleOfPage);
        } else {
            assertEquals(expectedTitle, titleOfPage);
        }
        System.out.println("Title of the page is: " + titleOfPage);
    }
}
