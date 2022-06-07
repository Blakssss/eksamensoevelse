package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TryingAndCatching {
    Scanner scanner = new Scanner(System.in);
    int number1 = 0;
    int number2 = 10;

    public void math(){
        try{
            number1 = number2 / number1;
            System.out.println(number1);
        } catch (ArithmeticException e){
            System.out.println("You can't do that kind of math");
        }
    }
    public void alsoMath() throws ArithmeticException {
        if(scanner.nextInt() < 18){
            throw new ArithmeticException("You're not old enough");

        } else
            System.out.println("You're old enough");

    }

    public static void main(String[] args) {
        TryingAndCatching tryingAndCatching = new TryingAndCatching();
        tryingAndCatching.math();
        tryingAndCatching.alsoMath();
    }
}
