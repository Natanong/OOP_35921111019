package oop_lab8;
//Dog is a Pat
//Dog is sub-class
//Pet is super-class
public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");

    }
}
