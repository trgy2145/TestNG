import org.testng.annotations.*;

public class Annotationss {


    @BeforeClass
    void beforeClass() {
        System.out.println("this method will execute before class");

    }

    @AfterClass
    void afterClass() {
        System.out.println("this method will execute after class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("this method will execute before every method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("this method will execute after every method");
    }

    @Test
    void test1() {
        System.out.println("test one is executing...");
    }

    @Test
    void test2() {
        System.out.println("test two is executing...");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("this code will execute before test");
    }

    @AfterTest
    void afterTest() {
        System.out.println("this code will execute after test");
    }

    void beforeSuite() {
        System.out.println("this code will execute before test suite");
    }

    void afterSuite() {
        System.out.println("this code will execute after test suite");
    }


}
