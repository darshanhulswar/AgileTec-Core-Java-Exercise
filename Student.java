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
public class Student extends Department {

    int rollno, age;
    String name, email, dob, address, regno, contactno;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void initStudent() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter student roll number: ");
        setRollno(reader.nextInt());

        System.out.println("Name of the student: ");
        setName(reader.next());

        System.out.println("DOB: ");
        setDob(reader.next());

        System.out.println("Address: ");
        setAddress(reader.next());

        System.out.println("Gender: ");
        setGender(reader.next());

        initDepartment();

    }

    void updateStudentInfo(String regno) {

    }

    void updateResult(String regno, int[] marks) {

    }

    public void getStudent() {
        System.out.println("Name: " + getName());
        System.out.println("Name: " + getRegno());
        System.out.println("Name: " + getEmail());
        System.out.println("Name: " + getDob());
        System.out.println("Name: " + getAddress());
    }

}
