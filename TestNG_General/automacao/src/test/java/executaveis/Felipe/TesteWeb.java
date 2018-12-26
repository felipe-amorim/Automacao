package executaveis.Felipe;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import suporte.Core;
import suporte.browserCreate;

import java.io.IOException;
import java.util.Calendar;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massasTeste/massa1.xls")

public class TesteWeb {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();
    long t = Calendar.getInstance().getTimeInMillis();
    String status = "";
    String error = "";

    @Before
    public void setUp() {
        navegador = browserCreate.createChromeDriver();
    }

    @Test
    public void testeWeb1(
            @Param(name="input1")String input1
    ) {
        try {
            System.out.println("exemplo de input de massa de testes: "+input1);
            System.out.println("exemplo de tempo de execução em milisegundos: "+t);
            new Core(navegador)
            .navigate("https://www.wikipedia.org/")
            .xpathSend("//input[contains(@id, \"searchInput\")]", "automation")
            .xpathClick("//i[contains(text(), \"Search\")]//ancestor::button[1]")
            .assertMSG("//h1[contains(@id, \"firstHeading\")]", "OLE Automation")
            ;
            status = "OK";
        } catch (ComparisonFailure ex) {
            status = "NOK";
            error = ex.getMessage();
        } catch (Exception ex) {
            status = "Fail";
            error = ex.getMessage();
        }
    }

    @After
    public void tearDown() throws IOException {
        new Core(navegador).print(test.getMethodName(), status, error);
        navegador.quit();
    }
}
