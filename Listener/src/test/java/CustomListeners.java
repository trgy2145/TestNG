import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
    //this belongs to ITestListener and will execute before the main test start i.e. @Test
    public void onTestStart(ITestResult result) {
        System.out.println("starts test  execution ..." +result.getName());
    }
    //this belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult result) {
        System.out.println("passed test ..." +result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("failed test ..." +result.getName());
    }
    //this belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult result) {
        System.out.println("skipped test ..." +result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    //this belongs to ITestListener and will execute before starting of test set/batch
    public void onStart(ITestContext context) {
        System.out.println("starts test  execution ..." +context.getName());
    }
    //this belongs to ITestListener and will execute after starting of test set/batch
    public void onFinish(ITestContext context) {
        System.out.println("finished test ..." +context.getName());
    }
}
