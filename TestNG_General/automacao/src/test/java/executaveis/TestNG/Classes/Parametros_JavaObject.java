package executaveis.TestNG.Classes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametros_JavaObject {

    @DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"bmw", "m3"},
                {"audi", "a6"},
                {"benz", "c300"}
        };
    }

    @Test(dataProvider = "inputs")
    public void TestMethod2(String input1, String input2)
    {
        System.out.println("Teste parametro JavaObject primeiro: "+input1);
        System.out.println("Teste parametro JavaObject segundo:  "+input2);
    }
}
