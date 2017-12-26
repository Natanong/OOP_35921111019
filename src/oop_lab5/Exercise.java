package oop_lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//เขียนโปรแกรมรับค่าจำนวนเต็มจากผู้ใช้ 20 จำนวน จากนั้นห่ข้อมูลดังต่อไปนี้
//1.ผลรวมของข้อมูล
//2.ค่าเฉลี่ย
//3.ค่ามากที่สุด
//4.ค่าน้อยที่สุด
//5.แสดงข้อมูลโดยการเรียงจากมากไปน้อย
//6.แสดงข้อมูลโดยการเรียงจากมากไปน้อย
public class Exercise {
    private static int MAX = 20;
    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        num = inputData(num);
        Summation(num);
        maxValue(num);
        minValue(num);
        DecendingOrder(num);
        AscendingOrder(num);

    }

    private static void minValue(Integer[] num) {
        System.out.print("The minimum value: ");
        System.out.println(Collections.min(Arrays.asList(num)));
    }

    private static void maxValue(Integer[] num) {
        System.out.print("The maximum value: ");
        System.out.println(Collections.max(Arrays.asList(num)));
        int max = num[0];
        for (int i=0;i<num.length;i++){
            if(max<=num[i])
                max = num[i];
        }
    }

    private static void Summation(Integer[] num) {
        System.out.print("The summation of value in array: ");
        int total = 0;
        for (int val:num)
            total += val;  //total = total+val ;
        System.out.println(total);
        Aeverage(total);

    }

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascending Order: ");
        Arrays.sort(num, Collections.reverseOrder());
        showArray(num);
    }

    private static void DecendingOrder(Integer[] num) {
        System.out.println("Decending Order: ");
        Arrays.sort(num);
        showArray(num);

    }

    private static void showArray(Integer[] num) {
        for (int val:num)
            System.out.print(val+" ");
        System.out.println();
    }
    private static void Aeverage(int total) {
        System.out.println("The avarage value in array: "
                +(total/MAX));
    }
    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("number["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }
}//class
