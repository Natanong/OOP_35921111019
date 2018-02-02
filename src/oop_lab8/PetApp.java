package oop_lab8;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("kaya",2);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makeNoise();
    }
}//class
