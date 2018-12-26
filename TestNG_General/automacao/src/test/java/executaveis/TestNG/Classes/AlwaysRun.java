package executaveis.TestNG.Classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
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
    @Test(dependsOnMethods = {"testeDependencia2"}, alwaysRun = true)
    public void testeDependencia3() {
        System.out.println("Terceiro TestNG dependencia - assert ok - sempre irá executar, com o teste anterior passando ou não");
        Assert.assertTrue(true);
    }
}
