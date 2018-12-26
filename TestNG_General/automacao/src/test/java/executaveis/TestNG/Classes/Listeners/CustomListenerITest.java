package executaveis.TestNG.Classes.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListenerITestData.class)
public class CustomListenerITest {
    @Test
    public void testeCustomListener1() {
        System.out.println("primeiro teste - assert ok");
        Assert.assertTrue(true);
    }
    @Test
    public void testeCustomListener2() {
        System.out.println("segundo teste - assert ok");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"testeCustomListener2"})
    public void testeCustomListener3() {
        System.out.println("segundo teste - assert ok");
        Assert.assertTrue(true);
    }
}
