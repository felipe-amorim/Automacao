package executaveis.TestNG.Classes.Execucao_Paralela;

import org.testng.annotations.Test;

public class Paralela1 {
    @Test
    public void TestMethod1() throws InterruptedException {
        System.out.println("Paralela 1 - primeiro teste: esperando 5 segundos....");
        Thread.sleep(5000);
    }
    @Test
    public void TestMethod2()
    {
        System.out.println("Paralela 1 - segundo teste");
    }
}
