package com.gentech.stringassignment;
public class Program1 {
    public static void main(String[] args) {
        reverse();
        reverse1();
        reverse3();
    }


    static void reverse()
    {
        String s="PROGRAM";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);

        } System.out.println("Reverse using charAt :"+s1);
        System.out.println("----------------------------");
    }
    static void reverse1()
    {
        String s = "Program";
        char ch[] = s.toCharArray();
        System.out.println("Reverse using tocharArray :");
        for (int i = ch.length-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println("----------------------");
    }

    static void reverse3() {
        String s = "PROGRAM";
        String s1 ="";
        System.out.println("Return using SubString :");
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.substring(i,i+1);
        } System.out.println(s1);
    }
}
