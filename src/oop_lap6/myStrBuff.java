package oop_lap6;

public class myStrBuff {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer myBuf = new StringBuffer();
        myBuf.append("Hello");
        myBuf.append(" Welcom");
        myBuf.append(" RMUTSV");
        myBuf.append(" "+2017);
        System.out.println(myBuf);
        myBuf.insert(14,"MT");
        System.out.println(myBuf);
        System.out.println(myBuf.length());
        System.out.println(myBuf.capacity());
        System.out.println(myBuf.reverse());





    }//main
}//class
