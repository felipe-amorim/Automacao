package executaveis.TestNG.Classes;

import org.testng.annotations.Test;

//possibilidade de desativar cts sem precisar excluir ou comentar tudo (que as vezes leva a erro no codigo fonte)

public class Enabled {
    @Test(enabled = false)
    public void TestMethod1()
    {
        System.out.println("primeiro teste");
    }
    @Test
    public void TestMethod2()
    {
        System.out.println("segundo teste");
    }
}
