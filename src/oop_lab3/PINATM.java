package oop_lab3;

import java.util.Scanner;

public class PINATM {
    public static void main(String[] args) {
        String PIN = "1234";
        String input;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Enter your PIN: ");
            input = scanner.nextLine();
            if(input.equals(PIN))
            {
                System.out.println("Welcome.");
                break;
            }
            else {
                count++;
                if(count ==3) {
                    System.out.println("Locked.");
                    break;
                }
            }
        } while (!input.equals(PIN));
    }//main
}//class
