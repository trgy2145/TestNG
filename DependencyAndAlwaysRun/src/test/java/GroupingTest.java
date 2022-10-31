import org.testng.annotations.Test;

public class GroupingTest {
    @Test(groups = {"x"})
    void test1(){
        System.out.println("This is test one");
    }
    @Test(groups = {"x"})
    void test2(){
        System.out.println("This is test two");
    }
    @Test(groups = {"y"})
    void test3(){
        System.out.println("This is test three");
    }
    @Test(groups = {"y"})
    void test4(){
        System.out.println("This is test four");
    }
    @Test(groups = {"x","y"})
    void test5(){
        System.out.println("This is test five");
    }
}
