package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class SeleniumCode {
    private static String Url = "";
    public WebDriver executeProcess(WebDriver driver) throws InterruptedException, IOException {
        Url = driver.getTitle();
        Screenshots screenshot = new Screenshots();
        System.out.println("Page title is: " + driver.getTitle());
        screenshot.deleteScreenshot();
//        driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
        screenshot.takeScreenshot(driver);
        Thread.sleep(2000);
//        Amazon.com en espanol. Gasta menos. Sonríe más.
        String titleEnglish = "Amazon.com. Spend less. Smile more.";
        String title = "Amazon.com";
        if (driver.getTitle().equals(title)) {
            System.out.println("Title is correct");
            WebElement buttonContinueShopping = driver.findElement(By.cssSelector("body > div > div.a-row.a-spacing-double-large > div.a-section > div > div > form > div > div > span > span > button"));
            buttonContinueShopping.click();
            Thread.sleep(2000);
            screenshot.takeScreenshot(driver);
        } else

        if (driver.getTitle().equals(titleEnglish)) {
            System.out.println("Title is correct");
            WebElement buttonContinueShopping = driver.findElement(By.cssSelector("#navbar-backup-backup > div > div.nav-bb-left"));
            buttonContinueShopping.click();
            Thread.sleep(2000);
            screenshot.takeScreenshot(driver);
        }
        //button login
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/a"));
        buttonLogin.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //find input email
        WebElement inputEmail = driver.findElement(By.cssSelector("#ap_email_login"));
        inputEmail.sendKeys("Maikcr2007@gmail.com");
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);
        //button continue after writing email
        WebElement buttonContinueEmail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/span/form/span/span/input"));
        buttonContinueEmail.click();
        Thread.sleep(2000);
        screenshot.takeScreenshot(driver);

        //find input password
        WebElement inputPassword = driver.findElement(By.cssSelector("#ap_password"));
        inputPassword.sendKeys("Minotauro1808");
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);
        //button login after writing password
        WebElement buttonContinuePassword = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
        buttonContinuePassword.click();
        Thread.sleep(3000);
        screenshot.takeScreenshot(driver);


        //find category search
        WebElement searchCategory = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[5]/div[2]/div/div/ul/li[2]/div/a"));
        searchCategory.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //find product search
        WebElement searchProduct = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[4]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/a/div/div"));
        searchProduct.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //add product to cart
        WebElement buttonAddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        buttonAddToCart.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //go to menu
        WebElement buttonMenu = driver.findElement(By.cssSelector("#nav-logo"));
        buttonMenu.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);
        //find category search
        WebElement searchCategoryTwo = driver.findElement(By.xpath("//*[@id=\"nav-link-fsz-in\"]"));
        searchCategoryTwo.click();

        new Actions(driver)
                .scrollByAmount(100, 400)
                .perform();

        // find product two
        Thread.sleep(4000);
        WebElement searchProductTwo = driver.findElement(By.xpath("//*[@id=\"alm-cards-desktop-link-location-B0CS7D2L4X\"]/div/div"));
        searchProductTwo.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);
        //add product two to cart
        WebElement buttonAddToCartTwo = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        buttonAddToCartTwo.click();
        screenshot.takeScreenshot(driver);
        Thread.sleep(1000);

        //go to cart
        WebElement buttonCart = driver.findElement(By.cssSelector("#nav-cart"));
        buttonCart.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //delete product two
        WebElement buttonDeleteProductTwo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[4]/div/div[2]/div[1]/div/form/ul/div[4]/div[4]/div/div[3]/div[1]/span[2]/span/input"));
        buttonDeleteProductTwo.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);

        //delete product one
        WebElement buttonDeleteProductOne = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[4]/div/div[2]/div[1]/div/form/ul/div[1]/div[4]/div/div[3]/div[1]/span[1]/span[1]/fieldset/button[1]/span"));
        buttonDeleteProductOne.click();
        Thread.sleep(1000);
        screenshot.takeScreenshot(driver);
        driver.quit();
        return driver;
    }
    public String takeTheNameUrl() {
        return Url;
    }
}
