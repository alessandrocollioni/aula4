import org.junit.Assert;
import org.junit.Test;

public class CalculadoraDivisaoTest {

    @Test
    public void testSeDivisaoDoisNumerosPositivosRetornaDivisaotorioDosNumeros() throws Exception {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)1.0, resultado);
    }

    @Test
    public void testSeDivisaoDoisNumerosNegativosRetornaDivisaotorioDosNumeros() throws Exception {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(1.0), resultado);
    }

    @Test
    public void testSeDivisaoDoisNumerosPositivoNegativoRetornaDivisaotorioDosNumeros() throws Exception {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test
    public void testSeDivisaoDoisNumerosNegativoPositivoRetornaDivisaotorioDosNumeros() throws Exception {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test(expected = NullPointerException.class)
    public void testSeDivisaoDoisNullRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeDivisaoUmNumeroPositivoComNullRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeDivisaoNullComUmNumeroPositivoRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeDivisaoUmNumeroNegativoComNullRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeDivisaoNullComUmNumeroNegativoRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = Exception.class)
    public void testSeDivisaoUmNumeroNegativoComZeroRetornaException() throws Exception {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 0.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }
}
