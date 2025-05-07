package com.gentech.stringassignment;
public class Program2 {
    public static void main(String[] args) {
        pattern();
        pattern2();
    }
    static void pattern(){
        String s="PROGRAM";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    static void pattern2()
    {
        String s="PROGRAM";
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
