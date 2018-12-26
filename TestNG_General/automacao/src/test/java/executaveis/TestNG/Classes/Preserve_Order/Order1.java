package executaveis.TestNG.Classes.Preserve_Order;

import org.testng.annotations.Test;

public class Order1 {
    @Test
    public void TestMethod1()
    {
        System.out.println("primeiro teste - order 1");
    }
    @Test
    public void TestMethod2()
    {
        System.out.println("segundo teste - order 1");
    }
}
