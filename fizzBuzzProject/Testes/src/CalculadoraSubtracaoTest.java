import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSubtracaoTest {

    @Test
    public void testSesubtracaoDoisNumerosPositivosRetornasubtracaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)0.0, resultado);
    }

    @Test
    public void testSesubtracaoDoisNumerosNegativosRetornasubtracaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(0.0), resultado);
    }

    @Test
    public void testSesubtracaoDoisNumerosPositivoNegativoRetornasubtracaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(2.0), resultado);
    }

    @Test
    public void testSesubtracaoDoisNumerosNegativoPositivoRetornasubtracaotorioDosNumeros  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-2.0), resultado);
    }

    @Test(expected =  NullValueException.class)
    public void testSesubtracaoDoisNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSesubtracaoUmNumeroPositivoComNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSesubtracaoNullComUmNumeroPositivoRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSesubtracaoUmNumeroNegativoComNullRetornaException  () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSesubtracaoNullComUmNumeroNegativoRetornaException() throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }




}
