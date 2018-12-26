package executaveis.TestNG.Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SoftAssert {
    org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();

    @Test
    public void testSoftAssert1()
    {
        sa.assertEquals(1,2);
        System.out.println("primeiro assert - errado 1 != 2");
        sa.assertEquals(1,1);
        System.out.println("segundo assert - certo 1 = 1");
    }

    @Test
    public void testSoftAssert2()
    {
        sa.assertEquals(1,2);
        System.out.println("terceiro assert - errado 1 != 2");
        sa.assertEquals(1,1);
        System.out.println("quarto assert - certo 1 = 1");
    }

    @AfterClass
    public void TearDown()
    {
        System.out.println("Terminando o teste.. iniciando validação de todos os assets..");
        System.out.println("Soft Assert não impacta a execução dos testes...");
        sa.assertAll();
        //Tudo que está depois da validação é considerado assert, portanto, o teste parou aqui.....
    }
}
