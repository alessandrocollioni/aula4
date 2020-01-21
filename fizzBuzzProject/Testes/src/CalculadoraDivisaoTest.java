import org.junit.Assert;
import org.junit.Test;

public class CalculadoraDivisaoTest {

    @Test
    public void testSeDivisaoDoisNumerosPositivosRetornaDivisaotorioDosNumeros  ()throws DivisionZeroException, NullValueException{
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
    public void testSeDivisaoDoisNumerosNegativosRetornaDivisaotorioDosNumeros  ()throws DivisionZeroException, NullValueException{
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
    public void testSeDivisaoDoisNumerosPositivoNegativoRetornaDivisaotorioDosNumeros  ()throws DivisionZeroException, NullValueException{
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
    public void testSeDivisaoDoisNumerosNegativoPositivoRetornaDivisaotorioDosNumeros  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test(expected =   NullValueException.class)
    public void testSeDivisaoDoisNullRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSeDivisaoUmNumeroPositivoComNullRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSeDivisaoNullComUmNumeroPositivoRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSeDivisaoUmNumeroNegativoComNullRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected =   NullValueException.class)
    public void testSeDivisaoNullComUmNumeroNegativoRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = Exception.class)
    public void testSeDivisaoUmNumeroNegativoComZeroRetornaException  ()throws DivisionZeroException, NullValueException{
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 0.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.Divisao(numero1, numero2);

        // VALIDAÇÃO
    }
}
