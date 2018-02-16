package oop_lab9;

public class personApp {
    public static void main(String[] args) {
        Person person = new Person("Natanong Chaitham", 22,
                new Address("26/1", "Nakhornsithammarat",
                        "80230"),
                new Job("Student", 1000));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(200);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());

    }
}//class
