package executaveis.TestNG.Classes.Parametros_OutraClasse;

import org.testng.annotations.DataProvider;

public class DataClass {
    @DataProvider(name = "inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"bmw", "m3"},
                {"audi", "a6"},
                {"benz", "c300"}
        };
    }
}
