/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agiletecexercise;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
/*
    exercise:
    implement 4 arithmetic operation using the following method signature:

    float add_float_numer(float a, float b);
    double subtract_numbers(double m, double n);
    double add_two_number(float a, double b);
    void multiply(int a, float b);

    output:
    sum of ___ and ___ is ___

 */
public class AgileTecExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      2 float, 2 double, 1 int

        Scanner scanner = new Scanner(System.in);

        float firstFloatValue, secondFloatValue;
        System.out.println("Enter 2 floating point values: ");

        firstFloatValue = scanner.nextFloat();
        secondFloatValue = scanner.nextFloat();

        float floatSum = add_float_number(firstFloatValue, secondFloatValue);
        System.out.println("sum of " + firstFloatValue + " and " + secondFloatValue + " is " + floatSum);

        double firstDoubleValue, secondDoubleValue;
        System.out.println("Enter 2 double type values: ");

        firstDoubleValue = scanner.nextDouble();
        secondDoubleValue = scanner.nextDouble();

        double doubleDifference = subtract_numbers(firstDoubleValue, secondDoubleValue);
        System.out.println("difference of " + firstDoubleValue + " and " + secondDoubleValue + " is " + doubleDifference);

        double sumOfFloatDouble = add_two_number(firstFloatValue, firstDoubleValue);
        System.out.println("sum of " + firstFloatValue + " and " + firstDoubleValue + " is " + sumOfFloatDouble);

        System.out.println("Enter an integer value: ");
        int firstIntValue = scanner.nextInt();
        multiply(firstIntValue, firstFloatValue);

    }

    static float add_float_number(float firstNumber, float secondNumber) {
        float sum = firstNumber + secondNumber;
        return sum;
    }

    static double subtract_numbers(double firstNumber, double secondNumber) {
        double sum = firstNumber - secondNumber;
        return sum;
    }

    static double add_two_number(float firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        return sum;
    }

    static void multiply(int firstNumber, float secondNumber) {
        float product = firstNumber * secondNumber;
        System.out.println("Product of " + firstNumber + " and " + secondNumber + " is: " + product);
    }

}
