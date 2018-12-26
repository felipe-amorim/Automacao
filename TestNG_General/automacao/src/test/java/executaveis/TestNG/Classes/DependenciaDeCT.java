package executaveis.TestNG.Classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciaDeCT {
    @Test()
    public void testeDependencia1() {
        System.out.println("primeiro TestNG dependencia - assert ok");
        Assert.assertTrue(true);
    }
    @Test(priority = 1)
    public void testeDependencia2() {
        System.out.println("segundo TestNG dependencia (impacta o terceiro TestNG) - assert nok");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"testeDependencia2"})
    public void testeDependencia3() {
        Assert.assertTrue(true);
    }
}
