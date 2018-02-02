package oop_lab8;

public class Employee {
    private String personID;
    private String name;
    private String address;
    private String gender;
    private String position;
    private String salary;
    private String company;

    public Employee(String personID, String name, String address,
                    String gender, String position, String salary,
                    String company) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
