package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//เขียนโปรแกรมเพื่อรับค่าข้อมูลของนักศึกษาหนึ่งคนโดยมีข้อมูลดังนี้
// 1.ชื่อ-สกุล
// 2.รหัสนักศึกษา
// 3.สาขาที่เรียน และคณะ
// 4.ที่อยู่
// 5.email
//หมายเหตุ:ต้องรับค่าข้อมูลแต่ละข้อมูลโดยการใช้ Methods
public class StudentData {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static String getName() throws IOException {
        System.out.print("Enter your name: ");
        return reader.readLine();
    }//getName
    public static String getAddress() throws IOException {
        System.out.print("Enter your ID: ");
        return reader.readLine();
    }
    public static String getStdID() throws IOException {
        System.out.print("Enter your major : ");
        return reader.readLine();
    }
    public static String getFaculty() throws IOException {
        System.out.print("Enter your address: ");
        return reader.readLine();
    }
    public static String getEmail() throws IOException {
        System.out.print("Enter your email: ");
        return reader.readLine();
    }
    public static void main(String[] args) throws IOException {
        String name = getName();
        String address = getStdID();
        String id = getFaculty();
        String fac = getAddress();
        String email = getEmail();
        System.out.println(name+"\n"+id+"\n"+fac+"\n"
                +address+"\n"+email);
        System.out.println(getName()+"\n"+getStdID());

    }//main
}//class
