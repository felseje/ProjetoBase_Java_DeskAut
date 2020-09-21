package br.com.projeto.commons;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.projeto.bean.interfaces.WebApplication;
import br.com.projeto.bean.interfaces.DesktopApplication;
import br.com.projeto.exceptions.SystemNotSupportedException;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WiniumDriver desktopDriver;
    protected static WebDriverWait webDriverWaiter;
    protected static final int MAX_TIME_WAIT = 20;
    private static final String remoteLink = "http://localhost:9999";
    private static final String filePath =
            System.getenv("SystemDrive") + "\\Windows\\system32\\calc.exe";

    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().fullscreen();
//        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriverWaiter = new WebDriverWait(webDriver, MAX_TIME_WAIT);
    }

    protected void initializeDesktopApplication(DesktopApplication desktopApplication) {
        try {
            startRemote();
        }
        catch (SystemNotSupportedException e) {
            System.err.println(e.getMessage() + " - Inicie o Winium manualmente.");
            e.printStackTrace();
        }
        finally {
            desktopDriver = desktopApplication.getDriver(filePath, remoteLink);
        }
    }

    protected static void closeWeb() {
        webDriver.quit();
    }

    protected static void closeDesktop() {
        if (desktopDriver != null) {
            desktopDriver.quit();
        }
    }

    private void startRemote() throws SystemNotSupportedException {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            try {
                Runtime
                        .getRuntime()
                        .exec(System.getProperty("user.dir") + "\\winiumdriver.exe");
                Thread.sleep(2000);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        } else throw new SystemNotSupportedException("Não há suporte para o início automático no seu sistema.");
    }
}
