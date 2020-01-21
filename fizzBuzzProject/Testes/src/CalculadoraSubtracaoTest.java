import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSubtracaoTest {

    @Test
    public void testSesubtracaoDoisNumerosPositivosRetornasubtracaotorioDosNumeros(){
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
    public void testSesubtracaoDoisNumerosNegativosRetornasubtracaotorioDosNumeros(){
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
    public void testSesubtracaoDoisNumerosPositivoNegativoRetornasubtracaotorioDosNumeros(){
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
    public void testSesubtracaoDoisNumerosNegativoPositivoRetornasubtracaotorioDosNumeros(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-2.0), resultado);
    }

    @Test(expected = NullPointerException.class)
    public void testSesubtracaoDoisNullRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSesubtracaoUmNumeroPositivoComNullRetornaException(){
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSesubtracaoNullComUmNumeroPositivoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSesubtracaoUmNumeroNegativoComNullRetornaException(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSesubtracaoNullComUmNumeroNegativoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.subtracao(numero1, numero2);

        // VALIDAÇÃO
    }




}
