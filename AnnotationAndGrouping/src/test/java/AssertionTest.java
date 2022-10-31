import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ozdiyarbakir.com.tr/");


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

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
