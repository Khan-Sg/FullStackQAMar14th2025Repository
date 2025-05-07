package com.gentech.stringassignment;

public class Program4 {
    public static void main(String[] args) {
        count();
    }
    static void count(){
        String s="SG TESTING INSTITUTE";
        int count =0;
        for(int i=0;i<s.length();i++){
            count=count+1;

        }
        System.out.println(count);
    }
}
