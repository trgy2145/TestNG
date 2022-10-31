package parelelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
    WebDriver driver;

    @Test(priority = 1)
    void logoTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ozdiyarbakir.com.tr/");
        WebElement logo = driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void titleControl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ozdiyarbakir.com.tr/");

        Assert.assertEquals(driver.getTitle(), "ÖZ DİYARBAKIR SEYAHAT");
        Thread.sleep(5000);

    }

    @AfterClass
    void tearDown() {
        driver.quit();

    }
}
