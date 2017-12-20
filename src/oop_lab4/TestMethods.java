package oop_lab4;

public class TestMethods {
    //global variable
    private static int num =10;
// methods
//type 1
    public static void A(){
        System.out.println("Hello A");
    }//A
    //type 2
    public static void B(int x,int y){
        System.out.println("Hello B "+(x+y));
    }//B
    //type 3
    public static int C(int x, int y){
        System.out.println("Hello C");
        return x+y;
    }//C
    public static void main(String[] args) {
        System.out.println("Hello main");
        A();
        B(5,10);
//        manage return value
        C(5,10);
        System.out.println(num);
        System.out.println(C(5,10));
    }//main
}//class
