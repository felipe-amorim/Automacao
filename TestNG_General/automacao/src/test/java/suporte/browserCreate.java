package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class browserCreate {
    public static WebDriver createChromeDriver () {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        return navegador;
    }

    public static WebDriver createIeDriver () {
        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\drivers\\IEDriverServer.exe");
        WebDriver navegador = new InternetExplorerDriver();
        navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        return navegador;
    }
}
