package executaveis.TestNG.Classes.Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListenerIInvokeData implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //Antes de cada metodo nas classes de teste
        System.out.println("Antes do teste: "+iTestResult.getClass().getName() + " => "+iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //Depois de cada metodo nas classes de teste
        System.out.println("Depois do teste: "+iTestResult.getClass().getName() + " => "+iInvokedMethod.getTestMethod().getMethodName());
    }
}
