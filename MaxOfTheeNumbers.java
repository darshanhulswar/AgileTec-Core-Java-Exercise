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
// write a program to find largest integer array elements of size 3 and display the largest number using following method:
// int array_largest(int number[]); number[] is integer array;
// Output: Enter 1 array element: 10
// Enter 2 array element: 20
// Enter 3 array element: 30
// Largest number is: 30
// Conditional statements
public class MaxOfTheeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st array element: ");
        intArray[0] = input.nextInt();

        System.out.println("Enter 2nd array element: ");
        intArray[1] = input.nextInt();

        System.out.println("Enter 3rd array element: ");
        intArray[2] = input.nextInt();

        int max = array_largest(intArray);
        System.out.println("Larget of 3 numbers is: " + max);
    }

    static int array_largest(int number[]) {
        int max = number[0];

        if (number[1] > max) {
            max = number[1];
        } else {
            max = number[2];
        }
        return max;
    }

}
