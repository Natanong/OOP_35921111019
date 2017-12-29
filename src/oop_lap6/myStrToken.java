package oop_lap6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//StringTokenizer
        String msg = "Hello Welcome MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
//countTokens()
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer(myToken.nextToken());
            System.out.print(buffer.reverse()+" ");
        }//while
        int[] count = new int[5];
        for (int i=0;i<msg.length();i++){
            if (msg.charAt(i)=='a')
                count[0]++;
            else if (msg.charAt(i)=='e')
                count[1]++;
            else if (msg.charAt(i)=='i')
                count[2]++;
            else if (msg.charAt(i)=='o')
                count[3]++;
            else if (msg.charAt(i)=='u')
                count[4]++;
        }
        int total =0;
        for (int i=0;i<count.length;i++) {
            total +=count[i];
        }
        System.out.println("\n"+msg);
        System.out.println("Total Vowels is: "+total);
        System.out.println("a: "+count[0]);
        System.out.println("e: "+count[1]);
        System.out.println("i: "+count[2]);
        System.out.println("o: "+count[3]);
        System.out.println("u: "+count[4]);
    }//main
}//class
