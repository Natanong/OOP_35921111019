package oop_lab7;
//talking about student?
//1. Student ID
//2. Name
//3. person ID
//4. Address
//Access Control
//1. public
//2. private
//3. protected
public class Student {
    //properties of Student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Constrctor
    //default constructor
    public Student(){}
    //create by own
    public Student(String id, String n,String pid,String a){
        //assign data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;
    }
    //getter and setter mathods
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}//class
