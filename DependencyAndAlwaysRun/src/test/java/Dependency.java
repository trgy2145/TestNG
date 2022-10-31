import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    @Test()
    void startCar(){
        System.out.println("the car is starting..");
    }
    @Test(dependsOnMethods = "startCar")
    void driveCar(){
        System.out.println("the car is going.. ");
        Assert.fail();
    }
    @Test(dependsOnMethods = "driveCar")
    void stopCar(){
        System.out.println("the car stopped..");

    }
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)  // even thought dependency classes don't work , this class will work
    void parkCar(){
        System.out.println("the car was parked..");
    }
}
