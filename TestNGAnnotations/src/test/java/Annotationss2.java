import org.testng.annotations.*;

public class Annotationss2 {

   
        @BeforeClass
        void beforeClass(){
            System.out.println("this method will execute before class");
            
        }
        @AfterClass
        void afterClass(){
            System.out.println("this method will execute after class");
        }
        @BeforeMethod
        void beforeMethod(){
            System.out.println("this method will execute before every method");
        }
        @AfterMethod
        void afterMethod(){
            System.out.println("this method will execute after every method");
        }
        @Test
        void test3(){
            System.out.println("test three is executing...");
        }
        @Test
        void test4(){
            System.out.println("test four is executing...");
        }
    
        

        
}
