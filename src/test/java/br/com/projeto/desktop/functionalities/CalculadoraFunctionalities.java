package br.com.projeto.desktop.functionalities;

import br.com.projeto.commons.Dsl;
import br.com.projeto.commons.BaseTest;
import br.com.projeto.desktop.pages.CalculadoraPage;

public class CalculadoraFunctionalities extends BaseTest {

    private Dsl dsl = new Dsl(desktopDriver);
    private CalculadoraPage calcPage = new CalculadoraPage(desktopDriver);

    public void inicializarCalculadora() {
    }

    public void clicarNoBotao(String botao) {
        switch (botao) {
            case "0":
                dsl.clicar(calcPage.getBotaoZero());
                break;
            case "1":
                dsl.clicar(calcPage.getBotaoUm());
                break;
            case "2":
                dsl.clicar(calcPage.getBotaoDois());
                break;
            case "3":
                dsl.clicar(calcPage.getBotaoTres());
                break;
            case "4":
                dsl.clicar(calcPage.getBotaoQuatro());
                break;
            case "5":
                dsl.clicar(calcPage.getBotaoCinco());
                break;
            case "6":
                dsl.clicar(calcPage.getBotaoSeis());
                break;
            case "7":
                dsl.clicar(calcPage.getBotaoSete());
                break;
            case "8":
                dsl.clicar(calcPage.getBotaoOito());
                break;
            case "9":
                dsl.clicar(calcPage.getBotaoNove());
                break;
            case "+":
                dsl.clicar(calcPage.getBotaoAdicionar());
                break;
            case "-":
                dsl.clicar(calcPage.getBotaoSubtrair());
                break;
            case "*":
                dsl.clicar(calcPage.getBotaoMultiplicar());
                break;
            case "/":
                dsl.clicar(calcPage.getBotaoDividir());
                break;
            case "=":
                dsl.clicar(calcPage.getBotaoIgual());
                break;
            default:
                throw new IllegalArgumentException("O botão especificado não existe.");
        }
    }

    public boolean visualizarResultado(String resultado) {
        boolean retorno;
        retorno = calcPage.getVisorCalculadora().getAttribute("Name").equals(resultado);
        return retorno;
    }
}
