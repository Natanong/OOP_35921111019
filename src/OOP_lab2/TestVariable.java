package OOP_lab2;

public class TestVariable {
    public static void main(String[] args){
//        Integer
        int i;
        i = 10;
        System.out.println("i = "+i);
        int j = 20;
        System.out.println("j = "+j);
        System.out.println("i+j="+(i+j));
//        Double
        double v = 15.15;
        System.out.println(v);
        System.out.println(v*10);
//        Character
        char c = 'T';
        System.out.println(c);
//        String
        String s = "Hello, World";
        System.out.println(s);
        String name = "I'm AI";
        System.out.println(name);
        String msg = s + " " + name;
        System.out.println(msg);
        String msg2 = s.concat(" "+name);
        System.out.println(msg2);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

//        boolean
        boolean b = true;
        boolean b1 = false;
        System.out.println(b);
        System.out.println(b1);
    }//main

}//class
