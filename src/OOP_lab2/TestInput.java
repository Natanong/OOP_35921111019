package OOP_lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInput {
    public static void main(String[] args) throws IOException {
    //    BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("What is your name? : ");
        String name = reader.readLine();
        System.out.println("Your name is "+name);
    }//main
}//class
