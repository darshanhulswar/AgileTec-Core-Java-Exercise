/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agiletecexercise;

/**
 *
 * @author DELL
 */
public class IntArraySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       write a program to get the sum of an integer array with size 7
        int[] numbers = new int[7];
        int[] marks = {1, 2, 3, 4};

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;

        int sumOfIntNums;
        sumOfIntNums = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6];

        System.out.println("Sum of array integers of size 7 is " + sumOfIntNums);
    }

}
