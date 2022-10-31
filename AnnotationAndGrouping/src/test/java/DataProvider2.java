import org.testng.annotations.Test;

public class DataProvider2 {
    @Test(dataProvider ="LoginDataProvider", dataProviderClass = DataProviderTest1.class)
    public void loginTest(String email,String pwd){
        System.out.println(email + " " + pwd);

    }
}
