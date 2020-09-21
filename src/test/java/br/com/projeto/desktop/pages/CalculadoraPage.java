package br.com.projeto.desktop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class CalculadoraPage {

    // Construtor
    public CalculadoraPage(WiniumDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Botões
    @FindBy(id = "130")
    private WebElement botaoZero;
    @FindBy(id = "131")
    private WebElement botaoUm;
    @FindBy(id = "132")
    private WebElement botaoDois;
    @FindBy(id = "133")
    private WebElement botaoTres;
    @FindBy(id = "134")
    private WebElement botaoQuatro;
    @FindBy(id = "135")
    private WebElement botaoCinco;
    @FindBy(id = "136")
    private WebElement botaoSeis;
    @FindBy(id = "137")
    private WebElement botaoSete;
    @FindBy(id = "138")
    private WebElement botaoOito;
    @FindBy(id = "139")
    private WebElement botaoNove;
    @FindBy(id = "93")
    private WebElement botaoAdicionar;
    @FindBy(id = "94")
    private WebElement botaoSubtrair;
    @FindBy(id = "92")
    private WebElement botaoMultiplicar;
    @FindBy(id = "91")
    private WebElement botaoDividir;
    @FindBy(id = "121")
    private WebElement botaoIgual;

    // Visor
    @FindBy(id = "158")
    private WebElement visorCalculadora;

    // Getters
    public WebElement getBotaoZero() {
        return botaoZero;
    }
    public WebElement getBotaoUm() {
        return botaoUm;
    }
    public WebElement getBotaoDois() {
        return botaoDois;
    }
    public WebElement getBotaoTres() {
        return botaoTres;
    }
    public WebElement getBotaoQuatro() {
        return botaoQuatro;
    }
    public WebElement getBotaoCinco() {
        return botaoCinco;
    }
    public WebElement getBotaoSeis() {
        return botaoSeis;
    }
    public WebElement getBotaoSete() {
        return botaoSete;
    }
    public WebElement getBotaoOito() {
        return botaoOito;
    }
    public WebElement getBotaoNove() {
        return botaoNove;
    }
    public WebElement getBotaoAdicionar() {
        return botaoAdicionar;
    }
    public WebElement getBotaoSubtrair() {
        return botaoSubtrair;
    }
    public WebElement getBotaoMultiplicar() {
        return botaoMultiplicar;
    }
    public WebElement getBotaoDividir() {
        return botaoDividir;
    }
    public WebElement getBotaoIgual() {
        return botaoIgual;
    }
    public WebElement getVisorCalculadora() {
        return visorCalculadora;
    }
}
