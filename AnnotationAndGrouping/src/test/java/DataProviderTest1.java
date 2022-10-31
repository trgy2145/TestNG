import org.testng.annotations.DataProvider;

public class DataProviderTest1 {
    /* @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String pwd){
        System.out.println(email + " " + pwd);

    } */
    @DataProvider(name="LoginDataProvider")
    public Object [][] getDate(){
        Object[][] data ={{"gty@gmail.com", "123"}, {"321@gmail.com", "321"}, {"rtrt@gmail.com", "trg"}};
        return data;
    }
}
