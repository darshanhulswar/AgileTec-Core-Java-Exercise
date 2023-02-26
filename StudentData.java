/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agiletecexercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */

/*
 *  write a program to process 5 students marks in 5 subjects and display the percetage of marks in below format:
 *   To determine the total and percentate you need to implement a method
 *   S.No Student Name sub1 sub2 sub2 sub3 sub4 sub5 Total Percentage
 *   1     ABCD         58   59   59   59   59   59   59    59%
 */

 /* Input specifications:
Enter 5 students information
Student 1:
Name: Darshan
subject 1 marks: 81
subject 1 marks: 80
subject 1 marks: 79
subject 1 marks: 75
 */
public class StudentData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      array to store 5 student names
        String[] studentNames = new String[5];

//      array to store 5 subjects marks for 5 students
        int[][] studentsMarks = new int[5][5];

//      array to store total marks of 5 students
        int[] totalMarks = new int[5];

//      array to store percentage of 5 students
        float[] percentage = new float[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 students information: ");

//        read students name and marks in 5 subjects
        for (int i = 0; i < 1; i++) {
            System.out.println("enter " + (i + 1) + " student name: ");
            studentNames[i] = input.next();
            studentsMarks[i] = readSubjectMarks(input);
            System.out.println("======================================");
            System.out.println();
        }

//       process the data
        totalMarks = calculateTotalMarks(studentsMarks);
        percentage = calculatePercentage(totalMarks);
//        System.out.println(Arrays.toString(percentage));

//        display the result
        System.out.printf("-------------------------------------------------------------------------------------------\n");
        System.out.printf("| %-7s | %-10s | %-5s |  %-5s |  %-5s | %-5s | %-5s | %7s | %-12s | \n", "Sl.No", "NAME", "Sub1", "Sub2", "Sub3", "Sub4", "Sub5", "TOTAL", "PERCENTAGE");
        System.out.printf("-------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-7s | %-10s | %5s |  %5s |  %5s | %5s | %5s | %7s | %-12s | \n", i + 1, studentNames[i], studentsMarks[i][0], studentsMarks[i][1],
                    studentsMarks[i][2], studentsMarks[i][3], studentsMarks[i][4], totalMarks[i], percentage[i] + "%");
        }
        System.out.printf("-------------------------------------------------------------------------------------------\n");

    }

    static int[] readSubjectMarks(Scanner input) {
        int[] subjectMarks = new int[5];

        System.out.println("Please enter 5 subject marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            subjectMarks[i] = input.nextInt();
        }

        return subjectMarks;
    }

    static int[] calculateTotalMarks(int[][] marksArray) {
        int[] totalMarks = new int[5];

        for (int i = 0; i < marksArray.length; i++) {
            for (int j = 0; j < marksArray[i].length; j++) {
                totalMarks[i] += marksArray[i][j];
            }
        }

        return totalMarks;
    }

    static float[] calculatePercentage(int[] marks) {
        float[] percentages = new float[5];

        for (int i = 0; i < marks.length; i++) {
            float temp = marks[i] / (float) 500;
            percentages[i] = temp * 100;
        }
        return percentages;
    }

}
