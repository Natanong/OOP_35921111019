package oop_lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//เขียนโปรแกรมรับค่าจำนวนเต็มจากผู้ใช้ 20 จำนวน จากนั้นห่ข้อมูลดังต่อไปนี้
//1.ผลรวมของข้อมูล
//2.ค่าเฉลี่ย
//3.ค่ามากที่สุด
//4.ค่าน้อยที่สุด
//5.แสดงข้อมูลโดยการเรียงจากมากไปน้อย
//6.แสดงข้อมูลโดยการเรียงจากมากไปน้อย
public class Exercise {
    private static final int MAX = 20;
    private static ArrayList even = new ArrayList();
    private static ArrayList odd = new ArrayList();
    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        num = inputData(num);
        showData(num);
        num = sortData(num);
        validateEvenData(num);  //even
        validateOddDate(num); //odd

        System.out.println("Validate Data in array with Desending order: ");
        showArrayList("even",even);
        showArrayList("odd",odd);
    }//main

    private static Integer[] sortData(Integer[] num) {
        Arrays.sort(num);
        return num;
    }

    private static void showArrayList(String msg, ArrayList data) {
        if (msg.equals("even"))
            System.out.print("Even number: ");
        else
            System.out.print("Odd number: ");
        for (int i=0;i<data.size();i++){
            System.out.print(data.get(i)+" ");
        }
        System.out.println();

    }

    private static void validateOddDate(Integer[] num) {
        for (int i=0;i<num.length;i++){
            if (num[i]%2!=0)
                odd.add(num[i]);
        }
    }

    private static void validateEvenData(Integer[] num) {
        for (int i=0;i<num.length;i++){
            if (num[i]%2==0)
                even.add(num[i]);
        }
    }

    private static void showData(Integer[] num) {
        System.out.println("Data in array: ");

        for(int val: num)
            System.out.print(val+" ");
        System.out.println();
    }

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for(int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }//inputdata

}//class
