package oop_lab7;

import oop_lab7.Student;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        Student s1 = new Student();
        s1.setId("0001");
        s1.setName("Boy Saiyai");
        s1.setPid("1111111111111");
        s1.setAddress("11/11 T.Thamyai A.Thungsong");

        System.out.println(s1.toString());

        Student s2 = new Student("0002",
                "Girl Saiyai",
                "2222222222222",
                "22/22 T.Thawang A.Muang");

        System.out.println(s2.toString());

        Student s3 = new Student();
        s3 = inputData(s3);
        System.out.println(s3.toString());

    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your student info: ");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Person ID: ");
        s.setPid(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        return s;


    }//inputData
}//class