package oop_lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class myArray2D {
    public static void main(String[] args) throws IOException {
        //        Array 2D
        int[][] number = new int[2][3];
        number = InputData(number);
        showData(number);
    }//main

    private static void showData(int[][] number) {
        System.out.println("Data in array 2D: ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++)
                System.out.print(number[i][j]+" ");
        }

    }

    private static int[][] InputData(int[][] number) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print("number["+i+"]["+j+"]: ");
                number[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return number;
    }

}//class
