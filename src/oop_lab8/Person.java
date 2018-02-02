package oop_lab8;

public class Person {
    private String personID;
    private String name;
    private String address;
    private String gender;
     //constructor
    public Person(String personID, String name, String address, String gender) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    @Override //ห้ามพิมพ์ลงไปเองโค้ดเออเร้อทันที
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    //getter and setter methods
    public String getPersonID() {
        return personID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getGender() {
        return gender;
    }
}//class
