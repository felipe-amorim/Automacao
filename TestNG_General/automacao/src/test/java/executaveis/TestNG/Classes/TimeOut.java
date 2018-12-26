package executaveis.TestNG.Classes;

import org.testng.annotations.Test;

public class TimeOut {
    @Test
    public void TestMethod1()
    {
        System.out.println("primeiro teste");
    }
    @Test(timeOut = 300)
    public void TestMethod2() throws InterruptedException {
        System.out.println("segundo teste - tempo de espera MENOR que o time-out do teste (testes de performace)");
        Thread.sleep(200);
    }
    @Test(timeOut = 100)
    public void TestMethod3() throws InterruptedException {
        System.out.println("terceiro teste - tempo de espera MAIOR que o time-out do teste (testes de performace)");
        Thread.sleep(200);
    }

}
