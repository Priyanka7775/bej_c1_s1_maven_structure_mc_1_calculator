package org.demo;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {

        Calculator calculator=new Calculator();
        System.out.println("Addition = " + calculator.add(30,20));
        System.out.println("Subtraction = " + calculator.subtract(30,20));
        System.out.println("Multiplication = " + calculator.multiply(2,6));
        System.out.println("Division = " + calculator.divide(8,4));
        System.out.println("Modulo = " + calculator.modulo(12,5));

    }
}
