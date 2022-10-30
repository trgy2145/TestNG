import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    public void setup(){
        System.out.println("this part belong to setup");
    }
    @Test(priority = 2)
    public void login(){
        System.out.println("this part belong to login");
    }
    @Test(priority = 3)
    public void finished(){
        System.out.println("this part belong to finish");
    }
}
