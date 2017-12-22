package oop_lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
    //    ArrayList
        ArrayList list = new ArrayList();
        String name = "AI";
        list.add(name);
        System.out.println(list);
        list.add("TAK");
        list.add("BOY");
        System.out.println(list);
        list.add(2,"ADAM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("BOY");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("ADAM"));



    }//main
}//Class
