import org.junit.Assert;
import org.junit.Test;

public class CalculadoraMultiplicacaoTest {

    @Test
    public void testSemultiplicacaoDoisNumerosPositivosRetornamultiplicacaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)1.0, resultado);
    }

    @Test
    public void testSemultiplicacaoDoisNumerosNegativosRetornamultiplicacaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(1.0), resultado);
    }

    @Test
    public void testSemultiplicacaoDoisNumerosPositivoNegativoRetornamultiplicacaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test
    public void testSemultiplicacaoDoisNumerosNegativoPositivoRetornamultiplicacaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test(expected =   NullValueException.class)
    public void testSemultiplicacaoDoisNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSemultiplicacaoUmNumeroPositivoComNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSemultiplicacaoNullComUmNumeroPositivoRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSemultiplicacaoUmNumeroNegativoComNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSemultiplicacaoNullComUmNumeroNegativoRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }




}
