import org.junit.Assert;
import org.junit.Test;

public class CalculadoraMultiplicacaoTest {

    @Test
    public void testSemultiplicacaoDoisNumerosPositivosRetornamultiplicacaotorioDosNumeros(){
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
    public void testSemultiplicacaoDoisNumerosNegativosRetornamultiplicacaotorioDosNumeros(){
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
    public void testSemultiplicacaoDoisNumerosPositivoNegativoRetornamultiplicacaotorioDosNumeros(){
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
    public void testSemultiplicacaoDoisNumerosNegativoPositivoRetornamultiplicacaotorioDosNumeros(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(-1.0), resultado);
    }

    @Test(expected = NullPointerException.class)
    public void testSemultiplicacaoDoisNullRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSemultiplicacaoUmNumeroPositivoComNullRetornaException(){
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSemultiplicacaoNullComUmNumeroPositivoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSemultiplicacaoUmNumeroNegativoComNullRetornaException(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSemultiplicacaoNullComUmNumeroNegativoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.multiplicacao(numero1, numero2);

        // VALIDAÇÃO
    }




}
