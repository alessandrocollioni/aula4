import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSomatoriosTest {

    @Test
    public void testSeSomaDoisNumerosPositivosRetornaSomatorioDosNumeros(){
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
    public void testSeSomaDoisNumerosNegativosRetornaSomatorioDosNumeros(){
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
    public void testSeSomaDoisNumerosPositivoNegativoRetornaSomatorioDosNumeros(){
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
    public void testSeSomaDoisNumerosNegativoPositivoRetornaSomatorioDosNumeros(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = 1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
        Assert.assertEquals((Double)(0.0), resultado);
    }

    @Test(expected = NullPointerException.class)
    public void testSeSomaDoisNullRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeSomaUmNumeroPositivoComNullRetornaException(){
        // ENTRADA
        Double numero1 = 1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeSomaNullComUmNumeroPositivoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = +1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeSomaUmNumeroNegativoComNullRetornaException(){
        // ENTRADA
        Double numero1 = -1.0;
        Double numero2 = null;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }

    @Test(expected = NullPointerException.class)
    public void testSeSomaNullComUmNumeroNegativoRetornaException(){
        // ENTRADA
        Double numero1 = null;
        Double numero2 = -1.0;

        // EXECUÇÃO
        Calculadora calc = new Calculadora();
        Double resultado = calc.soma(numero1, numero2);

        // VALIDAÇÃO
    }




}
