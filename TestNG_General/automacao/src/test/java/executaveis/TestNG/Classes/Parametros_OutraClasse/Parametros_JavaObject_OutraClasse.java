package executaveis.TestNG.Classes.Parametros_OutraClasse;

import org.testng.annotations.Test;

public class Parametros_JavaObject_OutraClasse {


    @Test(dataProvider = "inputs", dataProviderClass = DataClass.class)
    public void TestMethod2(String input1, String input2)
    {
        System.out.println("Teste parametro JavaObject primeiro: "+input1);
        System.out.println("Teste parametro JavaObject segundo:  "+input2);
    }
}
