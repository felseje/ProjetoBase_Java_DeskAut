//package br.com.projeto.commons;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebElement;
//import br.com.projeto.bean.interfaces.DSL;
//import org.openqa.selenium.winium.WiniumDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class DesktopDSL extends DSL {
//
//    /* Construtor*/
//    public DesktopDSL(WiniumDriver driver) {
//        winiumDriver = driver;
//        winiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    /* Atributos */
//    private static WiniumDriver winiumDriver;
//
//    /* Limpar */
//    @Override
//    public void limpar(By by) {
//
//
//    }
//
//    /* Cliques */
//    @Override
//    public void clicar(By localizador) {
//        new Actions(winiumDriver).moveToElement(driverWait.until(ExpectedConditions.elementToBeClickable(obterElemento(localizador)))).click().perform();
//    }
//
//    public void clicar(WebElement elemento) {
//        new Actions(winiumDriver).moveToElement(driverWait.until(ExpectedConditions.elementToBeClickable(elemento))).click().perform();
//    }
//
//    @Override
//    public void escrever(By by, Keys key) {
//
//    }
//
//    @Override
//    public void escrever(By by, String txt) {
//
//    }
//
//    @Override
//    public boolean estaVisivel(By by) {
//        return false;
//    }
//
//    @Override
//    public boolean estaPresente(By by) {
//        return false;
//    }
//}
