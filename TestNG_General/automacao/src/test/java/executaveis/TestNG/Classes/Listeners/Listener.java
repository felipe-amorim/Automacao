package executaveis.TestNG.Classes.Listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Listener {
    @Test
    public void testeListener1() {
        System.out.println("primeiro teste - assert ok");
        Assert.assertTrue(true);
    }
    @Test
    public void testeListener2() {
        System.out.println("segundo teste - assert nok");
        Assert.assertTrue(false);
    }
    @AfterMethod
    public void afterMethod(ITestResult testResult)
    {
        if (testResult.getStatus()==ITestResult.FAILURE)
        {
            System.out.println("Failed: "+testResult.getMethod().getMethodName());
        }
        if (testResult.getStatus()==ITestResult.SUCCESS)
        {
            System.out.println("Successful: "+testResult.getMethod().getMethodName());
        }

    }
}
