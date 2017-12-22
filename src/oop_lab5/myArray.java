package oop_lab5;

public class myArray {
    public static void main(String[] args) {
        int []myList;
        myList = new  int[5];
        myList[1] = 20;
        myList[3] = 100;
        myList[2] = myList[1] * 5;
        showArray(myList);
        myList[3 - 1] = 500;
        myList[4] = myList[1 + 2] * 10;
        showArray(myList);
        String[] msg = new String [3];
        System.out.println(msg[0]);
        double[] number = new double[5];
        System.out.println(number[0]);
        char[] c = new  char[5];
        System.out.println(c[0]);

        Integer[]num = new Integer[10];
        System.out.println(num[0]);
        Double[] num2 = new Double[10];
        System.out.println(num2[0]);
    }//main

    private static void showArray(int[] myList) {
        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);
        System.out.println(myList[3]);
        System.out.println(myList[4]);
    }
}//class
