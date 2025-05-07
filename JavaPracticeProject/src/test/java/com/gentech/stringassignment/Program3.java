package com.gentech.stringassignment;

public class Program3 {
    public static void main(String[] args) {
        reverse();
    }
    static void reverse(){
        String s="MYSORE AND BANGALORE";
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--) {
            System.out.print(s1[i]+" ");
        }
    }
}