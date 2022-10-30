import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 0)
    void testOne(){
        System.out.println("this is first method");
    }
    @Test(priority = 1)
    void testTwo(){
        System.out.println("this is second method");
    }
    @Test(priority = 2)
    void testThree(){
        System.out.println("this is third method");
    }
    @Test(priority = 3,enabled = false) // that means that this method won't execute in runtime
    void testFour(){
        System.out.println("this is forth method");
    }
}
