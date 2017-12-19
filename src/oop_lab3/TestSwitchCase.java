package oop_lab3;

import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        switch (number){
            case 1: System.out.println("Your entered 1.");break;
            case 2: System.out.println("Your entered 2.");break;
            case 3: System.out.println("Your entered 3.");break;
            default: System.out.println("Please enter number 1-3.");

        }//switch

    }//main
}//class
