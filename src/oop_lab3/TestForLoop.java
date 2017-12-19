package oop_lab3;

public class TestForLoop {
    public static void main(String[] args) {
        //for loop
//        for (int i=1;i<=10;i++) {
//            System.out.println("Hello");
//            System.out.println("IS223");
//        }
        for(int i=1;i<=100;i++) {
            if (i%3==0&&i%5==0)
                System.out.print(i + " ");
        }

    }//main
}//class
