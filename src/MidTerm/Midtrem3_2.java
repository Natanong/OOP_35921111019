package MidTerm;

import java.util.Scanner;

public class Midtrem3_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String getID = getID();
        String getName = getname();
        float getSalary = getSalary();
        float getOverTime = getOverTime();
        calculateTex(getSalary,getOverTime);
        ShowDataInfo(getID,getName,getSalary,getOverTime);

    }//main

    private static void ShowDataInfo(String getID, String getName, float getSalary, float getOverTime) {
        Midtrem3_2 a = new Midtrem3_2();
        System.out.println("ID: "+getID);
        System.out.println("Name: "+getName);
        System.out.println("Salary: "+getSalary);
        System.out.println("OverTime: "+getOverTime);
        System.out.println("Tex is: "+a.calculateTex(getSalary,getOverTime));

    }

    private static float calculateTex(float a, float b) {

        float sum = a+b;
        System.out.println("Salary Total: "+sum);
        if (sum>=100000)
        {
            return (sum*10)/100;
        }


        else if (sum>=70000){
            return (sum*7)/100;
        }
        else if (sum>=50000) {
            return (sum*5)/100;
        }
        else if (sum>=30000) {
            return (sum*3)/100;
        }
        else{
            return (sum*1)/100;
        }

    }
    private static Float getOverTime() {
        System.out.print("Enter your OverTime: ");
        Float getOverTime = scan.nextFloat();
        return getOverTime;
    }

    private static int getSalary() {
        System.out.print("Enter your Salary: ");
        int getSalary = scan.nextInt();
        return getSalary;
    }

    private static String getname() {
        System.out.print("Enter your Name: ");
        String getName = scan.nextLine();
        return getName;
    }

    private static String getID() {
        System.out.print("Enter your ID: ");
        String getID = scan.nextLine();
        return getID;
    }
}//class
