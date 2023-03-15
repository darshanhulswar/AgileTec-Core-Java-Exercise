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
public class Department {

    int departmentID;
    String department_name;
    int[] marks = new int[3];

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void initDepartment() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter department ID: ");
        setDepartmentID(Integer.parseInt(reader.nextLine()));

        System.out.println("Enter department: ");
        setDepartment_name(reader.nextLine());

        System.out.println("Enter 3 subject marks of current department: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = reader.nextInt();
        }
    }

}
