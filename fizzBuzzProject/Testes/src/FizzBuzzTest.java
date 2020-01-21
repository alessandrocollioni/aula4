/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import org.junit.*;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 *
 * @author DeliverIT
 */
public class FizzBuzzTest {

    @Test
    public void testSeResetoDaDivisaoPor3ForZeroRetornaFizz(){
        // ENTRADA
        Integer numero = 3;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(numero);

        // VALIDAÇÃO
        Assert.assertEquals("Fizz", resultado);

    }

    @Test
    public void testSeResetoDaDivisaoPor3ForDiferenteDeZero(){
        // ENTRADA
        Integer numero = 7;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(numero);

        // VALIDAÇÃO
        Assert.assertEquals("7", resultado);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testSePassarLimiteMinimoDeveReceberUmaExcecao(){
        // ENTRADA
        Integer limiteMenor = 0;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(limiteMenor);

        // VALIDAÇÃO

    }
    @Test(expected = IllegalArgumentException.class)
    public void testSePassarLimiteMaiorDeveReceberUmaExcecao(){
        // ENTRADA
        Integer limiteMaior = 101;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(limiteMaior);

        // VALIDAÇÃO

    }
    @Test
    public void testSeDivisivelPor5RetornaBuzz(){
        // ENTRADA
        Integer numero = 5;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(numero);

        // VALIDAÇÃO
        Assert.assertEquals("Buzz", resultado);
    }

    @Test
    public void testSeForDivisivelPor3ePor5DeveAparecerFizzBuzz(){
        // ENTRADA
        Integer numero = 15;

        // EXECUÇÃO
        FizzBuzz fz = new FizzBuzz();
        String resultado = fz.doFizzBuzz(numero);

        // VALIDAÇÃO
        Assert.assertEquals("FizzBuzz", resultado);
    }


}