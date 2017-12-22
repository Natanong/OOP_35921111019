package oop_lab5;

import java.util.Scanner;

public class InputDatatoArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        int number[] = new  int[MAX];
        //System.out.println(number.length);
        //for
        number = inputData(number);
        showData(number);
        ShowDataEnchance(number);
    }//main

    private static void ShowDataEnchance(int[] number) {
        System.out.println("Data in Array: ");
        for (int val:number)
            System.out.print(val+" ");
    }

    private static void showData(int[] number) {
        System.out.println("Data in Array: ");
        for (int i=0; i<number.length; i++)
            System.out.print(number[i]+" ");
    }

    private static int[] inputData(int[] number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for (int i=0; i<number.length; i++){
            System.out.print("number["+i+"]: ");
            number[i] = scanner.nextInt();
        }
        return number;
    }
}//class
