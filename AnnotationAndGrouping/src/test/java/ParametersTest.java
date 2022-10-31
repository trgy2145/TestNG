import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }



      //  driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(app);


    }

    @Test(priority = 1)
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
        Assert.assertTrue(logo.isDisplayed(), "Logo was not displayed on the page");
    }

    @Test(priority = 2)
    void homaPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("ÖZ DİYARBAKIR SEYAHAT",title, "title was not found..");
    }

    @AfterClass()
    void tearDown() {
        driver.quit();
    }
}
