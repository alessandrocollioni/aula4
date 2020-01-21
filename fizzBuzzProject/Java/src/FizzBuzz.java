/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DeliverIT
 */
public class FizzBuzz {
    public String doFizzBuzz(Integer num){
        if(num < 1){
            throw new IllegalArgumentException();
        }

        if(num > 100){
            throw new IllegalArgumentException();
        }
        if(num%3 == 0 && num%5 == 0) {
            return "FizzBuzz";
        }

        if(num%3 == 0) {
            return "Fizz";
        }

        if(num%5 == 0) {
            return "Buzz";
        }

        return num.toString();
    }

}
