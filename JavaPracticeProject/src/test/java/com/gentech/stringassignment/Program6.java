package com.gentech.stringassignment;

public class Program6 {
    public static void main(String[] args) {
        numberwords();
    }

    static void numberwords() {
        String s = "Gentech is full stack development institution";
        String s2[]=s.split(" ");
        System.out.println(s2.length);
    }
}