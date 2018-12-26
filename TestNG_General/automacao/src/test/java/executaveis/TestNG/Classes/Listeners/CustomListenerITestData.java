package executaveis.TestNG.Classes.Listeners;

import org.testng.*;

public class CustomListenerITestData implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        //Quanto o metodo inicia
        System.out.println("Test iniciando: "+iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        //Se o metodo conclui com sucesso
        System.out.println("Test executado com sucesso: "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        //Se o metodo conclui com falha
        System.out.println("Test com falhas: "+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        //Se o metodo foi ignorado
        System.out.println("Test ignorado: "+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        //Antes da classe
        ITestNGMethod methods[] = iTestContext.getAllTestMethods();
        System.out.println("Iniciando: "+iTestContext.getName()+", executando os seguintes métodos: ");
        for (ITestNGMethod method:methods) {
            System.out.println(method.getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        //Depois da classe
        System.out.println("Finalizado os testes: "+iTestContext.getName());
    }
}
