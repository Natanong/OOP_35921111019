package oop_lab3;

import java.util.Scanner;

//0-49 = F
//50-59 = D
//60-69 = C
//70-79 = B
//80-100 = A
public class CalGrade {
    public static void main(String[] args) {
        //        Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        //test condition
        if(score<=49) System.out.println("Your grade is F");
        else if (score<=59)System.out.println("Your grade is D");
        else if (score<=69)System.out.println("Your grade is C");
        else if (score<=79)System.out.println("Your grade is B");
        else
            System.out.println("Your grade is A");
    }//main
}//class
