package suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Core extends webdriverInstantiate {
    int tmpEspera = 20;

    public Core(WebDriver navegador) {
        super(navegador);
    }
    public Core navigate(String pagina)
    {
        navegador.get(pagina);
        return this;
    }
    public Core assertMSG(String xpath, String mensagem) {
        String verificarMensagemSucesso = executingSteps(xpath).getText();
        assertEquals(mensagem, verificarMensagemSucesso);
        return this;
    }

    public Core trocandoIframe(String xpath) {
        navegador.switchTo().frame(navegador.findElement(By.xpath(xpath)));
        return this;
    }

    public Core aceitandoPopUp() {
        navegador.switchTo().alert().accept();
        return this;
    }

    public Core xpathClick(String xpath) {
        executingSteps(xpath).click();
        return this;
    }

    public Core xpathSend(String xpath, String text) {
        executingSteps(xpath).sendKeys(text);
        return this;
    }

    public Core xpathSend(String xpath, Keys text) {
        executingSteps(xpath).sendKeys(text);
        return this;
    }

    public WebElement executingSteps(String xpath)
    {
        WebDriverWait esperar = new WebDriverWait(navegador, tmpEspera);
        WebElement config = navegador.findElement(By.xpath(xpath));
        esperar.until(ExpectedConditions.elementToBeClickable(config));
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        WebElement botaoPagina = navegador.findElement(By.xpath(xpath));
        js.executeScript("arguments[0].scrollIntoView();", botaoPagina);
        return config;
    }

    public Core xpathClear(String xpath) {
        executingSteps(xpath).clear();
        return this;
    }

    public Core esperar(int tempo) throws InterruptedException {
        Thread.sleep(tempo);
        return this;
    }

    public void print(String arquivo, String status, String msg) throws IOException {
        Date date = new Date();
        date.setDate(date.getDate());
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
        String formattedDate = df.format(date);
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
        String datesplit[] = formattedDate.split("-");
        String horas[] = datesplit[1].split("_");
        String path = "\\src\\test\\resources\\evidencias\\" + datesplit[0] + "\\" + horas[0] + "h" + horas[1] + "m" + horas[2] + "s" + "\\" + status + "\\";
        try {
            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + path + arquivo + ".png"));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta: *" + e.getMessage());
        }
        if (!status.equals("OK")) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(System.getProperty("user.dir") + path + "Error.log"), "utf-8"))) {
                writer.write(msg);
            }
        }
    }
}
