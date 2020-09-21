package br.com.projeto.desktop.steps;

import br.com.projeto.desktop.functionalities.CalculadoraFunctionalities;
import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

public class CalculadoraStep {

    private CalculadoraFunctionalities calcFunc = new CalculadoraFunctionalities();

    @Dado("que inicializo a calculadora do Windows")
    public void queInicializoACalculadoraDoWindows() {
        calcFunc.inicializarCalculadora();
    }

    @E("digito o número {string}")
    public void digitoONúmero(String numero) {
        throw new PendingException("Não implementado.");
    }

    @E("clico no botão {string}")
    public void clicoNoBotão(String botao) {
        calcFunc.clicarNoBotao(botao);
    }

    @Então("visualizo que o resultado exibido é {string}")
    public void visualizoQueOResultadoExibidoÉ(String resultado) {
        String msg = "Não foi possível visualizar o resultado " + resultado + ".";
        Assert.assertTrue(msg, calcFunc.visualizarResultado(resultado));
    }
}
