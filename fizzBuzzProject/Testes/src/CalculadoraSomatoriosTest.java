import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSomatoriosTest {

    @Test
    public void testSeSomaDoisNumerosPositivosRetornaSomatorioDosNumeros() throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)2.0, resultado);
    }

    @Test
    public void testSeSomaDoisNumerosNegativosRetornaSomatorioDosNumeros () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-2.0), resultado);
    }

    @Test
    public void testSeSomaDoisNumerosPositivoNegativoRetornaSomatorioDosNumeros () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(0.0), resultado);
    }

    @Test
    public void testSeSomaDoisNumerosNegativoPositivoRetornaSomatorioDosNumeros () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(0.0), resultado);
    }

    @Test(expected =  NullValueException.class)
    public void testSeSomaDoisNullRetornaException () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSeSomaUmNumeroPositivoComNullRetornaException () throws NullValueException {
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSeSomaNullComUmNumeroPositivoRetornaException () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSeSomaUmNumeroNegativoComNullRetornaException () throws NullValueException {
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =  NullValueException.class)
    public void testSeSomaNullComUmNumeroNegativoRetornaException () throws NullValueException {
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }




}
