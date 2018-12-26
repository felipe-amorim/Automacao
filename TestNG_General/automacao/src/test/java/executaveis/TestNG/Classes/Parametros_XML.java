package executaveis.TestNG.Classes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametros_XML {
    @Test
    @Parameters({"browser", "platform"})
    public void TestMethod1(String browser, String platform)
    {
        System.out.println("primeiro parametro: "+browser);
        System.out.println("segundo parametro: "+platform);
    }
    @Test
    @Parameters({"response"})
    public void TestMethod2(String response)
    {
        String[] resp = response.split(",");
        for (String r:resp) {
            System.out.println("terceiro parametro, massa individual: "+r.trim());
        }
    }
}
