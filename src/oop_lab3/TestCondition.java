package oop_lab3;

public class TestCondition {
    public static void main(String[] args) {
        //       if statement
        int x = 5, y = 10;
        if (x > y) {
            System.out.println("x less than y");
            System.out.println("Hello");
        }
        //if-else statement
        if (x > y) System.out.println("x more than y");
        else System.out.println("x less than y");
//         if-else-if
        int z = 100;
        if (z > 100)
            System.out.println("z > 100");
        else if (z < 100)
            System.out.println("z <100 ");
        else
            System.out.println("z = 100");
    }//main
}//class
