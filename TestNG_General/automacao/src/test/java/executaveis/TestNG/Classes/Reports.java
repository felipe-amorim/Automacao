package executaveis.TestNG.Classes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Reports {
    @BeforeClass
    public void SetUp()
    {
        Reporter.log("Começando os testes", true);
    }
    @Test
    public void testeCustomListener1() {
        Reporter.log("primeiro teste - assert ok", true);
        Assert.assertTrue(true);
    }
    @Test
    public void testeCustomListener2() {
        Reporter.log("segundo teste - assert ok", true);
        Assert.assertTrue(true);
    }
    @Test
    public void testeCustomListener3() {
        Reporter.log("segundo teste - assert ok", true);
        Assert.assertTrue(true);
    }
    @Test
    public void testeCustomListener4() {
        Reporter.log("segundo teste - assert ok", true);
        Assert.assertTrue(true);
    }
}
