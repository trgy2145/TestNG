import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    public void setupSecond(){
        System.out.println("setupSecond function");
    }
    @Test(priority = 2)
    public void loginSecond(){
        System.out.println("loginSecond function");

    }

    @Test(priority = 3)
    public void finishSecond(){
        System.out.println("finishSecond function");
    }
}
