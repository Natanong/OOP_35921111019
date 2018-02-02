package oop_lab8;

public class PersonApp {
    public static void main(String[] args) {

        //create object as student
        Student student = new Student("11111111111",
                "Boy Sai Yai",
                "109 M.2 T.Thungsong",
                "Male","STD0001",
                "Information");

        System.out.println(student.toString());
        student.setName("Boy Saiyong");
        System.out.println(student.getName());
        System.out.println(student.toString());
   } //main
}//class
